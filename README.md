# parcial3-back

## 🛠️ Technologies Used

-	SpringBoot (Development Framework)
-	Apache Maven (Project management tool)
-	Java OpenJDk 17.x.x (Programming Language)
-	Junit & Mockito (Testing)
-	Jacoco (Test coverage of the code)
-	MongoDB (Datbase)
-   Swagger (Endpoint Documentation)

## 📑 Diagrams
Here are the diagrams on which we base and base the architecture of the module's operation.

### Components Diagram

### Diagrama de Clases

![img](/assets/clases.png)

### Diagrama de Componentes

![img](/assets/comp.png)

### Diagrama de Datos

![img](/assets/datos.png)


## ▶️ Pasos para correrlo

1. Clone the repository
   ```bash
   git clone link_github
   cd repaso
   ```

2. Configure conexion with database: `application.properties`:
   ```properties
   spring.data.mongodb.uri=mongodb+srv://username:password@cluster.mongodb.net/
   spring.data.mongodb.database=Cluster0
   ```

3. Build and run the app:
   ```bash
   mvn clean install
   mvn spring-boot:run
   ```