FROM openjdk:17-oracle
WORKDIR /app
COPY /target/prometheus_grafana_univer-0.0.1-SNAPSHOT.jar my-app.jar
ENTRYPOINT ["java","-jar","/app/my-app.jar"]