FROM openjdk:8-jdk-alpine
MAINTAINER Swapnil Patil<Swapnil.patil1682@gmail.com>
VOLUME /tmp
COPY target/spring-app-1.0-SNAPSHOT.jar /tmp
EXPOSE 8080
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/tmp/spring-app-1.0-SNAPSHOT.jar"]
