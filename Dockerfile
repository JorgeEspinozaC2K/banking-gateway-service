FROM openjdk:8-jdk-slim
COPY "./target/banking-gateway-service-0.1.jar" "gateway-service.jar"
ENTRYPOINT ["java","-jar","gateway-service.jar"]