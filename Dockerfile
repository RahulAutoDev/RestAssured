FROM openjdk:8
ADD target/RestAssuredAPIAutomation1.jar RestAssuredAPIAutomation1.jar
ENTRYPOINT ["java", "-jar","RestAssuredAPIAutomation1.jar"]
