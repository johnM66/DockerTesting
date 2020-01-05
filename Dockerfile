From openjdk:8

WORKDIR '/app'

COPY ./target/employee_producer-0.0.1-SNAPSHOT.jar employee_producer-0.0.1-SNAPSHOT.jar

CMD ["java","-jar","employee_producer-0.0.1-SNAPSHOT.jar"]