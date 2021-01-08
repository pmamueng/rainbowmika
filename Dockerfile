FROM java:8
WORKDIR /app
COPY target/rainbowmika-0.0.3-SNAPSHOT.jar /app/rainbowmika-app.jar
ENTRYPOINT ["java","-jar","rainbowmika-app.jar"]