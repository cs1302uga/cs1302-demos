#!/bin/bash -ex

rm -rf bin/*
mkdir -p bin
javac -d bin src/cs1302/Utility.java
javac -d bin -cp bin src/cs1302/lambdas/Shape.java
javac -d bin -cp bin src/cs1302/lambdas/Ellipse.java
javac -d bin -cp bin src/cs1302/lambdas/Circle.java
javac -d bin -cp bin src/cs1302/lambdas/Rectangle.java
javac -d bin -cp bin src/cs1302/lambdas/Square.java
javac -d bin -cp bin src/cs1302/lambdas/Driver.java
checkstyle -c cs1302_checks.xml src
java -cp bin cs1302.lambdas.Driver
