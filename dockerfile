FROM adoptopenjdk/openjdk11:jre-11.0.9.1_1-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]