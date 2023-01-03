FROM openjdk:8
EXPOSE 8080
ADD target/cicd.docker.githubactionsdemo.jar cicd.docker.githubactionsdemo.jar
ENTRYPOINT ["java", "-jar", "/cicd.docker.githubactionsdemo.jar"]