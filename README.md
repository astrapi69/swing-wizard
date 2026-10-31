# Overview

<div style="text-align: center">

[![Java CI with Gradle](https://github.com/astrapi69/swing-wizard/actions/workflows/gradle.yml/badge.svg)](https://github.com/astrapi69/swing-wizard/actions/workflows/gradle.yml)
[![Coverage Status](https://codecov.io/gh/astrapi69/swing-wizard/branch/develop/graph/badge.svg)](https://codecov.io/gh/astrapi69/swing-wizard)
[![Open Issues](https://img.shields.io/github/issues/astrapi69/swing-wizard.svg?style=flat)](https://github.com/astrapi69/swing-wizard/issues)
[![Maven Central](https://img.shields.io/maven-central/v/io.github.astrapi69/swing-wizard)](https://central.sonatype.com/artifact/io.github.astrapi69/swing-wizard)
[![Javadocs](https://javadoc.io/badge2/io.github.astrapi69/swing-wizard/javadoc.svg)](http://www.javadoc.io/doc/io.github.astrapi69/swing-wizard)
[![MIT license](http://img.shields.io/badge/license-MIT-brightgreen.svg?style=flat)](http://opensource.org/licenses/MIT)
[![Donate](https://img.shields.io/badge/donate-❤-ff2244.svg)](https://www.paypal.com/cgi-bin/webscr?cmd=_s-xclick&hosted_button_id=GVBTWLRAZ7HB8)

</div>

a simple swing wizard panel.

> Please support this project by simply putting a Github <!-- Place this tag where you want the button to render. -->
<a class="github-button" href="https://github.com/astrapi69/swing-wizard" data-icon="octicon-star" aria-label="Star astrapi69/swing-wizard on GitHub">Star ⭐</a>
>
> Share this library with friends on Twitter and everywhere else you can
>
> If you love this project [![donation](https://img.shields.io/badge/donate-❤-ff2244.svg)](https://www.paypal.com/cgi-bin/webscr?cmd=_s-xclick&hosted_button_id=GVBTWLRAZ7HB8)

## Note

No animals were harmed in the making of this library.

## License

The source code comes under the liberal MIT License, making swing-wizard great for all types of
applications.

## Import dependencies to your project

<details>
  <summary>gradle (click to expand)</summary>

## gradle dependency

Replace the variable ${latestVersion} with the current latest version: [![Maven Central](https://img.shields.io/maven-central/v/io.github.astrapi69/swing-wizard)](https://central.sonatype.com/artifact/io.github.astrapi69/swing-wizard)

You can first define the version in the ext section and add than the following gradle dependency to
your project `build.gradle` if you want to import the core functionality of swing-wizard:

define version in file gradle.properties

```
swingWizardVersion=${latestVersion}
```

or in build.gradle ext area

```
    swingWizardVersion = "${latestVersion}"
```

then add the dependency to the dependencies area

```
    implementation("io.github.astrapi69:swing-wizard:$swingWizardVersion")
```

# with new libs.versions.toml file

If you use the new libs.versions.toml file for new automatic catalog versions update

```
[versions]
swing-wizard-version=${latestVersion}

[libraries]
swing-wizard = { module = "io.github.astrapi69:swing-wizard", version.ref = "swing-wizard-version" }
```
then add the dependency to the dependencies area

```
    implementation libs.swing.wizard
```
</details>

<details>
  <summary>Maven (click to expand)</summary>

## Maven dependency

The library is on Maven Central. Check out [Maven Central](https://central.sonatype.com/artifact/io.github.astrapi69/swing-wizard) for the latest release.

Add the following maven dependency to your project `pom.xml` if you want to import the core
functionality of swing-wizard:

Then you can add the dependency to your dependencies:

    <properties>
        ...
```xml
        <!-- swing-wizard version -->
        <swing-wizard.version>${latestVersion}</swing-wizard.version>
```
        ...
    </properties>
        ...
        <dependencies>
        ...
```xml
            <!-- swing-wizard DEPENDENCY -->
            <dependency>
                <groupId>io.github.astrapi69</groupId>
                <artifactId>swing-wizard</artifactId>
                <version>${swing-wizard.version}</version>
            </dependency>
```
        ...
        </dependencies>
</details>


<details>
  <summary>Snapshots (click to expand)</summary>

## 📸 Snapshots

This section describes how to import snapshot versions into your project.
Add the following code snippet to your gradle file in the repositories section:
```
repositories {
   //...
```
```groovy
    maven {
        name "Central Portal Snapshots"
        url "https://central.sonatype.com/repository/maven-snapshots/"
        mavenContent {
            snapshotsOnly()
        }
    }
```
```
}
```
</details>

## Support this project

If swing-wizard is useful to you, a star on [GitHub](https://github.com/astrapi69/swing-wizard) helps others find it.
Sharing it or reporting a bug helps just as much.

If you would like to contribute financially, the channels are on the repository's Sponsor button, which
reads [.github/FUNDING.yml](.github/FUNDING.yml): GitHub Sponsors, Liberapay, Ko-fi and PayPal.

## Semantic Versioning

The versions of swing-wizard are maintained with the Semantic Versioning guidelines.

Release version numbers will be incremented in the following format:

`<major>.<minor>.<patch>`

For detailed information on versioning you can visit
the [wiki page](https://github.com/lightblueseas/mvn-parent-projects/wiki/Semantic-Versioning).

## Want to Help and improve it? ###

The source code for swing-wizard are on GitHub. Please feel free to fork and send pull requests!

Create your own fork
of [astrapi69/swing-wizard/fork](https://github.com/astrapi69/swing-wizard/fork)

To share your
changes, [submit a pull request](https://github.com/astrapi69/swing-wizard/pull/new/develop).

Don't forget to add new units tests on your changes.

## Contacting the Developers

Do not hesitate to contact the swing-wizard developers with your questions, concerns, comments, bug
reports, or feature requests.

- Feature requests, questions and bug reports can be reported at
  the [issues page](https://github.com/astrapi69/swing-wizard/issues).
