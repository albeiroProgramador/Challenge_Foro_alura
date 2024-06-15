# Challenge_Foro_alura

Foro Hub es una aplicación web diseñada para gestionar temas de foro y autenticación de usuarios. Este README proporciona una visión general del proyecto, cómo configurarlo e información importante sobre la base de código.

## Estructura del Proyecto

El proyecto está estructurado de la siguiente manera:

Foro-Hub-main/

├── .gitignore

├── mvnw

├── mvnw.cmd

├── pom.xml

├── .idea/

├── src/

│ ├── main/

│ │ ├── java/

│ │ │ └── com/

│ │ │ └── ChallengeAlura/

│ │ │ └── demo/

│ │ │ ├── ApiApplication.java

│ │ │ ├── controller/

│ │ │ ├── domain/

│ │ │ ├── infra/

│ │ │ └── infra/

│ │ └── resources/

│ │ ├── application.properties

│ │ └── db/

│ └── test/

└── README.md


## Comenzando

### Requisitos Previos

Para ejecutar este proyecto, necesitarás:

- Java Development Kit (JDK) 11 o superior
- Maven 3.6.3 o superior
- Un IDE (IntelliJ IDEA, Eclipse, etc.)

### Configuración

1. Clona el repositorio:

```bash
git clone <repository-url>
cd Foro-Hub-main

2. Construye el proyecto usando Maven:

bash
Copiar código
./mvnw clean install

3. Ejecuta la aplicación:
bash
Copiar código
./mvnw spring-boot:run
La aplicación comenzará a ejecutarse en http://localhost:8080.

Descripción del Código
Aplicación Principal
ApiApplication.java: El punto de entrada principal de la aplicación Spring Boot.
Controladores
controller/: Contiene los controladores que manejan las solicitudes HTTP para temas y autenticación.
Dominio
domain/topic/: Contiene los modelos de dominio y servicios relacionados con los temas del foro.
domain/usuarios/: Contiene los modelos de dominio e interfaces de repositorio para la gestión de usuarios.
Infraestructura
infra/security/: Contiene configuraciones de seguridad y servicios para manejar la autenticación y autorización.
infra/errores/: Contiene clases de manejo de errores.
Tecnologías y Bibliotecas Utilizadas
Spring Boot
La aplicación utiliza Spring Boot para facilitar la configuración y el desarrollo de aplicaciones Java. Spring Boot permite crear aplicaciones independientes y productivas con un mínimo esfuerzo.

Spring Security
La seguridad se gestiona utilizando Spring Security, que proporciona autenticación y autorización a la aplicación. La autenticación se realiza mediante tokens JWT.

Flyway
Flyway se utiliza para la gestión de migraciones de base de datos. Las migraciones se encuentran en el directorio src/main/resources/db/migration/ y se ejecutan automáticamente al iniciar la aplicación.

H2 Database
Para propósitos de desarrollo y prueba, se utiliza una base de datos en memoria H2. Esto facilita la configuración y no requiere una instancia de base de datos externa.

Swagger (SpringDoc)
Para la documentación de la API, se utiliza SpringDoc OpenAPI. Esto genera automáticamente la documentación de la API y proporciona una interfaz gráfica para interactuar con ella.

Lombok
Lombok se utiliza para reducir el código boilerplate en las clases Java. Proporciona anotaciones para generar automáticamente métodos getters, setters, constructores y más.

Base de Datos
El proyecto utiliza una base de datos en memoria H2 para propósitos de desarrollo y prueba. El esquema de la base de datos está definido en el directorio src/main/resources/db/migration/ utilizando migraciones de Flyway.

Manejo de Errores
El paquete infra/errores/ incluye manejadores de errores personalizados para gestionar excepciones de la aplicación y proporcionar respuestas de error significativas.

Seguridad
La configuración de seguridad se maneja en el paquete infra/security/. Incluye autenticación basada en tokens utilizando JWT.

Documentación de la API
La documentación de la API se genera automáticamente utilizando SpringDoc OpenAPI y está disponible en http://localhost:8080/swagger-ui.html cuando la aplicación está en ejecución.

Contribución
Si deseas contribuir a este proyecto, por favor haz un fork del repositorio y envía un pull request con tus cambios.

Licencia
Este proyecto está licenciado bajo la Licencia MIT. Consulta el archivo LICENSE para más detalles.
