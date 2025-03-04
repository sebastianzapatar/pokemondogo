##Proyecto Spring Boot con Maven

Este es un proyecto desarrollado con Spring Boot y Maven, configurado para ejecutarse en el puerto 8080.

Requisitos previos

Antes de ejecutar el proyecto, asegúrate de tener instalados los siguientes requisitos:

Java 17+

Maven 3+

Git (opcional, pero recomendado)

Instalación

Clona este repositorio en tu máquina local:

git clone https://github.com/tu-usuario/tu-repositorio.git
cd tu-repositorio

Compila el proyecto con Maven:

mvn clean install

Configuración del Proyecto

El proyecto está configurado para ejecutarse en el puerto 8080. Puedes cambiar este valor en el archivo application.properties o application.yml en src/main/resources:

application.properties

server.port=8080

application.yml (si usas YAML)

server:
  port: 8080

Ejecución del Proyecto

Para ejecutar el proyecto en modo desarrollo, usa el siguiente comando:

mvn spring-boot:run

Si deseas ejecutar el jar generado tras la compilación, usa:

java -jar target/tu-proyecto-0.0.1-SNAPSHOT.jar

Acceso a la Aplicación

Una vez iniciado el servidor, puedes acceder a la aplicación en la siguiente URL:

http://localhost:8080

Endpoints

Si el proyecto expone endpoints REST, puedes probarlos usando herramientas como Postman o cURL. Algunos ejemplos:

curl -X GET http://localhost:8080/api/v1/saludo

Si la aplicación incluye Swagger, puedes acceder a la documentación en:

http://localhost:8080/swagger-ui/index.html

Construcción de un Docker Image (Opcional)

Tecnologías Usadas

Spring Boot

Maven

Java 17+


Swagger (Opcional)

Contribuciones

Si deseas contribuir al proyecto, por favor sigue estos pasos:

Realiza un fork del repositorio.

Crea una rama (git checkout -b feature-nueva-funcionalidad).

Realiza tus cambios y haz commit (git commit -m 'Agrega nueva funcionalidad').

Realiza push a la rama (git push origin feature-nueva-funcionalidad).

Abre un Pull Request.

Licencia

Este proyecto está bajo la licencia MIT. Para más detalles, revisa el archivo LICENSE.

