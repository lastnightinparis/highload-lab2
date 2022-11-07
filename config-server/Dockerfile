FROM openjdk:17-alpine
RUN apk add --no-cache openssl

ENV DOCKERIZE_VERSION v0.6.1
RUN wget https://github.com/jwilder/dockerize/releases/download/$DOCKERIZE_VERSION/dockerize-alpine-linux-amd64-$DOCKERIZE_VERSION.tar.gz \
    && tar -C /usr/local/bin -xzvf dockerize-alpine-linux-amd64-$DOCKERIZE_VERSION.tar.gz \
    && rm dockerize-alpine-linux-amd64-$DOCKERIZE_VERSION.tar.gz
RUN mkdir /app
WORKDIR /app
COPY target/config-server-0.0.1-SNAPSHOT.jar /app
VOLUME /app/config
ENTRYPOINT ["dockerize", "-timeout", "5m", "-wait", "tcp://eureka-server:8761", "java", "-jar", "/app/config-server-0.0.1-SNAPSHOT.jar", "--spring.profiles.active=native"]
EXPOSE 8100