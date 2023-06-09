# sasLang

sasLang is a Meta Attack Language (MAL) for Substation Automation Systems (SAS). The language is an extension of coreLang and icsLang found at https://github.com/mal-lang. 

This project has the following structure:

* The file `pom.xml` is the Maven configuration file of the project.
* The directory `src/main/mal` contains the MAL specification
  `sasLang.mal`, which is the MAL specification of sasLang.
* The directory `src/main/resources/icons` contains SVG icons for the
  assets in sasLang.
* The directory `src/test/java/org/mal_lang/saslang/test`
  contains the unit tests of sasLang.

## Apache Maven

[Apache Maven](https://maven.apache.org/) is a build tool and
dependency management tool for Java projects. You can read more about
Maven at <https://en.wikipedia.org/wiki/Apache_Maven>. Follow the
instructions at <https://maven.apache.org/download.cgi> to download
Maven, and follow the instructions at
<https://maven.apache.org/install.html> to install Maven.

## Building sasLang and running the unit tests

The
[MAL compiler](https://github.com/meta-attack-language/malcompiler)
compiles MAL specifications (`.mal` files) into different formats,
using different backends. The reference backend generates Java code
that is suitable for testing purposes and evaluating your language.
The securiCAD backend generates a `.jar` file that can be used with
[foreseeti](https://www.foreseeti.com/)'s products, including
[securiCAD](https://www.foreseeti.com/securicad/), which is a tool
that can be used to graphically create models using your language and
to simulate attacks on those models.

### Building with the reference backend and running the unit tests

To compile sasLang with the reference backend of the MAL compiler
and then run the unit tests, execute the following command from the
`sasLang` directory:

```
mvn test
```

This will invoke the MAL compiler's reference backend to generate
`.java` files under `target/generated-test-sources`. These `.java`
files and the unit tests in `src/test/java` will then be compiled
into `.class` files under `target/test-classes`. The unit tests will
then finally be executed.

To only compile sasLang into `.java` files, execute the following
command:

```
mvn generate-test-sources
```

To compile sasLang into `.java` files and then compile these
`.java` files and the unit tests in `src/test/java` into `.class`
files, execute the following command:

```
mvn test-compile
```

To run a specific test class, execute the following command:

```
mvn test -Dtest=TestsasLang
```

Where `TestsasLang` is the test class.

To run a specific test method in a test class, execute the following
command:

```
mvn test -Dtest=TestsasLang#TEST
```

Where `TestsasLang` is the test class and `TEST` is the
test method.

### Building a securiCAD compatible .jar file

To build a securiCAD compatible `.jar` file, you need access to
foreseeti's maven repository. To request access, please contact
<support@foreseeti.com>. When you have received your credentials, you
can store them in a file `~/.aws/credentials`
(`%UserProfile%\.aws\credentials` on windows). For example:

```
[default]
aws_access_key_id=AKIAIOSFODNN7EXAMPLE
aws_secret_access_key=wJalrXUtnFEMI/K7MDENG/bPxRfiCYEXAMPLEKEY
```

To compile sasLang with the securiCAD backend of the MAL
compiler, execute the following command:

```
mvn package -PsecuriCAD
```

The resulting `.jar` file will be located in
`target/sasLang-1.0.0.jar`.

If you don't want to run the unit tests when building a securiCAD
compatible `.jar` file, execute the following command:

```
mvn clean package -PsecuriCAD -Dmaven.test.skip=true
```

## License

Copyright © 2020 sasLang contributors

All files distributed in the sasLang project are licensed under the [Apache License, Version 2.0](https://www.apache.org/licenses/LICENSE-2.0).
See [`LICENSE`](LICENSE) and [`NOTICE`](NOTICE) for details.

- - - -
This is a project run by the [Software Systems Architecture and Security reseach
group](https://www.kth.se/nse/research/software-systems-architecture-and-security/)
within the [Division of Network and Systems Engineering](https://kth.se/nse) at
the Department of Computer Science at the School of [Electrical Engineering and
Computer Science](https://www.kth.se/en/eecs) @ [KTH university](https://www.kth.se).

For more of our projects, see the [SSAS page at
github.com](https://github.com/KTH-SSAS).
