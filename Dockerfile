FROM openjdk:8
ADD target/RestAssuredAPIAutomation.jar RestAssuredAPIAutomation.jar
ENTRYPOINT ["java", "-jar","RestAssuredAPIAutomation.jar"]
EXPOSE 8080
