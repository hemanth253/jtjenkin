FROM openjdk:8
EXPOSE 8080
ADD target/jtjenkin-integration.jar jtjenkin-integration.jar
ENTRYPOINT ["java","-jar","jtjenkin-integration.jar"]
CMD echo "Pushed to docker via jenkins, our sb app is running in container!!!!"
