#!/bin/bash

set -e

rm -rf dist
mkdir -p dist
./node_modules/.bin/lessc --no-ie-compat lib/bekk.less > dist/bekk.css