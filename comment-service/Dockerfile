FROM java:8

EXPOSE 8083

ADD target/comments-data-service.jar comments-data-service.jar

ENTRYPOINT ["java","-jar","comments-data-service.jar"]