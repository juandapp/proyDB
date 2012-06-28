/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import accesoDatos.FachadaBD;

import java.sql.*;
import java.util.LinkedList;
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

    public int guardar(Empleado em) {
        String sql_guardar;
        int numFilas = 0;

        sql_guardar = "INSERT INTO empleado VALUES ('"
                + em.getId_empleado() + "', '"
                + em.getNombre() + "', '"
                + em.getGenero() + "', '"
                + em.getEstado_civil() + "', '"
                + em.getFecha_nacimiento() + "', '"
                + em.getFecha_ingreso() + "', '"
                + em.getTipo_contrato() + "', '"
                + em.getCargo() + "', '"
                + em.getCod_sucursal().getCod_sucursal() + "')";

        try {
            Connection conn = fachada.conectar();
            Statement sentencia = conn.createStatement();
            numFilas = sentencia.executeUpdate(sql_guardar);
            conn.close();

            return numFilas;
        } catch (SQLException ex) {
            System.out.println(ex);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return -1;
    }

    public Empleado consultar(String id_empleado) {
        Empleado e = new Empleado();
        String sql_select;
        sql_select = "SELECT * FROM empleado WHERE id_empleado='" + id_empleado + "'";
        try {
            Connection conn = fachada.conectar();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            if (tabla.next()) {

                e.setId_empleado(tabla.getString("id_empleado"));
                e.setNombre(tabla.getString("nombre"));
                e.setGenero(tabla.getString("genero"));
                e.setEstado_civil(tabla.getString("estado_civil"));
                e.setFecha_nacimiento(tabla.getDate("fecha_nacimiento"));
                e.setFecha_ingreso(tabla.getDate("fecha_ingreso"));
                e.setTipo_contrato(tabla.getString("tipo_contrato"));
                e.setCargo(tabla.getString("cargo"));
                e.setCod_sucursal(new DaoSucursal().consultar(tabla.getString("cod_sucursal")));
            }
            conn.close();
            System.out.println("Conexion cerrada");
            return e; 
        } catch (SQLException ex) {
            System.out.println(ex);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return null;
    }
    
     public LinkedList consultar(String id_empleado,String nombre,
            String genero,String estado_civil,String fecha_nacimiento,
            String fecha_ingreso,String tipo_contrato,String cargo,
            String codigo_sucursal) {
        LinkedList consulta = new LinkedList();
        String sql_select = "SELECT * FROM empleado      ";
        if (!id_empleado.equals("") || !nombre.equals("") || !genero.equals("")
                || !estado_civil.equals("")
                || !fecha_nacimiento.equals("")
                || !fecha_ingreso.equals("")
                || !tipo_contrato.equals("")
                || !cargo.equals("")
                || !codigo_sucursal.equals("")) {
            sql_select += "WHERE";
        }
        if (!id_empleado.equals("")) {
            sql_select += " id_empleado ='" + id_empleado + "' AND ";
        }
        if (!nombre.equals("")) {
            sql_select += " nombre LIKE '%" + nombre + "%'" + " AND ";
        }
        if (!genero.equals("Seleccionar")) {
            sql_select += " genero ='" + genero +  "' AND ";
        }
        if (!estado_civil.equals("Seleccionar")) {
            sql_select += " estado_civil = '" + estado_civil + "' AND ";
        }
        if (!fecha_nacimiento.equals("")) {
            sql_select += " fecha_nacimiento LIKE '%" + fecha_nacimiento + "%'" + " AND ";
        }
        if (!fecha_ingreso.equals("")) {
            sql_select += " fecha_ingreso LIKE '%" + fecha_ingreso + "%'" + " AND ";
        }
        if (!tipo_contrato.equals("Seleccionar")) {
            sql_select += " tipo_contrato = '" + tipo_contrato  + "' AND ";
        }
        if (!cargo.equals(" ")) {
            sql_select += " cargo ='" + cargo + "' AND ";
        }
        if (!codigo_sucursal.equals("Seleccionar")) {
            sql_select += " codigo_sucursal = '" + codigo_sucursal + "'" + " AND ";
        }
       
        

        sql_select = sql_select.substring(0, sql_select.length() - 5);
         System.out.println(sql_select);
        try {
            Connection conn = fachada.conectar();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            while (tabla.next()) {
                Empleado e= new Empleado();
                e.setId_empleado(tabla.getString("id_empleado"));
                e.setNombre(tabla.getString("nombre"));
                e.setGenero(tabla.getString("genero"));
                e.setEstado_civil(tabla.getString("estado_civil"));
                e.setFecha_nacimiento(tabla.getDate("fecha_nacimiento"));
                e.setFecha_ingreso(tabla.getDate("fecha_ingreso"));
                e.setTipo_contrato(tabla.getString("tipo_contrato"));
                e.setCargo(tabla.getString("cargo"));
                e.setCod_sucursal(new DaoSucursal().consultar(tabla.getString("cod_sucursal")));
                
                consulta.add(e);
            }
            conn.close();
            System.out.println("Conexion cerrada");
            return consulta;

        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }

        return null;
    }

    public int editar(Empleado e) {

        String sql_update;
        sql_update = "UPDATE empleado  SET "
                + "nombre='" + e.getNombre() + "' "
                + "genero='" + e.getGenero() + "' "
                + "estado_civil='" + e.getEstado_civil() + "' "
                + "fecha_nacimiento='" + e.getFecha_nacimiento() + "' "
                + "fecha_ingreso='" + e.getFecha_ingreso() + "' "
                + "tipo_contrato='" + e.getTipo_contrato() + "' "
                + "cargo='" + e.getCargo() + "' "
                + "cod_sucursal='" + e.getCod_sucursal().getCod_sucursal() + "' "
                + "WHERE cod_sucursal='" + e.getId_empleado() + "'";
        try {
            Connection conn = fachada.conectar();
            Statement sentencia = conn.createStatement();
            sentencia.executeUpdate(sql_update);


            conn.close();

            System.out.println("Conexion cerrada");
            return 0;

        } catch (SQLException ex) {
            System.out.println(ex);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return -1;
    }
}
