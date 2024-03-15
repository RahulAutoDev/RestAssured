FROM openjdk:8
ADD target/RestAssuredAPIAutomation-0.0.1-SNAPSHOT.jar RestAssuredAPIAutomation-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar","RestAssuredAPIAutomation-0.0.1-SNAPSHOT.jar"]
EXPOSE 8080
