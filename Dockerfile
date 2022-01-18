FROM openjdk:8
EXPOSE 8080
ADD target/employee.jar employee.jar
ENTRYPOINT ["java", "-jar", "employee.jar"]