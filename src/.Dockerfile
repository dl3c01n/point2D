FROM openjdk:11 AS BUILD_IMAGE
ENV APP_HOME=/root/dev/myapp/
RUN mkdir -p $APP_HOME/src/main/java
WORKDIR $APP_HOME
RUN ./gradlew build -x :bootRepackage -x test --continue
COPY . .
RUN ./gradlew build

FROM openjdk:11-jre
WORKDIR /root/
COPY --from=BUILD_IMAGE /root/dev/myapp/build/libs/myapp.jar .
EXPOSE 8080
CMD ["java","-jar","myapp.jar"]