FROM openjdk:17
VOLUME /tmp
EXPOSE 8080
ADD target/crabe-0.0.1-SNAPSHOT.jar crabe-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/crabe-0.0.1-SNAPSHOT.jar"]