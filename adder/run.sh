#! /bin/sh

# test
gradle test
# test reports are generated in "build/reports/tests".

# generate jar file
gradle jar
# "build/libs/adder.jar" is generated.
