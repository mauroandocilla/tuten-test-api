# tuten-test-api

Desarollado por: Mauro Andocilla

## Desarrollo de un servicio REST

Desarrollo de un servicio REST que pueda ser consumido por un WebApp.

Este servicio REST debe permitir, mediante un comando POST, obtener la hora en formato UTC de 2 parámetros enviados al servicio: hora y timezone (por ejemplo: dato1=18:31:45, dato2=-3), deberán devolver la hora calculada, en un archivo json con el siguiente formato:

```json
{
  "response": {
    "time": "18:43:00",
    "timezone": "utc"
  }
}
```

### Tecnologías usadas:

- Java 8
- Spring MVC with Spring Boot
- Gradle

### Run

En la raíz del proyecto:

```sh
./gradlew bootRun
```

### Comandos

Comandos curl para probar: http://localhost:8085/timetoutc

```sh
curl --location --request POST 'http://localhost:8085/timetoutc' \
--header 'Content-Type: application/json' \
--data-raw '{
    "time": "18:31:45",
    "timezone": "+3"
}'
```
