/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import accesoDatos.FachadaBD;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import logica.Abonado;

/**
 *
 * @author juandrd
 */
public class DaoAbonado {

    FachadaBD fachada;

    DaoAbonado() {
        fachada = new FachadaBD();
    }//

    public int guardar(Abonado abonado) {
        String sql_guardar;
        sql_guardar = "INSERT INTO abonado VALUES ('"
                + abonado.getId() + "', '"
                + abonado.getTipo_documento() + "', '"
                + abonado.getNombres() + "', '"
                + abonado.getApellidos() + "','"
                + abonado.getDireccion() + "','"
                + abonado.getGenero() + "','"
                + abonado.getEstado_civil() + "','"
                + abonado.getFecha_nacimiento() + "','"
                + abonado.getComuna() + "','"
                + abonado.getBarrio() + "','"
                + abonado.getCiudad() + "','"
                + abonado.getTipo() + "','"
                + abonado.getImei().getImei() + "')";
        try {
            Connection conn = fachada.conectar();
            Statement sentencia = conn.createStatement();
            int numFilas = sentencia.executeUpdate(sql_guardar);
            conn.close();
            return numFilas;
        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        return -1;
    }//fin guardar

    public Abonado consultar(String id) {
        Abonado a = new Abonado();
        String sql_select;
        sql_select = "SELECT * FROM abonado WHERE id='" + id + "'";
        try {
            Connection conn = fachada.conectar();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);

            //
            if (tabla.next()) {

                a.setNombres(tabla.getString("nombres"));
                a.setApellidos(tabla.getString("apellidos"));
                a.setDireccion(tabla.getString("direccion"));
                a.setGenero(tabla.getString("genero"));
                a.setEstado_civil(tabla.getString("estado_civil"));
                a.setFecha_nacimiento(tabla.getDate("fecha_nacimiento"));
                a.setComuna(tabla.getString("comuna"));
                a.setBarrio(tabla.getString("barrio"));
                a.setCiudad(tabla.getString("ciudad"));
                a.setTipo(tabla.getString("tipo"));
                a.setImei(new DaoEquipo().consultar(tabla.getString("imei")));
                

            }

            conn.close();
            System.out.println("Conexion cerrada");
            return a;

        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }

        return null;
    }

    public int editar(Abonado a) {

        String sql_update;
        sql_update = "UPDATE abonado  SET"
                + "nombres='" + a.getNombres() + "'"
                + "apellidos='" + a.getApellidos() + "'"
                + "direccion='" + a.getDireccion() + "'"
                + "genero='" + a.getGenero() + "'"
                + "estado_civil='" + a.getEstado_civil() + "'"
                + "fecha_nacimiento='" + a.getFecha_nacimiento() + "'"
                + "comuna='" + a.getComuna() + "'"
                + "barrio='" + a.getBarrio() + "'"
                + "ciudad='" + a.getCiudad() + "'"              
                + "tipo='" + a.getTipo() + "'"
                + "imei='" + a.getImei().getImei() + "'"
                + "WHERE id='" + a.getId() + "'";
        try {
            Connection conn = fachada.conectar();
            Statement sentencia = conn.createStatement();
            sentencia.executeUpdate(sql_update);


            conn.close();

            System.out.println("Conexion cerrada");
            return 0;

        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        return -1;
    }
}
