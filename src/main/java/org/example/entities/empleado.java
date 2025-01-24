package org.example.entities;

import jakarta.persistence.*;

import java.io.Serializable;

/**
 * Representa una entidad de tipo empleado que se mapea a la tabla "empleado" en la base de datos.
 * Esta clase contiene información sobre un empleado, incluyendo su nombre, especie, edad,
 * descripción de la pérdida y estado.
 * <p>
 * La clase implementa la interfaz {@link Serializable} para permitir su serialización.
 *
 * @author [Daniel Navaroo]
 * @version 1.0
 * @since 2025-01-24
 */
@Entity
@Table(name = "empleado") // opcional si se quiere cambiar el nombre de la tabla
public class empleado implements Serializable {

    /**
     * Variables de los empleados
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_empleado;

    private String nombre;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String departamento;

    /**
     * Constructores
     */

    public empleado() {
    }

    public empleado(Integer id_empleado, String nombre, String email, String departamento) {
        this.id_empleado = id_empleado;
        this.nombre = nombre;
        this.email = email;
        this.departamento = departamento;
    }

    /**
     * Getter y Setters
     * @return
     */

    public Integer getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(Integer id_empleado) {
        this.id_empleado = id_empleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    /**
     * Metodo para imprimir con mejor legibilidad
     */

    @Override
    public String toString() {
        return  " empleado { " + "id_empleado=" + id_empleado + ", nombre='" + nombre + '\'' + ", email='" + email + '\'' + ", departamento='" + departamento + '\'' + "}\n" +
                "═════════════════════════════════════════════════════════════════════════════════════════════════════════\n";
    }
}
