FROM eclipse-temurin:21-jdk
WORKDIR /
COPY gradle gradle
COPY build.gradle.kts .
COPY settings.gradle.kts .
COPY gradlew .
COPY ./src src
COPY ./config config

RUN ./gradlew --no-daemon --stacktrace dependencies
RUN ./gradlew --no-daemon --stacktrace build -x test

ENV JAVA_OPTS="-Xmx3072M -Xms2048M"
EXPOSE 8080

CMD java -jar build/libs/DomidzeBot-0.0.1-SNAPSHOT.jar
