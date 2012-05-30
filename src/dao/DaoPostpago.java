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
import logica.Postpago;

/**
 *
 * @author juandrd
 */
public class DaoPostpago {
    
 FachadaBD fachada;

    DaoPostpago() {
        fachada = new FachadaBD();
    }//

    public int guardar(Postpago post) {
        String sql_guardar;
        sql_guardar = "INSERT INTO postpago VALUES ('"
                + post.getCod_plan().getCod_plan() + "', '"
                + post.getTotal_minutos() + "', '"
                + post.getCosto_min_adicional() + "')";
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

    public Postpago consultar(String cod_plan) {
        Postpago post = new Postpago();
        String sql_select;
        sql_select = "SELECT * FROM postpago WHERE cod_plan='" + cod_plan + "'";
        try {
            Connection conn = fachada.conectar();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);

            //
            if (tabla.next()) {

                post.setCod_plan(new DaoPlan().consultar(tabla.getString("cod_plan")));
                post.setTotal_minutos(tabla.getInt("total_minutos"));
                post.setCosto_min_adicional(tabla.getInt("costo_min_adicional"));
               
            }

            conn.close();
            System.out.println("Conexion cerrada");
            return post;
            
        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }

        return null;
    }

    public int editar(Postpago post) {

        String sql_update;
        sql_update = "UPDATE postpago  SET"
                + "total_minutos=" + post.getTotal_minutos() + ""
                + "costo_min_adicional=" + post.getCosto_min_adicional() + ""                
                + "WHERE cod_plan='" + post.getCod_plan() + "'";
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
