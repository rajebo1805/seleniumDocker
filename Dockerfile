FROM openjdk:8u191-jre-alpine3.9
WORKDIR '/app'
RUN apk add curl jq
ADD target/learn2206.jar ./learn2206.jar
ADD target/learn2206-tests.jar ./learn2206-tests.jar
ADD target/libs ./libs
ADD sample.xml ./sample.xml
ADD healthcheck.sh ./healthcheck.sh
RUN dos2unix healthcheck.sh
ENTRYPOINT sh healthcheck.sh