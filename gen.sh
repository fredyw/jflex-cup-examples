#!/bin/bash

set -e

tools/jflex/bin/jflex -d src/main/java/jflexcup/generated src/main/resources/example.flex
