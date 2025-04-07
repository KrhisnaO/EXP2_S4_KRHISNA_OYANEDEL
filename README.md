# EXP2_S4_KRHISNA_OYANEDEL

# Microservicio de Películas

Este es un microservicio simple desarrollado con Spring Boot, que permite interactuar con una base de datos Oracle para gestionar información de películas.

## Características

- Base de datos en **Oracle**.
- **CRUD** de películas: almacenamiento y consulta de películas.
- **Rutas REST** disponibles:
  - `GET /peliculas/{id}`: Obtiene los detalles de una película por su ID.
  - `GET /peliculas`: Obtiene la lista de todas las películas.
- Cada película contiene los siguientes atributos:
  - `id`: Identificador único de la película.
  - `titulo`: Título de la película.
  - `año`: Año de estreno de la película.
  - `director`: Director de la película.
  - `genero`: Género de la película.
  - `sinopsis`: Breve descripción de la película.

## Requisitos

- **Java 17** o superior.
- **Spring Boot 2.x** o superior.
- **Oracle Database** (con Wallet configurado).
- **Maven** como gestor de dependencias.

## Configuración de la Base de Datos

### Configuración de Oracle Wallet

1. Descarga el Oracle Wallet desde la consola de Oracle Cloud (si es necesario).
2. Coloca el archivo `tnsnames.ora` y las credenciales del Wallet en la carpeta especificada en la configuración de la base de datos, como se muestra a continuación:
   
   ```properties
   spring.datasource.url=jdbc:oracle:thin:@bbddfs_tp?TNS_ADMIN=/path/to/Wallet

## Insertar Películas de Ejemplo
Puedes agregar algunas películas de ejemplo con el siguiente código SQL:

INSERT INTO peliculas (id, titulo, año, director, genero, sinopsis) VALUES

(1, 'Volver al Futuro', 1985, 'Robert Zemeckis', 'Ciencia ficción, Aventura', 'Marty McFly viaja accidentalmente al pasado en una máquina del tiempo.'),

(2, 'Resident Evil', 2002, 'Paul W.S. Anderson', 'Terror, Ciencia ficción, Acción', 'Un grupo de sobrevivientes debe enfrentarse a zombis y criaturas mutantes.'),

(3, 'Terminator', 1984, 'James Cameron', 'Ciencia ficción, Acción', 'Un cyborg asesino del futuro viaja al pasado para matar a Sarah Connor.');

### El microservicio estará disponible en http://localhost:8080.

## Uso

1. Obtener una película por ID:
Realiza una solicitud GET a la siguiente URL para obtener los detalles de una película usando su ID:

GET http://localhost:8080/peliculas/{id}
Ejemplo:
GET http://localhost:8080/peliculas/1

2. Obtener todas las películas:
Realiza una solicitud GET a la siguiente URL para obtener la lista de todas las películas registradas en la base de datos:

GET http://localhost:8080/peliculas
