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
import logica.Correos;


/**
 *
 * @author juandrd
 */
public class DaoCorreos {

    FachadaBD fachada;

    public DaoCorreos() {
        fachada = new FachadaBD();
    }//

    public int guardar(Correos c) {
        String sql_guardar;
        sql_guardar = "INSERT INTO correos VALUES ('"
                + c.getEmail() + "', '"
                + c.getId_abonado().getId() + "')";
        System.out.println(sql_guardar);
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

    public Correos consultar(String email) {
        Correos c = new Correos();
        String sql_select;
        sql_select = "SELECT * FROM correos WHERE email='" + email + "'";
        try {
            Connection conn = fachada.conectar();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);

            //
            if (tabla.next()) {

                c.setEmail(tabla.getString("email"));
                c.setId_abonado(new DaoAbonado().consultar(tabla.getString("id_abonado")));


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
    
     public LinkedList consultar(String email, String id_abonado) {
        LinkedList correosConsulta = new LinkedList();
        String sql_select = "SELECT * FROM correos       ";
        if (!email.equals("") || !id_abonado.equals("")) {
            sql_select += " WHERE";
        }
        if (!email.equals("")) {
            sql_select += " email ='" + email + "' AND ";
        }
        if(!id_abonado.equals("")){
            sql_select += " id_abonado = '"+id_abonado+"'"+" AND ";
        }
      
                
        sql_select = sql_select.substring(0, sql_select.length() - 5);
        try {
            Connection conn = fachada.conectar();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            while (tabla.next()) {
                Correos c = new Correos();
                c.setEmail(tabla.getString("email"));
                c.setId_abonado(new DaoAbonado().consultar(tabla.getString("id_abonado")));
                correosConsulta.add(c);
            }
            conn.close();
            System.out.println("Conexion cerrada");
            return correosConsulta;

        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }

        return null;
    }


    public int editar(Correos c) {

        String sql_update;
        sql_update = "UPDATE correos  SET "
                + "id_abonado='" + c.getId_abonado() + "' "
                + "WHERE email='" + c.getEmail() + "'";
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
