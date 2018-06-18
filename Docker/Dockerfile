FROM openjdk:8-jdk-alpine
MAINTAINER Swapnil Patil<Swapnil.patil1682@gmail.com>
#RUN apt-get update
VOLUME /tmp
COPY target/spring-app-1.0-SNAPSHOT.jar /tmp
EXPOSE 9100 9002 8080
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/tmp/spring-app-1.0-SNAPSHOT.jar"]
