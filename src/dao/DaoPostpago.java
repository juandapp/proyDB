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
import logica.Postpago;
import logica.Plan;

/**
 *
 * @author juandrd
 */
public class DaoPostpago {

    FachadaBD fachada;
    DaoPlan dp;

    public DaoPostpago() {
        fachada = new FachadaBD();
        dp=new DaoPlan();
    }

    public int guardar(Postpago post) {
        String sql_guardar;
        sql_guardar = "INSERT INTO postpago VALUES ('"
                + post.getCod_plan().getCod_plan() + "', "
                + post.getTotal_minutos() + ", "
                + post.getCosto_min_adicional() + ")";
        dp.guardar(post.getCod_plan());
        
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
public LinkedList consultar(String cod_plan,String tarifa_otro_operador, String tarifa_msj_multimedia, String tarifa_msj_texto, String total_minutos, String costo_min_adicional) {
        
        LinkedList postPagoConsulta = new LinkedList();
        String sql_select = "SELECT * FROM postpago pp JOIN plan p ON pp.cod_plan=p.cod_plan      ";
        if (!cod_plan.equals("") || !total_minutos.equals("") || !costo_min_adicional.equals("")
                || !tarifa_otro_operador.equals("")|| !tarifa_msj_multimedia.equals("")|| !tarifa_msj_texto.equals("")) {
            sql_select += "WHERE ";
        }
        
        if (!cod_plan.equals("")) {
            sql_select += "cod_plan = " + cod_plan + " AND ";
        }
        if (!tarifa_otro_operador.equals("")) {
            sql_select += "tarifa_otro_operador = " + tarifa_otro_operador + " AND ";
        }
        
        if (!tarifa_msj_multimedia.equals("")) {
            sql_select += "tarifa_msj_multimedia = " + tarifa_msj_multimedia + " AND ";
        }
        if (!tarifa_msj_texto.equals("")) {
            sql_select += "tarifa_msj_texto = " + tarifa_msj_texto + " AND ";
        }
        if (!total_minutos.equals("")) {
            sql_select += "total_minutos =" + total_minutos +  " AND ";
        }
        if (!costo_min_adicional.equals("")) {
            sql_select += "costo_min_adicional =" + costo_min_adicional  + " AND ";
        }
        sql_select = sql_select.substring(0, sql_select.length() - 5);
        try {
            Connection conn = fachada.conectar();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            while (tabla.next()) {
                Postpago postpago = new Postpago();
                Plan plan = new Plan();
                plan.setCod_plan(tabla.getString("cod_plan"));
                plan.setTarifa_otro_operador(tabla.getInt("tarifa_otro_operador"));
                plan.setTarifa_msj_multimedia(tabla.getInt("tarifa_msj_multimedia"));
                plan.setTarifa_msj_texto(tabla.getInt("tarifa_msj_texto"));
                postpago.setCod_plan(plan);
                postpago.setTotal_minutos(tabla.getInt("total_minutos"));
                postpago.setCosto_min_adicional(tabla.getInt("costo_min_adicional"));
                postPagoConsulta.add(postpago);
            }
            conn.close();
            System.out.println("Conexion cerrada");
            return postPagoConsulta;

        } catch (SQLException e) {
            System.out.println(e);
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println(e);
        }

        return null;
    }

    public int editar(Postpago post) {

        String sql_update;
        sql_update = "UPDATE postpago SET "
                + "total_minutos=" + post.getTotal_minutos() + ", "
                + "costo_min_adicional=" + post.getCosto_min_adicional() + " "
                + "WHERE cod_plan='" + post.getCod_plan() + "'";
        dp.editar(post.getCod_plan());
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
