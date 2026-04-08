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