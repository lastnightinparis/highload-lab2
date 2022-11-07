FROM openjdk:17-alpine
RUN mkdir /app
WORKDIR /app
COPY target/eureka-server-0.0.1-SNAPSHOT.jar /app
ENTRYPOINT ["java", "-jar", "/app/eureka-server-0.0.1-SNAPSHOT.jar", "--spring.profiles.active=docker"]
EXPOSE 8761