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
import java.util.LinkedList;
import logica.Cia_local;

/**
 *
 * @author juandrd
 */
public class DaoCia_local {

    FachadaBD fachada;

    public DaoCia_local() {
        fachada = new FachadaBD();
    }//

    public int guardar(Cia_local c) {
        String sql_guardar;
        sql_guardar = "INSERT INTO cia_local VALUES ('"
                + c.getId() + "', '"
                + c.getNombre() + "')";
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

    public Cia_local consultar(String id) {
        Cia_local c = new Cia_local();
        String sql_select;
        sql_select = "SELECT * FROM cia_local WHERE id='" + id + "'";
        try {
            Connection conn = fachada.conectar();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);

            //
            if (tabla.next()) {

                c.setId(tabla.getString("id"));
                c.setNombre(tabla.getString("nombre"));


            }

            conn.close();
            System.out.println("Conexion cerrada");
            return c;

        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }

        return null;
    }
    
    
    public LinkedList consultar(String id, String nombre) {
        LinkedList ciaLConsulta = new LinkedList();
        String sql_select = "SELECT * FROM cia_local      ";
        if (!id.equals("") || !nombre.equals("")) {
            sql_select += "WHERE ";
        }
        if (!id.equals("")) {
            sql_select += "id ='" + id + "' AND ";
        }
        if(!nombre.equals("")){
            sql_select += "nombre LIKE '%"+nombre+"%'"+" AND ";
        }
                     
        sql_select = sql_select.substring(0, sql_select.length() - 5);
        try {
            Connection conn = fachada.conectar();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            while (tabla.next()) {
                Cia_local cl = new Cia_local();
                cl.setId(tabla.getString("id"));
                cl.setNombre(tabla.getString("nombre"));
                ciaLConsulta.add(cl);
            }
            conn.close();
            System.out.println("Conexion cerrada");
            return ciaLConsulta;

        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }

        return null;
    }


    public int editar(Cia_local c) {

        String sql_update;
        sql_update = "UPDATE cia_local  SET "
                + "nombre='" + c.getNombre() + "' "
                + "WHERE id='" + c.getId() + "'";
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
