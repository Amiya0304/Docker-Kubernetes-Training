# Use OpenJDK 17 as base image
FROM eclipse-temurin:17-jdk-jammy

# Set working directory
WORKDIR /app

# Copy source code
COPY /src /app/src

# Compile the Java code
RUN javac /app/src/HelloServer.java

# Expose port 8080
EXPOSE 8080

# Run the application
CMD ["java", "-cp", "/app/src", "HelloServer"]