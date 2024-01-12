FROM openjdk:8-jdk-alpine
#VOLUME /tmp
ADD target/springcicd.jar app.jar
#RUN chmod 777 
ENTRYPOINT ["java","-jar","app.jar"]
EXPOSE 2222
