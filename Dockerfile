# Usar una imagen base de Java 17
FROM openjdk:17-jdk-alpine

# Establecer el directorio de trabajo dentro del contenedor
WORKDIR /pedidos

# Copiar el archivo JAR de la aplicación al contenedor
COPY target/pedidos-0.0.1-SNAPSHOT.jar pedidos-0.0.1-SNAPSHOT.jar

# Exponer el puerto en el que la aplicación Spring Boot escucha
EXPOSE 8080

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "pedidos-0.0.1-SNAPSHOT.jar"]