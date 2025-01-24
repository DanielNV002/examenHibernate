package org.example.DAO;

import org.example.entities.empleado;

import java.util.List;

public interface empleadoDAO {

    List<empleado> findAll();

    empleado create(empleado empleado);

}
