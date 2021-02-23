FROM openjdk:11-slim
COPY './target/ora-sp-api.jar' /usr/local
RUN chmod +x ./usr/local/ora-sp-api.jar
CMD ["java", "-jar", "./usr/local/ora-sp-api.jar"]
