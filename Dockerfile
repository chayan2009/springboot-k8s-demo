FROM openjdk:21
EXPOSE 8080
ADD target/springboot-k8s-demo-0.0.1-SNAPSHOT.jar springboot-k8s-demo.jar
ENTRYPOINT ["java", "-jar", "/springboot-k8s-demo.jar"]
