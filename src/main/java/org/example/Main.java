package org.example;

import org.example.DAO.empleadoDAO;
import org.example.DAO.empleadoDAOImpl;
import org.example.entities.empleado;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Creamos a los empleados
        empleado empleado1 = new empleado(null, "Pepe", "pepeviyuela@trabajo.com","Marketing");
        empleado empleado2 = new empleado(null, "Martina", "martina3345@curs.com","Finanzas");
        empleado empleado3 = new empleado(null, "Roman", "romano55@ilerna.com","Direccion");

        // Añadimos a los empleados a la empresa
        empleadoDAO eDAO = new empleadoDAOImpl();
        eDAO.create(empleado1);
        eDAO.create(empleado2);
        eDAO.create(empleado3);

        // Imprime todos los registros de empleados en la empresa
        System.out.println(eDAO.findAll());
    }
}