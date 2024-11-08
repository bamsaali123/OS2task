FROM openjdk:11-jre-slim

WORKDIR /app

COPY . /app

RUN javac Main.java

CMD ["java", "Main"]
