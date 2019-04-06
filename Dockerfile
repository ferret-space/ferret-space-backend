FROM openjdk:8-jdk

VOLUME /tmp

COPY build/libs/* /app.jar

ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app.jar"]