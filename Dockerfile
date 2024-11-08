FROM openjdk:11-jdk-slim

WORKDIR /app

COPY . /app

RUN javac RationalMain.java

CMD ["java", "Main"]
