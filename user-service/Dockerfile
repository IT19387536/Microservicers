FROM java:8

EXPOSE 8081

ADD target/user-item-service.jar user-item-service.jar

ENTRYPOINT ["java","-jar","user-item-service.jar"]