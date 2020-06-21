FROM openjdk:11
RUN mkdir /app
WORKDIR /app
COPY demo.jar ./
ENTRYPOINT ["java"]
CMD ["-Duser.timezone=Asia/Taipei", "-jar", "demo.jar", "--spring.config.location=file:/ap-config/application.yml"]
EXPOSE 8080
