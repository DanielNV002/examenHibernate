package org.example.DAO;

import org.example.Util.HibernateUtil;
import org.example.entities.empleado;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class empleadoDAOImpl implements empleadoDAO {

    /**
     * Metodo usado para ver todos los empleados
     * @return todos los registros de empleados en la tabla empleados
     */
    @Override
    public List<empleado> findAll() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        List<empleado> empleadoes = null;

        try {
            transaction = session.beginTransaction();
            empleadoes = session.createQuery("from empleado", empleado.class).list();
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
        return empleadoes;
    }

    /**
     *
     * @param empleado
     * @return Crea un empleado nuevo
     */

    @Override
    public empleado create(empleado empleado) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            session.persist(empleado);
            transaction.commit();
            System.out.println(" --- Empleado registrado exitosamente --- ");
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
        return empleado;
    }
}
