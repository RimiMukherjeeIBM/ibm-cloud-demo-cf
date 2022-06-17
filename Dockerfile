FROM openjdk:8
EXPOSE 8080
ADD ibm-cloud-demo.jar ibm-cloud-demo.jar
ENTRYPOINT ["java","-jar","/ibm-cloud-demo.jar"]