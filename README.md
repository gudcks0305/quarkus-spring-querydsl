# quarkus-spring

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: <https://quarkus.io/>.

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:

```shell script
./gradlew quarkusDev
```

> **_NOTE:_**  Quarkus now ships with a Dev UI, which is available in dev mode only
> at <http://localhost:8080/q/dev/>.

## Packaging and running the application

The application can be packaged using:

```shell script
./gradlew build
```

It produces the `quarkus-run.jar` file in the `build/quarkus-app/` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into
the `build/quarkus-app/lib/` directory.

The application is now runnable using `java -jar build/quarkus-app/quarkus-run.jar`.

If you want to build an _über-jar_, execute the following command:

```shell script
./gradlew build -Dquarkus.package.jar.type=uber-jar
```

The application, packaged as an _über-jar_, is now runnable using `java -jar build/*-runner.jar`.

## Creating a native executable

You can create a native executable using:

```shell script
./gradlew build -Dquarkus.native.enabled=true
```

Or, if you don't have GraalVM installed, you can run the native executable build in a container
using:

```shell script
./gradlew build -Dquarkus.native.enabled=true -Dquarkus.native.container-build=true
```

You can then execute your native executable with: `./build/quarkus-spring-1.0-SNAPSHOT-runner`

If you want to learn more about building native executables, please
consult <https://quarkus.io/guides/gradle-tooling>.

## Related Guides

- Hibernate ORM ([guide](https://quarkus.io/guides/hibernate-orm)): Define your persistent model
  with Hibernate ORM and Jakarta Persistence
- REST Client ([guide](https://quarkus.io/guides/rest-client)): Call REST services
- Quarkus Extension for Spring Security API ([guide](https://quarkus.io/guides/spring-security)):
  Secure your application with Spring Security annotations
- Quarkus Extension for Spring Scheduled ([guide](https://quarkus.io/guides/spring-scheduled)):
  Schedule tasks with Spring Scheduling
- YAML Configuration ([guide](https://quarkus.io/guides/config-yaml)): Use YAML to configure your
  Quarkus application
- Quarkus Extension for Spring Web API ([guide](https://quarkus.io/guides/spring-web)): Use Spring
  Web annotations to create your REST services
- Logging JSON ([guide](https://quarkus.io/guides/logging#json-logging)): Add JSON formatter for
  console logging
- Quarkus Extension for Spring Data JPA API ([guide](https://quarkus.io/guides/spring-data-jpa)):
  Use Spring Data JPA annotations to create your data access layer
- Quarkus Extension for Spring Boot
  properties ([guide](https://quarkus.io/guides/spring-boot-properties)): Use Spring Boot properties
  annotations to configure your application
- JDBC Driver - H2 ([guide](https://quarkus.io/guides/datasource)): Connect to the H2 database via
  JDBC
- Quarkus Extension for Spring Cache API ([guide](https://quarkus.io/guides/spring-cache)): Use
  Spring Cache annotations
- REST Jackson ([guide](https://quarkus.io/guides/rest#json-serialisation)): Jackson serialization
  support for Quarkus REST. This extension is not compatible with the quarkus-resteasy extension, or
  any of the extensions that depend on it
- Quarkus Extension for Spring Data REST ([guide](https://quarkus.io/guides/spring-data-rest)):
  Generate Jakarta REST resources for a Spring Data application
- Quarkus Extension for Spring DI API ([guide](https://quarkus.io/guides/spring-di)): Define your
  dependency injection with Spring DI
- Quarkus Extension for Spring Cloud Config
  Client ([guide](https://quarkus.io/guides/spring-cloud-config-client)): Use properties from Spring
  Cloud Config as bootstrap properties sources

## Provided Code

### YAML Config

Configure your application with YAML

[Related guide section...](https://quarkus.io/guides/config-reference#configuration-examples)

The Quarkus application configuration is located in `src/main/resources/application.yml`.

### Hibernate ORM

Create your first JPA entity

[Related guide section...](https://quarkus.io/guides/hibernate-orm)

### REST Client

Invoke different services through REST with JSON

[Related guide section...](https://quarkus.io/guides/rest-client)

### REST

Easily start your REST Web Services

[Related guide section...](https://quarkus.io/guides/getting-started-reactive#reactive-jax-rs-resources)

### Spring Web

Spring, the Quarkus way! Start your REST Web Services with a Spring Controller.

[Related guide section...](https://quarkus.io/guides/spring-web#greetingcontroller)
