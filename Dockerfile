FROM openjdk:8
EXPOSE 8080
ENTRYPOINT ["java","-jar","/ibm-cloud-demo-cf.jar"]