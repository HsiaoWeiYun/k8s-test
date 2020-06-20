FROM openjdk:11
RUN mkdir /app
WORKDIR /app
COPY demo.jar ./
ENTRYPOINT ["java"]
CMD ["-Duser.timezone=Asia/Taipei", "-jar", "demo.jar"]
EXPOSE 8080
