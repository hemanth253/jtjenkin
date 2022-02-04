FROM openjdk:8
EXPOSE 8080
ADD target/jtdocker1.jar jtdocker1.jar
ENTRYPOINT ["java","-jar","jtdocker1.jar"]
CMD echo "Our sb app is running in container!!!!"