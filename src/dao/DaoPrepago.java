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
import logica.Plan;
import logica.Prepago;

/**
 *
 * @author juandrd
 */
public class DaoPrepago {

    FachadaBD fachada;

    public DaoPrepago() {
        fachada = new FachadaBD();
    }//

    public int guardar(Prepago pre) {
        String sql_guardar;
        sql_guardar = "INSERT INTO prepago VALUES ('"
                + pre.getCod_plan().getCod_plan() + "')";
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
    
    public LinkedList consultar(String cod_plan,String tarifa_otro_operador, 
        String tarifa_msj_multimedia, String tarifa_msj_texto) {
        
        LinkedList prepagoConsulta = new LinkedList();
        String sql_select = "SELECT * FROM prepago NATURAL JOIN plan      ";
        if (!cod_plan.equals("") ||  !tarifa_otro_operador.equals("")||
                !tarifa_msj_multimedia.equals("")|| !tarifa_msj_texto.equals("")) {
            sql_select += "WHERE ";
        }
        
        if (!cod_plan.equals("")) {
            sql_select += "cod_plan='" + cod_plan + "' AND ";
        }
        if (!tarifa_otro_operador.equals("")) {
            sql_select += "tarifa_otro_operador=" + tarifa_otro_operador + " AND ";
        }
        
        if (!tarifa_msj_multimedia.equals("")) {
            sql_select += "tarifa_msj_multimedia=" + tarifa_msj_multimedia + " AND ";
        }
        if (!tarifa_msj_texto.equals("")) {
            sql_select += "tarifa_msj_texto=" + tarifa_msj_texto + " AND ";
        }
       
        sql_select = sql_select.substring(0, sql_select.length() - 5);
        
        System.out.println(sql_select);
        
        
        try {
            Connection conn = fachada.conectar();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            while (tabla.next()) {
                Prepago prepago = new Prepago();
                Plan plan = new Plan();
                plan.setCod_plan(tabla.getString("cod_plan"));
                plan.setTarifa_otro_operador(tabla.getInt("tarifa_otro_operador"));
                plan.setTarifa_msj_multimedia(tabla.getInt("tarifa_msj_multimedia"));
                plan.setTarifa_msj_texto(tabla.getInt("tarifa_msj_texto"));
                prepago.setCod_plan(plan);
               
                prepagoConsulta.add(prepago);
            }
            conn.close();
            System.out.println("Conexion cerrada");
            return prepagoConsulta;

        } catch (SQLException e) {
            System.out.println(e);
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println(e);
        }

        return null;
    }


    public int editar(Prepago c) {

        String sql_update;
        sql_update = "UPDATE prepago  SET "
                + "cod_plan='" + c.getCod_plan() + "' "
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
