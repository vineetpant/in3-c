#!/bin/sh

cd ../build
cmake -LAH .. | awk -f ../docs/options.awk > ../docs/1_install.md