FROM openjdk:21-jdk

WORKDIR /app

COPY build/libs/soap-server-0.0.1-SNAPSHOT.jar /app/soap-server.jar

ENTRYPOINT ["java", "-jar", "/app/soap-server.jar"]

EXPOSE 9090
