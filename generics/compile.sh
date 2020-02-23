#!/bin/bash -ex

rm -rf bin/*
mkdir -p bin
javac -d bin src/cs1302/Utility.java
javac -d bin -cp bin src/cs1302/generics/ObjectContainer.java
javac -d bin -cp bin src/cs1302/generics/Driver.java
checkstyle -c cs1302_checks.xml src
java -cp bin cs1302.generics.Driver
