FROM openjdk:8
EXPOSE 8080
ADD target/ibm-cloud-demo-0.0.1-SNAPSHOT.jar ibm-cloud-demo.jar
ENTRYPOINT ["java","-jar","/ibm-cloud-demo.jar"]