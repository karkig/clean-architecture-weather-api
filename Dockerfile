FROM openjdk:8
ADD target/weather-details.jar weather-details.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar","weather-details.jar"]
