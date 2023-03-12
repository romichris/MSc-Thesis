# apache-example

An example repo showing how repos under the MAL umbrella can and should be licensed.

[Apache 2.0](https://www.apache.org/licenses/LICENSE-2.0) is the license of choice as it is perhaps the most clear and safe permissive open source license to use for anyone wanting to build derivative work on top of MAL.
It is also considered compatible for use in GPLv3 projects.

## Contents of a Properly Licensed Repository / Project

| File | Content |
|---|---|
| [`LICENSE`](LICENSE) | Verbatim copy of the Apache 2.0 license. |
| [`NOTICE`](NOTICE) | A file containing the list of copyright holders of the repository (in this example [Foreseeti AB](https://foreseeti.com)) and a list of attributions and copyright info of any additional material included in the repo. |
| [`README.md`](README.md) | A README containing the same information as [`NOTICE`](NOTICE) with prettier formatting. |
| [`hello.py`](hello.py) | An original source file containing a copyright header listing all authors that have contributed to the file. It may seem cumbersome to have each source file marked this way, but this makes individual files self-contained and easy to include in other projects.<br>Add the header in a block comment suitable for your language. |

## Including Other Copyrighted Material in a Project

Sometimes other copyrighted material needs to be included in a project, for example icons in a MAL language.
[Creative Commons Attribution (CC BY)](https://creativecommons.org/licenses/by/4.0/) is the license of choice for images and similar material.

Including material licensed under the CC BY license in your project makes your project as a whole licensed under both the Apache 2.0 license and the CC BY license.
The files `LICENSE`, `NOTICE`, and `README.md` need to be updated to reflect this.
A complete example of this can be found in [exampleLang](https://github.com/mal-lang/exampleLang).
It should be clear which files in your project are licensed under which license.

## A Note on Copyright

You own what you write - sometimes.
In many other cases (like the author of this README) the work is done on behalf of an organization that, by agreement, owns the result.

It is best to be clear on who you are contributing as.

## A Note on Licensing

Open source licensing is a vast and complex field so be prepared to spend time if you want to master it.

In cases when you are the original author, you are clear on who you are contributing as and you're having a mandate to open-source your work, everything should be peachy.

Be careful if you include the work of others as you have to stay compliant with the license of that work and do all necessary licensing and attribution steps to comply with it.

It doesn't matter if you are copying whole files including licensing headers or copy/pasting snippets (discouraged) into your project - the rules still apply.

## License

Copyright © 2021-2022 [Foreseeti AB](https://foreseeti.com)

Licensed under the [Apache License, Version 2.0](https://www.apache.org/licenses/LICENSE-2.0).
