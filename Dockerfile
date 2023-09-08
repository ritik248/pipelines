FROM openjdk:17
EXPOSE 8084
ADD target/springbootcicd-0.0.1-SNAPSHOT.jar springbootcicd-0.0.1-SNAPSHOT.jar
ENTRYPOINT [ "java","-jar","/springbootcicd-0.0.1-SNAPSHOT.jar" ]