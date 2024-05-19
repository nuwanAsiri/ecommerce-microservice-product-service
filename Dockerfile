FROM openjdk:17-jdk-alpine
VOLUME /tmp
COPY target/product-service-1.0-SNAPSHOT.jar product-service.jar
ENTRYPOINT ["java","-jar","/product-service.jar"]
