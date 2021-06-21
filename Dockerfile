FROM adoptopenjdk/openjdk8
WORKDIR /
ARG ProductRequestedService-0.0.1-SNAPSHOT.jar
ADD ProductRequestedService-0.0.1-SNAPSHOT.jar /app.jar
EXPOSE 8400
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]