/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import accesoDatos.FachadaBD;

import java.sql.*;
import logica.Empleado;

/**
 *
 * @author juandapp
 */
public class DaoEmpleado {

    FachadaBD fachada;

    public DaoEmpleado() {
        fachada = new FachadaBD();
    }

    public int guardarPrograma(Empleado em) {
        String sql_guardar;
        int numFilas = 0;

        sql_guardar = "INSERT INTO empleado VALUES ('" 
                + em.getId_empleado() + "', '" 
                + em.getNombre() + "', '" 
                + em.getGenero() + "', '" 
                + em.getEstado_civil() + "', '" 
                + em.getFecha_nacimiento() + "', '" 
                + em.getFecha_ingreso() + "', '" 
                + em.getTipo_contrato()+ "', '" 
                + em.getCargo()+ "', '" 
                + em.getCod_sucursal().getCod_sucursal() + "')";

        try {
            Connection conn = fachada.conectar();
            Statement sentencia = conn.createStatement();
            numFilas = sentencia.executeUpdate(sql_guardar);
            conn.close();

            return numFilas;
        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        return -1;
    }

}
