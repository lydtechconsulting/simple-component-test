# Simplest example of a project using the Lydtech Component Test Framework

See https://github.com/lydtechconsulting/component-test-framework/ for the steps involved in setting this up

## Building

```
./mvnw clean install; docker build -t samples/my-maven-app .
```

## Running Component Tests
```
./mvnw clean install -Pcomponent
```
