# Graal Native Starter

[![Build Status](https://travis-ci.com/abbasdgr8/ticketing-search-app.svg?token=sVudbeziXANtkqKLaFRM&branch=master)](https://travis-ci.com/abbasdgr8/graal-kotlin-starter)
[![GitHub license](https://img.shields.io/badge/license-Apache%20License%202.0-blue.svg?style=flat)](https://www.apache.org/licenses/LICENSE-2.0)


Kotlin CLI application that generates a cross-platform native executable using GraalVM

#### Generated Artifact is confirmed to be working on all three platforms
- Linux X 64
- MacOS X 64
- Ming X 64

## Running the executable
```bash
# Usage (Linux & Mac)
$ ./cli-executable

# Usage (Windows)
$ .\cli-executable
```

## Setup
You are required to do this only if you wish to view/modify the source of the application and build and package it again.
### Pre-Requisites
- JDK ==> 8
- Gradle ==> 6.8
- Kotlin ==> 1.5.21
- GraalVM / Native Image ==> 20.0.0

Ensure that your system-level JDK is pointing to GraalVM. Verify this by doing `java -version`

### Installation
```bash
# Clone the repo
$ git clone git@github.com:abbasdgr8/graal-kotlin-starter.git

# Change into the directory
$ cd graal-native-executable

# Initiate the gradle build
$ ./gradlew clean build
```

### Packaging
```bash
# Build cross-platform executable from generated jar
$ $GRAALVM_HOME/bin/native-image --report-unsupported-elements-at-runtime -jar build/libs/graal-native-executable-1.0-SNAPSHOT.jar cli-executable --enable-url-protocols=http --no-server
```

## Notes
If you plan to add Java Reflection based libraries to this application, they may not play well with GraalVM.