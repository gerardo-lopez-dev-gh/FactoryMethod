# Design Pattern: Factory Method / Patrón de Diseño: Factory Method

Este repositorio contiene una implementación del patrón **Factory Method** en Java, tanto en su versión clásica como en una variante simplificada.

## 📚 Contenido
- [Qué es el patrón Factory Method](#qué-es-el-patrón-factory-method)
- [Estructura del proyecto](#estructura-del-proyecto)
- [Cómo ejecutar](#cómo-ejecutar)
- [Tecnologías utilizadas](#tecnologías-utilizadas)
- [Ejemplo de uso](#ejemplo-de-uso)

## 🌟 Qué es el patrón Factory Method
**English**  
The Factory Method pattern defines an interface for creating objects, but lets subclasses decide which class to instantiate. This provides flexibility and promotes loose coupling.

**Español**  
El patrón Factory Method define una interfaz para crear objetos, pero delega en las subclases la decisión de qué clase instanciar. Esto proporciona flexibilidad y promueve el bajo acoplamiento.

### Características/Features
| **Ventaja**          | **Benefit**                  |
|-----------------------|------------------------------|
| Desacoplamiento       | Decoupling                   |
| Extensibilidad        | Extensibility                |
| Reutilización de código| Code reusability            |

## 🏗 Estructura del proyecto
```plaintext
src/
├── main/
│ ├── java/
│ │ ├── factoryMethod/ # clasic version
│ │ └── normalFactory/ # simplified version
```

## 🚀 Cómo ejecutar
```bash
# Ejecutar implementación clásica
mvn exec:java -Dexec.mainClass="com.library.factoryMethod.Main2"

# Ejecutar versión simplificada
mvn exec:java -Dexec.mainClass="com.library.normalFactory.Main"
```

## 💡 Ejemplo de uso
```java
// Creación usando Factory Method
VehicleFactory factory = new CarFactory();
Vehicle myCar = factory.createVehicle();

// Uso del objeto
myCar.start();
myCar.accelerate();
myCar.stop();
```