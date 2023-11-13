FROM openjdk:11.0.11-jre-slim
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} product-service-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/product-service-0.0.1-SNAPSHOT.jar"]