# Desarrollo de una API REST con Swagger, MySQL, RabbitMQ y Postman

## Subtítulo del proyecto
Implementación de una solución backend orientada a la integración de servicios, documentación técnica y validación funcional.

**Nombre del estudiante:** Geovanny Guerrero

---

## Introducción
El presente proyecto tiene como propósito el desarrollo de una API REST capaz de gestionar información de forma estructurada, eficiente y escalable. Durante su construcción se aplicaron diferentes tecnologías que permitieron fortalecer tanto la lógica del sistema como su documentación, pruebas y presentación visual.

La API fue desarrollada principalmente en **C# y HTML**, mientras que la parte visual se elaboró en **Python**, logrando una combinación de tecnologías que permitió organizar mejor la solución y presentar una estructura más clara. Además, se utilizaron herramientas complementarias como **Swagger**, **MySQL**, **RabbitMQ** y **Postman**, las cuales aportaron valor en distintas etapas del proyecto.

Este trabajo no solo consistió en construir una API funcional, sino también en comprender cómo se integran varias tecnologías dentro de una misma solución. Gracias a ello, fue posible obtener una visión más amplia del desarrollo backend moderno, donde la documentación, la persistencia de datos, la mensajería y las pruebas cumplen un papel fundamental.

---

## Objetivo general
Desarrollar una API REST documentada y funcional, integrando herramientas y tecnologías que permitan garantizar una correcta comunicación entre sistemas, almacenamiento de datos, mensajería entre procesos y pruebas de validación.

---

## Objetivos específicos
- Diseñar una API REST con una estructura clara y organizada.
- Documentar los endpoints mediante Swagger.
- Implementar una base de datos relacional utilizando MySQL.
- Integrar RabbitMQ como mecanismo de mensajería entre componentes.
- Validar el funcionamiento de la API mediante pruebas en Postman.
- Complementar la solución con una parte visual desarrollada en Python.

---

## Concepto: API REST
**Resumen:**  
Una API REST es una interfaz de programación de aplicaciones que permite la comunicación entre distintos sistemas a través del protocolo HTTP. Su funcionamiento se basa en el uso de métodos estándar como GET, POST, PUT y DELETE, los cuales permiten consultar, crear, modificar y eliminar información de manera organizada.

En este proyecto, la API REST constituye la base principal de la solución, ya que es la encargada de recibir las solicitudes, procesar la lógica correspondiente y devolver respuestas adecuadas. Gracias a este tipo de arquitectura, el sistema puede mantenerse más ordenado, escalable y fácil de integrar con otras aplicaciones.

La elección de una API REST resulta adecuada porque permite separar claramente la lógica del negocio de la presentación visual y del almacenamiento de datos. Esto mejora el mantenimiento del proyecto y facilita futuras modificaciones o ampliaciones.

**Mapa Mental:**  
![Mapa Mental](ruta_o_url_imagen)

---

## Concepto: Swagger
**Resumen:**  
Swagger es una herramienta destinada a la documentación interactiva de APIs. Permite describir de forma clara los servicios disponibles, los parámetros necesarios, los métodos HTTP soportados y las respuestas que devuelve cada endpoint.

En este proyecto, Swagger fue una pieza fundamental porque permitió documentar la API de manera ordenada y visual. Esto facilitó la comprensión del funcionamiento del sistema y mejoró la experiencia al momento de realizar pruebas o consultar los servicios disponibles.

Otra ventaja de Swagger es que ayuda a estandarizar la documentación, lo cual resulta muy útil cuando un proyecto debe ser entendido por otros desarrolladores. En lugar de revisar únicamente el código fuente, es posible visualizar el comportamiento esperado de cada ruta desde una interfaz práctica e intuitiva.

**Mapa Mental:**  
![Mapa Mental](ruta_o_url_imagen)

---

## Concepto: MySQL
**Resumen:**  
MySQL es un sistema de gestión de bases de datos relacional ampliamente utilizado en aplicaciones web y backend. Su función principal consiste en almacenar, organizar y administrar información de manera estructurada mediante tablas y relaciones.

En el desarrollo de este proyecto, MySQL cumplió un papel esencial al actuar como repositorio de los datos manipulados por la API. Esto permitió conservar la información de forma persistente y realizar consultas eficientes según las necesidades del sistema.

El uso de MySQL también aporta ventajas en términos de organización y control de datos. Al trabajar con tablas bien definidas, el proyecto puede mantener una estructura lógica que favorece la integridad de la información y simplifica su mantenimiento.

**Mapa Mental:**  
![Mapa Mental](ruta_o_url_imagen)

---

## Concepto: RabbitMQ
**Resumen:**  
RabbitMQ es una herramienta de mensajería que permite la comunicación asincrónica entre aplicaciones o componentes del sistema mediante colas de mensajes. Su principal función es desacoplar procesos para que puedan trabajar de manera independiente sin depender de una ejecución inmediata entre sí.

En este proyecto, RabbitMQ se utilizó para fortalecer la comunicación entre distintos componentes de la solución, permitiendo gestionar mensajes de forma ordenada y eficiente. Este enfoque resulta especialmente útil en sistemas que requieren distribuir tareas o manejar procesos de forma más flexible.

Además, RabbitMQ contribuye a mejorar la escalabilidad del sistema, ya que posibilita que diferentes partes de la aplicación se comuniquen sin necesidad de estar fuertemente acopladas. Esto facilita el crecimiento del proyecto y mejora su capacidad de adaptación a mayores demandas.

**Mapa Mental:**  
![Mapa Mental](ruta_o_url_imagen)

---

## Concepto: Postman
**Resumen:**  
Postman es una herramienta especializada en la prueba de APIs, diseñada para enviar peticiones HTTP y analizar las respuestas obtenidas. Permite verificar el funcionamiento de los endpoints y detectar posibles errores en la lógica del sistema.

En este proyecto, Postman fue utilizado como herramienta de validación para comprobar que cada ruta de la API respondiera correctamente. Gracias a su uso, se pudieron realizar pruebas con distintos tipos de solicitudes y observar el comportamiento del sistema en diferentes escenarios.

El empleo de Postman fue importante porque permitió evaluar la API de manera rápida y precisa, sin necesidad de desarrollar una interfaz completa para cada prueba. Esto hizo más eficiente el proceso de revisión y contribuyó a mejorar la calidad final del proyecto.

**Mapa Mental:**  
![Mapa Mental](ruta_o_url_imagen)

---

## Concepto: Python
**Resumen:**  
Python es un lenguaje de programación de alto nivel ampliamente reconocido por su sintaxis clara, su versatilidad y su gran cantidad de librerías disponibles. Es utilizado en desarrollo web, automatización, análisis de datos, inteligencia artificial y muchas otras áreas.

En este proyecto, Python se utilizó para la parte visual, complementando la lógica principal desarrollada en C# y HTML. Esta combinación permitió presentar una solución más completa, donde la funcionalidad técnica y la representación visual trabajaron de forma coordinada.

Python también destaca por su facilidad de lectura y por la rapidez con la que se pueden desarrollar prototipos o interfaces de apoyo. Por estas razones, resultó una tecnología adecuada para complementar el proyecto y aportar valor a su presentación general.

**Mapa Mental:**  
![Mapa Mental](ruta_o_url_imagen)

---

## Concepto: HTML
**Resumen:**  
HTML es el lenguaje de marcado utilizado para estructurar contenido en la web. Permite organizar elementos como títulos, párrafos, listas, imágenes y enlaces, sirviendo como base de cualquier página o interfaz visual.

En este proyecto, HTML fue empleado como parte del desarrollo de la API y de su presentación estructural. Su función consistió en organizar el contenido visual de manera clara, permitiendo que la información del sistema se mostrara de forma comprensible y ordenada.

Aunque HTML no se encarga de la lógica de programación, sí cumple un rol importante en la forma en que el usuario percibe el proyecto. Por ello, su integración con otras tecnologías contribuyó a una presentación más profesional.

**Mapa Mental:**  
![Mapa Mental](ruta_o_url_imagen)

---

## Tecnologías utilizadas
- C#.
- HTML.
- Python.
- Swagger.
- MySQL.
- RabbitMQ.
- Postman.

---

## Arquitectura del sistema
El proyecto permite comprender la diferencia entre una arquitectura monolítica tradicional y una arquitectura de microservicios. Esta comparación es importante porque muestra dos formas distintas de organizar una aplicación.

En una arquitectura monolítica, todos los componentes del sistema se encuentran dentro de una sola aplicación. La interfaz de usuario, la lógica empresarial y el acceso a datos trabajan de manera conjunta en un mismo bloque. Este modelo puede ser útil en proyectos pequeños o iniciales, ya que resulta más simple de desarrollar.

Por otro lado, la arquitectura de microservicios divide el sistema en servicios pequeños e independientes. Cada servicio cumple una función específica y puede manejar su propia base de datos o proceso. Esta estructura facilita la escalabilidad, mejora el mantenimiento y permite actualizar partes del sistema sin afectar al conjunto completo.

La imagen del mapa mental representa claramente esta comparación y ayuda a visualizar cómo cambia la organización de una aplicación según el tipo de arquitectura adoptada.

**Mapa mental de arquitectura:**  
![Mapa Mental](ruta_o_url_imagen)

---

## Desarrollo del proyecto
El desarrollo de este proyecto se llevó a cabo combinando diferentes herramientas y lenguajes de programación. La API fue construida en **C# y HTML**, lo que permitió estructurar la lógica principal y la presentación del sistema. Por su parte, la parte visual fue desarrollada en **Python**, aportando una capa complementaria orientada a la organización y visualización del contenido.

La implementación de Swagger permitió documentar la API de manera clara, facilitando la consulta de los endpoints y sus respectivas funcionalidades. MySQL fue utilizado para almacenar la información del sistema, mientras que RabbitMQ se integró como mecanismo de mensajería para mejorar la comunicación entre procesos. Finalmente, Postman sirvió como herramienta de validación para comprobar el comportamiento de la API.

La integración de estas tecnologías dio como resultado un proyecto más completo, funcional y profesional. Además, permitió aplicar conocimientos de programación, documentación, bases de datos, mensajería y pruebas, todos elementos fundamentales en el desarrollo backend.

---

## Importancia del proyecto
Este proyecto tiene una gran importancia académica y técnica porque permite aplicar de forma práctica diversos conceptos relacionados con el desarrollo de software. No se trata únicamente de construir una API, sino de integrar distintas herramientas que cumplen funciones específicas dentro de una solución real.

A través de este trabajo se puede comprender mejor cómo se organiza una aplicación moderna, cómo se documenta un servicio, cómo se almacenan los datos, cómo se comunican diferentes procesos y cómo se verifican los resultados mediante pruebas. Cada uno de estos elementos aporta una parte esencial al funcionamiento general del sistema.

Además, este tipo de proyectos fortalece habilidades como la planificación, la organización del código, la integración de tecnologías y la resolución de problemas. También prepara al estudiante para enfrentar escenarios similares en entornos profesionales, donde la calidad y la estructura del software son aspectos fundamentales.

---

## Conclusión personal
En mi opinión, este proyecto fue una experiencia muy valiosa porque me permitió consolidar conocimientos teóricos y aplicarlos en un entorno práctico. Durante su desarrollo comprendí mejor el funcionamiento de una API REST y la importancia de utilizar herramientas que complementen su implementación.

El uso de Swagger me ayudó a entender la relevancia de documentar correctamente un sistema. MySQL me permitió apreciar la importancia de almacenar los datos de forma organizada. RabbitMQ me enseñó cómo la mensajería puede mejorar la comunicación entre procesos. Postman, por su parte, fue fundamental para validar que la API funcionara correctamente.

También considero que trabajar con C#, HTML y Python dentro de un mismo proyecto fortaleció mi capacidad para integrar tecnologías diferentes y adaptarlas a un objetivo común. Esta experiencia me dejó una mejor comprensión del desarrollo backend y de la necesidad de construir sistemas ordenados, escalables y bien documentados.

En conclusión, este proyecto no solo representó una actividad académica, sino también una oportunidad para aprender, reforzar conocimientos y desarrollar una visión más profesional sobre la construcción de aplicaciones modernas.


## Temas de estudio – Aplicaciones distribuidas en .NET

Resumen de conceptos clave para una API distribuida construida en C# con ASP.NET Core, EF Core, RabbitMQ, Docker y Kubernetes.

---

## Introducción a aplicaciones distribuidas

Una **aplicación distribuida** está compuesta por varios componentes (servicios, APIs, bases de datos, etc.) que se ejecutan en distintas máquinas pero colaboran como un solo sistema.  
Es muy común en arquitecturas de microservicios, donde cada servicio puede tener su propia base de datos y se comunican mediante HTTP y mensajería (por ejemplo, API Gateway + RabbitMQ).

---

## Patrón API Gateway

El patrón **API Gateway** actúa como **único punto de entrada** para los clientes (frontend, móviles, terceros) hacia todos los servicios internos.  
Funcionalidades típicas:

- Enrutamiento de peticiones a los servicios adecuados.  
- Autenticación y autorización centralizada.  
- Limitación de llamadas (rate limiting).  
- Caché y agregación de respuestas.

---

## RabbitMQ

**RabbitMQ** es un *message broker* que permite la comunicación **asíncrona** entre servicios usando colas y mensajes.  
Se usa para:

- Procesar colas de trabajos (notificaciones, emails, reportes).  
- Desacoplar microservicios (por ejemplo, un servicio publica un evento y otro lo consume).

---

## Entity Framework Core

### ¿Qué es Entity Framework Core?

Entity Framework Core es un **ORM (Object‑Relational Mapper)** ligero, multiplataforma y de código abierto para .NET.  
Permite trabajar con bases de datos relacionales usando clases C# en lugar de escribir SQL directo.

### ¿Qué es DbContext y DbSet?

- **`DbContext`**: clase principal que representa la “sesión” con la base de datos; gestiona conexiones, cambios, transacciones y operaciones con las entidades.  
- **`DbSet<T>`**: propiedad de `DbContext` que representa una colección de entidades de tipo `T` y permite consultas, inserciones, actualizaciones y eliminaciones.

### Database First

En **Database‑First**, se parte de una base de datos existente y se genera el mapeo (entidades y `DbContext`) a partir del esquema de la BD.  
Es útil cuando ya existe una base de datos consolidada.

### Code First

En **Code First**, se define el modelo de dominio en C# (clases POCO) y EF Core **crea o migra** el esquema de la base de datos a partir de esas clases.  
Se suele usar con migraciones (`Add-Migration`, `Update-Database`).

### Claves foráneas

Las **claves foráneas** se representan con propiedades en las entidades que apuntan al valor de la clave principal de otra entidad.  
EF Core puede inferirlas por convención o configurarlas explícitamente en `OnModelCreating`.

---

##  Web API y API REST en C#

### Web API

Una **Web API** en C# suele referirse a una **API HTTP** construida con **ASP.NET Core Web API** que expone recursos accesibles vía HTTP (normalmente en formato JSON).

### API REST en C#

REST es un estilo de arquitectura, no un framework. En C# se implementa exponiendo recursos como:

- `GET    /api/usuarios`     → listar.  
- `POST   /api/usuarios`     → crear.  
- `PUT    /api/usuarios/{id}` → actualizar.  
- `DELETE /api/usuarios/{id}` → borrar.

Se usa convención de URIs, HTTP y JSON, normalmente con controllers y `IActionResult`.

---

##  Métodos HTTP y códigos de respuesta

### Métodos HTTP comunes

- `GET`: recuperar datos.  
- `POST`: crear un recurso.  
- `PUT`: actualizar un recurso completo.  
- `DELETE`: eliminar un recurso.  
- `OPTIONS`: preflight en CORS (pregunta qué métodos/headers acepta el servidor).

### Códigos de respuesta (40x, 50x)

- **400 (cliente)**: errores de la solicitud (400, 401, 403, 404, etc.).  
- **500 (servidor)**: errores internos (500, 503, etc.).

En C# se devuelven con métodos como `Ok()`, `BadRequest()`, `NotFound()`, `StatusCode(500)`, etc.

---

## Diferencia entre DTO y entidad

| Aspecto            | Entidad (EF Core)                          | DTO (Data Transfer Object)                          |
|--------------------|--------------------------------------------|-----------------------------------------------------|
| Propósito          | Modelo de dominio; mapea a la BD.          | Modelo de transporte para la API.                   |
| Contenido          | Campos que reflejan la tabla.              | Campos filtrados, agregados o transformados.        |
| Uso típico         | En repositorios y capa de datos.           | En controladores como respuesta/solicitud.          |

Se recomienda **no devolver entidades directamente** en la API: usar DTOs para separar contrato y modelo de dominio.

---

##  Estructura de una aplicación

En una API típica con C# se suele organizar así:

- **Presentation / API**: controladores, DTOs, validación, filtros.  
- **Application / Services**: lógica de negocio y casos de uso.  
- **Domain**: entidades, value objects, interfaces de repositorio.  
- **Infrastructure**: EF Core, repositorios concretos, configuración, RabbitMQ.  
- **Shared / Core**: utilidades, configuraciones comunes, extensiones.

---

##  Inyección de dependencias

En .NET Core la **inyección de dependencias** permite registrar servicios en el contenedor y que el framework los inyecte automáticamente (por ejemplo, en constructores de controllers o servicios).  
Se suele usar:

- `services.AddScoped<IUsuarioService, UsuarioService>()`.  
- `services.AddTransient<IMyService, MyService>()`.  
- `services.AddSingleton<ICache, Cache>()`.

---

##  Principios SOLID

- **SRP (Single Responsibility)**: una clase tiene un solo motivo para cambiar.  
- **OCP (Open/Closed)**: abierta para extensión, cerrada para modificación.  
- **LSP (Liskov Substitution)**: las subclases deben poder sustituir a sus superclases.  
- **ISP (Interface Segregation)**: interfaces pequeñas y específicas.  
- **DIP (Dependency Inversion)**: depende de abstracciones, no de detalles concretos.

Estos principios ayudan a crear capas y servicios limpios y mantenibles.

---

##  Arquitectura en N capas

La **arquitectura en capas** separa la aplicación en niveles lógicos:

- Capa UI / API.  
- Capa de aplicación (servicios).  
- Capa de dominio.  
- Capa de infraestructura (BD, mensajería, etc.).

Cada capa solo “habla” con la inmediata superior o inferior, lo que mejora mantenimiento y testeabilidad.

---

## Programación asíncrona

En C# se usa **async/await** para operaciones I/O (consultas a BD, llamadas HTTP, mensajería) sin bloquear hilos.  
En EF Core y APIs:

- Métodos como `ToListAsync()`, `FirstOrDefaultAsync()`, `SaveChangesAsync()`.  
- Acciones de controlador como `Task<IActionResult>` o `Task<T>`.

---

##  Docker

Docker permite empaquetar una aplicación y sus dependencias en **contenedores** aislados.  
Herramientas típicas:

- `Dockerfile`: define la imagen (base, publicación, puertos, etc.).  
- `docker-compose.yml`: orquesta servicios (API, base de datos, RabbitMQ, etc.).

---

##  Kubernetes

**Kubernetes** es una plataforma de orquestación de contenedores para desplegar y gestionar aplicaciones distribuidas en entornos de producción.  
Se usa para:

- Escalar servicios automáticamente.  
- Gestionar balanceo de carga, despliegues progresivos y recuperación ante fallos.

---







# Microservicio de Facturación - Spring Boot

Microservicio desarrollado en **Java Spring Boot** para la gestión de facturas mediante un API REST CRUD, con persistencia en **PostgreSQL** y arquitectura en capas.

Este proyecto forma parte de una arquitectura basada en microservicios, donde previamente existe un microservicio **subscriber** que consume eventos desde RabbitMQ y almacena los pedidos en la tabla `pedidos`. A partir de esa tabla, este microservicio permite registrar y administrar facturas relacionadas con cada pedido.

## Objetivo

Implementar un API REST completo para la gestión de facturas, aplicando buenas prácticas de desarrollo, conexión a base de datos PostgreSQL y separación por capas.

## Tecnologías utilizadas

- Java 17+
- Spring Boot
- Spring Web
- Spring Data JPA
- PostgreSQL
- Maven
- Lombok
- Jakarta Validation
- Postman para pruebas

## Arquitectura

El proyecto está organizado siguiendo arquitectura en capas:

- **Controller**: expone los endpoints REST.
- **Service**: contiene la lógica de negocio.
- **Repository**: acceso a datos mediante JPA.
- **Entity**: mapeo de tablas en PostgreSQL.
- **DTO**: transporte de datos entre cliente y servidor.
- **Exception**: manejo global de errores.

## Relación entre tablas

Este microservicio trabaja con dos tablas:

- `pedidos`: ya existente en la base de datos, llenada por el subscriber.
- `facturas`: creada en este proyecto.

La tabla `facturas` se relaciona con `pedidos` mediante una clave foránea:

- Una factura pertenece a un pedido.
- Un pedido puede tener una o varias facturas, dependiendo de la regla de negocio implementada.

## Estructura de la tabla `facturas`

| Campo | Tipo | Descripción |
|---|---|---|
| id | Long | Identificador único autogenerado |
| pedido_id | Long | Clave foránea hacia la tabla `pedidos` |
| numero_factura | String | Número de factura único |
| fecha_factura | LocalDateTime | Fecha y hora de emisión |
| total | BigDecimal | Monto total facturado |

## Endpoints disponibles

| Método | Endpoint | Descripción |
|---|---|---|
| GET | `/facturas` | Obtener todas las facturas |
| GET | `/facturas/{id}` | Obtener una factura por ID |
| POST | `/facturas` | Crear una nueva factura |
| PUT | `/facturas/{id}` | Actualizar una factura existente |
| DELETE | `/facturas/{id}` | Eliminar una factura |

## Estructura del proyecto

```bash
src
└── main
    ├── java/com/example/facturacion
    │   ├── controller
    │   ├── service
    │   ├── service/impl
    │   ├── repository
    │   ├── entity
    │   ├── dto
    │   ├── exception
    │   └── FacturacionApplication.java
    └── resources
        └── application.properties
```

## Configuración de base de datos

En el archivo `src/main/resources/application.properties` configura tu conexión a PostgreSQL:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/tu_basedatos
spring.datasource.username=postgres
spring.datasource.password=123456

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect

server.port=8082
```

## Script sugerido para la tabla `facturas`

```sql
CREATE TABLE facturas (
    id BIGSERIAL PRIMARY KEY,
    pedido_id BIGINT NOT NULL,
    numero_factura VARCHAR(100) NOT NULL UNIQUE,
    fecha_factura TIMESTAMP NOT NULL,
    total NUMERIC(15,2) NOT NULL,
    CONSTRAINT fk_factura_pedido
        FOREIGN KEY (pedido_id)
        REFERENCES pedidos(id)
);
```

## Cómo ejecutar el proyecto

1. Clonar el repositorio:

```bash
git clone https://github.com/tu-usuario/tu-repositorio.git
```

2. Ingresar al proyecto:

```bash
cd tu-repositorio
```

3. Verificar que PostgreSQL esté levantado y que exista la base de datos.

4. Configurar las credenciales en `application.properties`.

5. Ejecutar el proyecto con Maven:

```bash
./mvnw spring-boot:run
```

O si usas Maven instalado:

```bash
mvn spring-boot:run
```

## Ejemplos de consumo

### Crear factura

**POST** `/facturas`

```json
{
  "pedidoId": 1,
  "numeroFactura": "FAC-0001",
  "fechaFactura": "2026-04-17T13:00:00",
  "total": 150.75
}
```

### Obtener todas las facturas

**GET** `/facturas`

### Obtener factura por ID

**GET** `/facturas/1`

### Actualizar factura

**PUT** `/facturas/1`

```json
{
  "pedidoId": 1,
  "numeroFactura": "FAC-0001-EDIT",
  "fechaFactura": "2026-04-17T14:00:00",
  "total": 200.00
}
```

### Eliminar factura

**DELETE** `/facturas/1`

## Validaciones implementadas

- `pedidoId` obligatorio.
- `numeroFactura` obligatorio y único.
- `fechaFactura` obligatoria.
- `total` obligatorio y mayor a cero.
- Validación de existencia del pedido antes de registrar la factura.

## Manejo de errores

El proyecto incluye manejo global de excepciones para responder con mensajes claros en casos como:

- Factura no encontrada.
- Pedido no encontrado.
- Datos inválidos en la petición.
- Número de factura duplicado.

## Pruebas

Los endpoints fueron probados con Postman usando operaciones CRUD completas:

- Crear factura
- Listar facturas
- Buscar factura por ID
- Actualizar factura
- Eliminar factura

## Buenas prácticas aplicadas

- Arquitectura en capas.
- Uso de DTOs para entrada y salida.
- Validaciones con Bean Validation.
- Manejo centralizado de excepciones.
- Persistencia con Spring Data JPA.
- Relación entre entidades mediante clave foránea.
- Código desacoplado y mantenible.

## Posibles mejoras

- Integración con Swagger / OpenAPI.
- Dockerización del servicio.
- Tests unitarios e integración.
- Seguridad con Spring Security.
- Generación automática de número de factura.
- Uso de perfiles `dev` y `prod`.

## Autor

Proyecto desarrollado como parte de una práctica de microservicios con Spring Boot, RabbitMQ y PostgreSQL.
