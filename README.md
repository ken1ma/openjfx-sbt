# Runtime Environment

1. Oracle Java 1.8.0_191


# Development Environment

1. sbt-1.2.7


# Frequently Used Commands

1. Run from sbt

		sbt:openjfx-sbt> run

2. Build the fat jar with all the dependencies, and run it

		$ sbt assembly
		$ java -jar target/scala-2.12/openjfx-sbt-assembly-0.0.8.jar
