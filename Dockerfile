

FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG target/gs-spring-boot-docker-0.1.0.jar
COPY target/gs-spring-boot-docker-0.1.0.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]