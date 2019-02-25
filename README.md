# Testatoo Html5 Bundle

[![CircleCI](https://circleci.com/gh/Testatoo/testatoo-html5-bundle.svg?style=svg)](https://circleci.com/gh/Testatoo/testatoo)
[![Gitter chat](https://badges.gitter.im/gitterHQ/gitter.png)](https://gitter.im/Ovea/testatoo)
[![codecov](https://codecov.io/gh/Testatoo/testatoo-html5-bundle/branch/master/graph/badge.svg)](https://codecov.io/gh/Testatoo/testatoo)
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)

![TEstatoo Logo](logo.svg "Testatoo")

## Downloading

Latest bundle version is available on [Maven Central](https://repo.maven.apache.org/maven2/org/testatoo/testatoo-html5-bundle/)

    <dependency>
      <groupId>org.testatoo</groupId>
      <artifactId>testatoo-html5-bundle</artifactId>
      <version>1.0.b5</version>
      <scope>test</scope>
    </dependency>

## Building

### Prerequisites

#### Java 1.8+

You need version **1.8** and more of the Java JDK installed

    $ java -version
    java version "1.8.0_151"
    ...
    
### Installation Steps

    $ git clone https://github.com/Ovea/testatoo-html5-bundle
    $ cd testatoo

### Install browsers

    - Install Firefox
    - Install Chrome
    - Install Edge / Safari

If you don't want to install Browser and driver you can use docker images

    - docker run -d -p 4444:4444 selenium/standalone-firefox
    or
    - docker run -d -p 4444:4444 selenium/standalone-chrome

In your Terminal

    $ mvn clean install  // Test on Chrome by default
    // With docker container usage
    $ mvn clean install -Dremote -Pfirefox