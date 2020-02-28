#!/bin/bash

if [ ! -d "cs1302-demos-lambdas" ]; then
  git clone --depth 1 --no-checkout https://github.com/cs1302uga/cs1302-demos.git cs1302-demos-lambdas
  cd cs1302-demos-lambdas
  git checkout master -- lambdas
  rm -f lambdas/setup.sh
  mv lambdas/.gitignore ./
  mv lambdas/* ./
  rm -rf lambdas
  rm -rf .git
  mkdir bin doc
  chmod u+x compile.sh
  git init
  git add README.md .gitignore compile.sh src
  git commit -m "initial commit"
  echo "subdirectory cs1302-demos-lambdas successfully created"
  echo "TODO:"
  echo " - create src/cs1302/lambdas/Container.java"
  echo " - update src/cs1302/lambdas/Driver.java"
  echo " - compile.sh provided for convenience"
  echo " - procced per the notes"
else
  >&2 echo "subdirectory cs1302-demos-lambdas already exists"
fi
