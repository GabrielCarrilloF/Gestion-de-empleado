package com.mycompany.herencia.empleados;

import clases.Empleado;
import clases.Gerente;

public class HerenciaEmpleados {

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
