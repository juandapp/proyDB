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
import logica.Prepago;

/**
 *
 * @author juandrd
 */
public class DaoPrepago {
    
FachadaBD fachada;

    DaoPrepago() {
        fachada = new FachadaBD();
    }//

    public int guardar(Prepago pre) {
        String sql_guardar;
        sql_guardar = "INSERT INTO prepago VALUES ('"
                + pre.getCod_plan() +  "')";
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

    public Prepago consultar(String cod_plan) {
        Prepago c = new Prepago();
        String sql_select;
        sql_select = "SELECT * FROM prepago WHERE cod_plan='" + cod_plan + "'";
        try {
            Connection conn = fachada.conectar();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);

            //
            if (tabla.next()) {

                c.setCod_plan(new DaoPlan().consultar(tabla.getString("cod_plan")));
                          

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

    public int editar(Prepago c) {

        String sql_update;
        sql_update = "UPDATE prepago  SET"
                + "cod_plan='" + c.getCod_plan() + "'"
                + "WHERE cod_plan='" + c.getCod_plan() + "'";
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
