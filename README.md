# Aplicación de Peluquería Canina

Este proyecto es una aplicación de escritorio para la gestión de una peluquería canina. Permite registrar, actualizar, listar y eliminar información de los pacientes (perros) de la peluquería. La aplicación está desarrollada en Java utilizando NetBeans y está conectada a una base de datos mediante JPA (Java Persistence API).

## Funcionalidades

- **CRUD Completo**: La aplicación permite Crear, Leer, Actualizar y Eliminar registros de pacientes.
- **Interfaz de Usuario**: Cuenta con una interfaz gráfica intuitiva para facilitar la gestión de la información.
- **Conexión a Base de Datos**: Utiliza JPA para interactuar con una base de datos relacional.
- **Plataforma**: Desarrollado en NetBeans con Maven como sistema de gestión de dependencias.

## Requisitos

- **JDK 17** o superior
- **NetBeans IDE 12** o superior
- **MySQL** u otro sistema de base de datos compatible con JPA

## Instalación y Despliegue

Sigue estos pasos para desplegar la aplicación en tu computadora local:

1. **Clonar el Repositorio**
   ```bash
   git clone https://github.com/Micaela-Calvino/Aplicacion-Peluqueria-Canina.
   
   2. **Abrir el Proyecto en NetBeans**

- Abre NetBeans y selecciona "Abrir Proyecto".
- Navega a la carpeta donde clonaste el repositorio y selecciona el proyecto.

3. **Configurar la Base de Datos**

- Crea una base de datos MySQL llamada peluqueria_canina.
- Importa el archivo SQL peluqueria_canina.sql (si está disponible) en tu base de datos para crear las tablas necesarias.
- Configura las credenciales de la base de datos en el archivo persistence.xml ubicado en src/main/resources/META-INF.

4. **Compilar y Ejecutar**

- En NetBeans, haz clic derecho sobre el proyecto y selecciona "Run" para compilar y ejecutar la aplicación.

## Uso de la Aplicación
- Gestión de Pacientes: Usa las opciones del menú para agregar, editar, listar o eliminar pacientes.
- Navegación: La aplicación cuenta con un menú principal que te permitirá acceder a todas las funcionalidades del sistema.
