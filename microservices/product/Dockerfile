# Download Maven
FROM maven:3.6.2-jdk-11
WORKDIR /app

# Copy project
COPY . /app

# Building
RUN mvn package

# When docker container start it will run this command 
ENTRYPOINT ["java","-jar","target/product-0.0.1-SNAPSHOT.jar"]
