# Tutorial: Get Started With Kotlin

This repository contains the code of a Spring Boot Kotlin application example with Okta OpenID Connect authentication.

**Prerequisites:**

- [Java 11](https://adoptopenjdk.net/)

## Getting Started

To install this example, run the following commands:

```bash
git clone https://github.com/indiepopart/kotlin-spring-boot.git
cd kotlin-spring-boot
```

### Configure an Okta Account

```shell
./mvnw com.okta:okta-maven-plugin:setup
```
You should see the following output:

```
First name: Jimena
Last name: Garbarino
Email address: ***
Company: ***
Creating new Okta Organization, this may take a minute:
OrgUrl: https://dev-640429.okta.com
Check your email address to verify your account.

Writing Okta SDK config to: /home/indiepopart/.okta/okta.yaml

Configuring a new OIDC, almost done:
Created OIDC application, client-id: ***
```

Check your email and follow the instructions to activate your Okta account.


### Run with Maven

```shell
./mvnw spring-boot:run
```

Go to `http://localhost:8080` and login with Okta.
