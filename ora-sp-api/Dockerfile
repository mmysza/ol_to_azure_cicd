FROM openjdk:11-slim
RUN pwd
COPY './target/ora-sp-api.jar' /usr/local
COPY './target/*.dylib' './target/*.so' './target/*.dll' /usr/lib/java/
RUN chmod +x ./usr/local/ora-sp-api.jar
CMD ["java", "-jar", "./usr/local/ora-sp-api.jar"]
