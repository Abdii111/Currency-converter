# Steg 1: Bygg med Java 17
FROM maven:3.9.4-eclipse-temurin-17 AS builder
WORKDIR /app
COPY . .
RUN mvn clean package

# Steg 2: Kör med Java 17 runtime
FROM eclipse-temurin:17-jre
WORKDIR /app
COPY --from=builder /app/target/*-jar-with-dependencies.jar app.jar
CMD ["java", "-jar", "app.jar"]
