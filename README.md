<div align="center">
<h1 style="text-align: center;"> 📚Ejercicio de Práctica de Herencia en Java 👨‍💻 </h1>
</div>

#### Enunciado del Problema

Queremos implementar un sistema de gestión de empleados para una empresa. En esta empresa, hay dos tipos de empleados: empleados regulares y gerentes. Todos los empleados tienen algunos atributos básicos comunes, pero los gerentes tienen atributos adicionales específicos. Tu tarea es definir una jerarquía de clases que represente esta estructura, utilizando herencia en Java.

1. **Clase Base: Empleado**
   - Atributos:
     - `nombre`: Cadena de texto para almacenar el nombre completo del empleado.
     - `edad`: Entero para almacenar la edad del empleado.
     - `salario`: Doble para almacenar el salario del empleado.
   - Métodos:
     - Constructor para inicializar todos los atributos.
     - Métodos getters y setters para cada atributo.
     - Un método `mostrarInfo()` que imprima la información del empleado.

2. **Clase Derivada: Gerente**
   - Atributos:
     - `departamento`: Cadena de texto para almacenar el nombre del departamento que el gerente supervisa.
     - `bonus`: Doble para almacenar el bonus anual del gerente.
   - Métodos:
     - Constructor que inicialice todos los atributos (incluyendo los heredados).
     - Métodos getters y setters para los atributos `departamento` y `bonus`.
     - Un método `mostrarInfo()` que sobrescriba el método en la clase base e imprima la información del gerente, incluyendo los nuevos atributos.

3. **Clase Principal: Main**
   - En el método `main`:
     - Crear al menos dos objetos de la clase `Empleado`.
     - Crear al menos dos objetos de la clase `Gerente`.
     - Utilizar el método `mostrarInfo()` para mostrar la información de todos los empleados y gerentes.

#### Ejemplo de nombres y datos a utilizar:
- Empleados:
  - Gabriel Carrillo, 30 años, 3000.0 de salario.
  - Janny Florez, 25 años, 2500.0 de salario.
- Gerentes:
  - Gaspar Carrillo, 40 años, 5000.0 de salario, Departamento de Ventas, 2000.0 de bonus.
  - Otro gerente con datos a elección.

Recuerda no implementar el código, sino solo seguir el enunciado para crear las clases con sus respectivos atributos y métodos.

# Clase Main
aquí tienes un ejemplo del código para la clase Main que muestra cómo deberían crearse y utilizarse los objetos de las clases Empleado y Gerente


```java
public class Main {
    public static void main(String[] args) {
        // Crear objetos de la clase Empleado
        Empleado empleado1 = new Empleado("Gabriel Carrillo", 30, 3000.0);
        Empleado empleado2 = new Empleado("Janny Florez", 25, 2500.0);

        // Crear objetos de la clase Gerente
        Gerente gerente1 = new Gerente("Gaspar Carrillo", 40, 5000.0, "Ventas", 2000.0);
        Gerente gerente2 = new Gerente("Ana María López", 35, 4800.0, "Recursos Humanos", 1800.0);

        // Mostrar información de los empleados
        empleado1.mostrarInfo();
        empleado2.mostrarInfo();

        // Mostrar información de los gerentes
        gerente1.mostrarInfo();
        gerente2.mostrarInfo();
    }
}
