# 📌 Taller: Manejo de Datos de Equipos de la UEFA con Java, Streams y Expresiones Lambda  

## 📌 Descripción  
Este proyecto consiste en el procesamiento de datos de equipos de fútbol de la UEFA utilizando **Java**. Se emplea la **API Stream**, **expresiones lambda** y la biblioteca **Jackson** para trabajar con archivos JSON.  

Se han implementado múltiples funcionalidades como:  🚀  
✅ Filtrado de equipos por año de fundación  
✅ Cálculo del promedio de edad de jugadores  
✅ Agrupamiento de jugadores por posición  
✅ Cálculo de estadísticas generales  
✅ Serialización de datos usando `Serializable`  

---

## 📌 Tecnologías Utilizadas  
- **Java 8 o superior**  
- **Streams API y Expresiones Lambda**  
- **Jackson (para manejo de JSON)**  
- **Serializable (para persistencia de datos)**  
- **Maven (para gestión de dependencias)**  

---

## 📌 Instalación y Configuración  
### 🔹 1️⃣ Clonar el Repositorio  
```
git clone https://github.com/KarenLore/TallerExpresionesLambdaStreams_KarenCristancho.git

🔹 2️⃣ Configurar Maven o Gradle

Si usas Maven, agrega en pom.xml:

 <dependencies>
    <!-- https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core -->
        <dependency>
        <groupId>com.fasterxml.jackson.core</groupId>
        <artifactId>jackson-core</artifactId>
        <version>2.18.2</version>
    </dependency>

    <!-- https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind -->
        <dependency>
        <groupId>com.fasterxml.jackson.core</groupId>
        <artifactId>jackson-databind</artifactId>
        <version>2.18.2</version>
        </dependency>
    </dependencies>

```

---
```
📌 Estructura del Proyecto

/main-java
│── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── models/  
│   │   │   │   ├── Equipo.java  
│   │   │   │   ├── Estadisticas.java  
│   │   │   │   ├── Jugador.java  
│   │   │   │   ├── ListaEquipos.java  
│   │   │   ├── utils/
│   │   │   │   ├── JsonReader.java  
│   │   │   ├── challenges/
│   │   │   │   ├── RetosPropuestos.java  
│   │   │   │   ├── RetosAdicionales.java  
│   │   │   ├── ui/
│   │   │   │   ├── Menu.java  
│   │   │   ├── Main.java  
│── uefa_teams_36_full_players.json  
│── pom.xml (Maven)  

```
---

📌 Funcionamiento

🔹 1️⃣ Cargar los datos del JSON

El archivo uefa_teams_36_full_players.json contiene la información de equipos, jugadores y estadísticas. Se carga automáticamente en Main.java a través de JsonReader.java.

🔹 2️⃣ Ejecutar el menú principal

Para correr la aplicación:

javac src/main/java/Main.java
java src/main/java/Main

El menú ofrece dos categorías de retos:

Retos Propuestos (Funciones básicas con Streams API)

Retos Adicionales (Consultas avanzadas con Streams API y Predicate)



---

📌 Funcionalidades Implementadas

📌 Retos Propuestos

📌 Retos Adicionales


---

📌 Ejemplo de Uso

Ejecuta el programa y selecciona una opción del menú.

Ejemplo: Listar los equipos fundados después del 2000

📌 Menú Principal:
1. Retos Propuestos
2. Retos Adicionales
3. Salir
Selecciona una opción: 1

📌 Retos Propuestos:
1. Listar Equipos Fundados Después del Año 2000
...
Selecciona una opción: 1

Manchester City
RB Leipzig


---

📌 Conclusión

Este proyecto demuestra el poder de Streams API, Expresiones Lambda y Java Serializable para el análisis eficiente de datos.

Se pueden realizar consultas avanzadas de forma sencilla y eficiente, sin escribir bucles manualmente. Además, la serialización permite guardar y recuperar los datos fácilmente.


---
📌 Autor

- 👨‍💻 Desarrollado por Karen Lorena Cristancho Caceres
- 📧 Contacto: karenlorenacriscaceres@gmail.com 
- 🔗 GitHub: https://github.com/KarenLore
---

## **📌 ¿Qué incluye este `README.md`?**
✅ **Explicación clara del proyecto**  
✅ **Instrucciones de instalación y ejecución**  
✅ **Tabla de funcionalidades implementadas**  
✅ **Ejemplo de uso con la terminal**  
✅ **Conclusión sobre la importancia del proyecto**  

