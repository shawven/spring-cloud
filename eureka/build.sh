#!/usr/bin/env bash

mvn package -Dmaven.test.skip=true
docker build -t eureka:latest .
