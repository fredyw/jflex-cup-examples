#!/bin/bash

set -e

tools/jflex/bin/jflex -d src/main/java/jflexcup/generated src/main/resources/example.flex
java -cp /home/fwijaya/data/github/jflex-cup-examples:tools/cup/lib/java-cup-11b.jar java_cup.Main -destdir src/main/java/jflexcup/generated -parser ExampleParser -symbols ExampleSymbols < src/main/resources/example.cup
