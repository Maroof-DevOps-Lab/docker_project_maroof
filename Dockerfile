# Step 1: Use an official OpenJDK base image
FROM openjdk:17-jdk-slim

# Step 2: Set working directory inside container
WORKDIR /app

# Step 3: Copy the built jar file from target folder to container
COPY target/dockerapp-1.0.0.jar app.jar

# Step 4: Expose port 8080 to access the app
EXPOSE 8080

# Step 5: Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
