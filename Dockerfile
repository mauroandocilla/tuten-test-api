FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 8085
ADD build/libs/utc-0.0.1-SNAPSHOT.jar utc.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/utc.jar"]
