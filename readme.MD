# springdatajpa-postgres
This project uses a postgres database to persist one dummy Student entity using JPARepository.

Docker containers are used for DB.

## DB setup
Docker postgres-adminer-docker-compose.yaml file defines two containers, one for PostgreSQL database and another for Adminer DB client. Run the following command to create the containers:
```
docker compose -f postgres-adminer-docker-compose.yaml up -d
```
Adminer is configured to use 8080 port. To login navigate to http://localhost:8080/. Use the credentials configured in compose yaml file.

*NOTE: Use the host ip as server (localhost/127.0.01 won't work, as they refer to the Adminer container, not the host)*

## Application
The application defines Student entity and the corresponding StudentRepository interface for DAO. In the main class SpringdatajpaPostgresApplication.java it creates a CommandLineRunner bean that saves a record in the DB