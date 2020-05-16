#!/bin/bash
echo "start clean image"
docker rmi demo:v1
echo "start build image"
mvn clean package -T 2
cd ../../image/ && docker build -t demo:v1 . --no-cache