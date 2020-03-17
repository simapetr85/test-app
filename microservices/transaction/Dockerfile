# Download Maven
FROM maven:3.6.2-jdk-11
WORKDIR /app

COPY ./target/*.jar app.jar

# When docker container start it will run this command 
ENTRYPOINT ["java","-jar","app.jar"]
