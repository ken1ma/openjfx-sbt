# Runtime Environment

1. Oracle Java 11.0.1


# Development Environment

1. sbt-1.2.7

2. The JavaFX SDK for the platform

	1. Set the environment variable `JAVAFX_LIB`, for example

			$ export JAVAFX_LIB=~/Downloads/javafx-sdk-11.0.1/lib


# Frequently Used Commands

1. Run from sbt

		sbt:openjfx-sbt> run

2. Build the fat jar, and run it

		$ sbt assembly
		$ java --module-path $JAVAFX_LIB --add-modules=javafx.controls -jar target/scala-2.12/openjfx-sbt-assembly-0.0.11.jar

	1. [The fat jar does not work with JavaFX 11](https://stackoverflow.com/a/52571719)

3. Package the modules

		$ rm -rf target/gui; jlink --output target/gui --module-path target/scala-2.12/openjfx-sbt-assembly-0.0.11.jar:$JAVAFX_LIB --add-modules=gui --launcher command=gui/gui.HelloWorld

	1. Avoid "Graphics Device initialization failed for :  es2, sw" when running `target/gui/bin/command`

			$ cp $JAVAFX_LIB/*.dylib target/gui/lib


# Futher Readings

1. javapackager
	1. https://medium.com/@adam_carroll/java-packager-with-jdk11-31b3d620f4a8
