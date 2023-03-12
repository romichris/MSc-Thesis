#!/bin/bash
#
# Deploy a jar, source jar, and javadoc jar to Sonatype's snapshot repo.
#
# Adapted from https://coderwall.com/p/9b_lfq and
# https://benlimmer.com/2013/12/26/automatically-publish-javadoc-to-gh-pages-with-travis-ci/

SLUG="mal-lang/javapoet"
JDK="openjdk11"
BRANCH="master"

set -e

if [ "$TRAVIS_REPO_SLUG" != "$SLUG" ]; then
  echo "Skipping snapshot deployment: wrong repository. Expected '$SLUG' but was '$TRAVIS_REPO_SLUG'."
elif [ "$TRAVIS_JDK_VERSION" != "$JDK" ]; then
  echo "Skipping snapshot deployment: wrong JDK. Expected '$JDK' but was '$TRAVIS_JDK_VERSION'."
elif [ "$TRAVIS_PULL_REQUEST" != "false" ]; then
  echo "Skipping snapshot deployment: was pull request."
elif [ "$TRAVIS_BRANCH" != "$BRANCH" ]; then
  echo "Skipping snapshot deployment: wrong branch. Expected '$BRANCH' but was '$TRAVIS_BRANCH'."
else
  echo "Deploying snapshot..."
  echo use-agent >> ~/.gnupg/gpg.conf
  echo pinentry-mode loopback >> ~/.gnupg/gpg.conf
  echo allow-loopback-pinentry >> ~/.gnupg/gpg-agent.conf
  echo RELOADAGENT | gpg-connect-agent &> /dev/null
  export GPG_TTY=$(tty)
  echo $GPG_SECRET_KEYS | base64 --decode 2> /dev/null | $GPG_EXECUTABLE --import --no-tty --batch --yes &> /dev/null
  echo $GPG_OWNERTRUST | base64 --decode 2> /dev/null | $GPG_EXECUTABLE --import-ownertrust --no-tty --batch --yes &> /dev/null
  mvn clean deploy --settings=".buildscript/settings.xml" -Pdeploy -Dmaven.test.skip=true
  echo "Snapshot deployed!"
fi
