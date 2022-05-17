FROM java:8

EXPOSE 8083

ADD target/docker-ratingProduct.jar docker-ratingProduct.jar

ENTRYPOINT ["java","-jar","docker-ratingProduct.jar"]