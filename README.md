# Administración de Órdenes de compra - Spring Boot 3 API

📋 Descripción
API RESTful para gestión de órdenes de compra desarrollada con Spring Boot 3.x. Incluye operaciones CRUD completas.

# 🚀 Características Principales
# ✅ Operaciones CRUD Completas
    - Crear nueva orden.
    - Leer todas las órdenes.
    - Leer orden por ID.    
    - Eliminar orden.

# ✅ Tecnologías Implementadas
    - Spring Boot 3.x con arquitectura en capas
    - Spring Data JPA para persistencia
    - Lombok para reducción de código boilerplate
    - Validación Bean Validation    
    - Logging con SLF4J

# 🏗️ Arquitectura del Proyecto

- src/main/java/com.pedidos/
- ├── 📁 controller/
- │   └── OrdenController.java      # Controlador REST
- ├── 📁 service/
- │   └── OrdenService.java         # Implementación del servicio
- ├── 📁 repository/
- │   └── IOrdenRepository.java     # Repositorio JPA
- ├── 📁 model/
- │   └── Articulo.java             # Entidad JPA
- │   └── Cliente.java              # Entidad JPA
- │   └── Orden.java                # Entidad JPA
- ├── 📁 dto/
- │   └── ArticuloDTO.java          # Objeto de Transferencia
- │   └── ClienteDTO.java           # Objeto de Transferencia
- │   └── OrdenDTO.java             # Objeto de Transferencia
- ├── 📁 dao/
- │   └── IOrdenDAO.java            # Objeto de Acceso a datos
- │   └── OrdenDAOImpl.java         # Objeto de Acceso a datos

# 🔧 Requisitos del Sistema
    - Java 17 o superior
    - Maven 3.6+
    - Spring Boot 3.x
    - Base de datos (MySql 8)
    - Postman o similar para pruebas
# 🛠️ Instalación y Configuración
1. Clonar el repositorio
   - git clone https://github.com/AlexRubenPaguay/PedidoAPI.git
   - cd PedidoAPI

2. Configurar la base de datos
  # Config BD MySQL 8
      - spring.application.name=pedidos
      - spring.datasource.url = jdbc:mysql://localhost:33330/compra
      - spring.datasource.username=root
      - spring.datasource.password=root
      - spring.jpa.hibernate.ddl-auto=update
      - spring.jpa.show-sql=true

3. Construir y ejecutar
   # Construir el proyecto
    -  mvn clean install

  # Ejecutar la aplicación
     - mvn spring-boot:run

  # O ejecutar el JAR
    - java -jar target/pedidos-0.0.1-SNAPSHOT.jar

# 📚 Endpoints de la API
- Base URL: http://localhost:3131/api/v1/pedido/
- Método	-->Endpoint	        -->Descripción	
- GET	    -->listAllOrdenes	        -->Obtener todos las órdenes
- GET	    -->ordenById/{idOrden}	        -->Obtener orden por ID
- DELETE	-->eliminarOrden        -->Eliminar orden	
- POST	  -->crearPedido	          -->Crear nueva orden

# 🔍 Ejemplos de Uso
1. Obtener todas los órdenes
   <img width="1372" height="818" alt="imagen" src="https://github.com/user-attachments/assets/eed140e8-78cb-4e64-803b-26e50b8dd2cf" />

2.- Obtener orden por ID
<img width="1381" height="557" alt="imagen" src="https://github.com/user-attachments/assets/f7d7c2cb-5fac-4e94-86ad-ca0a44b173bb" />

¡Gracias por utilizar **Administración de Órdenes de compra - Spring Boot 3 API !** Si tienes alguna duda o problema, no dudes en abrir un issue en GitHub.

Este archivo README cubre desde la instalación hasta la ejecución, detalles sobre las tecnologías utilizadas, la configuración de la base de datos MySQL 8, 
y cómo acceder a cada end-point. ¡Espero que te sea útil para tu proyecto!  

