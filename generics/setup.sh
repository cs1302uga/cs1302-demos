#!/bin/bash

if [ ! -d "cs1302-demos-generics" ]; then
  git clone --depth 1 --no-checkout https://github.com/cs1302uga/cs1302-demos.git cs1302-demos-generics
  cd cs1302-demos-generics
  git checkout master -- generics
  rm -f generics/setup.sh
  mv generics/.gitignore ./
  mv generics/* ./
  rm -rf generics
  rm -rf .git
  rm -f src/cs1302/generics/Container.java
  mkdir bin doc
  chmod u+x compile.sh
  git init
  git add README.md .gitignore compile.sh src 
  git commit -m "initial commit"
  echo "subdirectory cs1302-demos-generics successfully created"
  echo "TODO:"
  echo " - create src/cs1302/generics/Container.java"
  echo " - update src/cs1302/generics/Driver.java"
  echo " - procced per the notes"
else
  >&2 echo "subdirectory cs1302-demos-generics already exists"
fi  
