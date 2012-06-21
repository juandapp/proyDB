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
import logica.Empleado;
import logica.Plan;

/**
 *
 * @author juandapp
 */
public class DaoPlan {

    FachadaBD fachada;

    public DaoPlan() {
        fachada = new FachadaBD();
    }

    public int guardar(Plan p) {
        String sql_guardar;
        int numFilas = 0;

        sql_guardar = "INSERT INTO plan VALUES ('"
                + p.getCod_plan() + "', '"
                + p.getTarifa_otro_operador() + "', '"
                + p.getTarifa_msj_multimedia() + "', '"
                + p.getTarifa_msj_texto() + "')";

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

    public Plan consultar(String cod_plan) {
        Plan e = new Plan();
        String sql_select;
        sql_select = "SELECT * FROM plan WHERE cod_plan='" + cod_plan + "'";
        try {
            Connection conn = fachada.conectar();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            if (tabla.next()) {

                e.setCod_plan(tabla.getString("cod_plan"));
                e.setTarifa_otro_operador(tabla.getInt("tarifa_otro_operador"));
                e.setTarifa_msj_multimedia(tabla.getInt("tarifa_msj_multimedia"));
                e.setTarifa_msj_texto(tabla.getInt("tarifa_msj_texto"));
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

    public LinkedList consultar(String cod_plan, String tarifa_otro_operador,
           String tarifa_msj_multimedia, String tarifa_msj_texto) {
        LinkedList planConsulta = new LinkedList();
        String sql_select = "SELECT * FROM plan      ";
        if (!String.valueOf(cod_plan).equals("") || !tarifa_otro_operador.equals("")
                || !tarifa_msj_multimedia.equals("")
                || !tarifa_msj_texto.equals("")) {
            sql_select += "WHERE ";
        }
        if (!String.valueOf(cod_plan).equals("")) {
            sql_select += "cod_plan = " + cod_plan + " AND ";
        }
        if (!tarifa_otro_operador.equals("")) {
            sql_select += "tarifa_otro_operador = LIKE '%" + tarifa_otro_operador + "%'" + " AND ";
        }
        if (!tarifa_msj_multimedia.equals("")) {
            sql_select += "tarifa_msj_multimedia = LIKE '%" + tarifa_msj_multimedia + "%'" + " AND ";
        }
        if (!tarifa_msj_texto.equals("")) {
            sql_select += "tarifa_msj_texto = LIKE '%" + tarifa_msj_texto + "%'" + " AND ";
        }
        sql_select = sql_select.substring(0, sql_select.length() - 5);
        try {
            Connection conn = fachada.conectar();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            while (tabla.next()) {
                Plan plan = new Plan();
                plan.setCod_plan(tabla.getString("cod_plan"));
                plan.setTarifa_otro_operador(tabla.getInt("tarifa_otro_operador"));
                plan.setTarifa_msj_multimedia(tabla.getInt("tarifa_msj_multimedia"));
                plan.setTarifa_msj_texto(tabla.getInt("tarifa_msj_texto"));
                
                planConsulta.add(plan);
            }
            conn.close();
            System.out.println("Conexion cerrada");
            return planConsulta;

        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }

        return null;
    }

    public int editar(Plan p) {

        String sql_update;
        sql_update = "UPDATE plan SET "
                + "tarifa_otro_operador=" + p.getTarifa_otro_operador() + ", "
                + "tarifa_msj_multimedia=" + p.getTarifa_msj_multimedia() + " ,"
                + "tarifa_msj_texto=" + p.getTarifa_msj_texto() + " "
                + "WHERE cod_plan='" + p.getCod_plan() + "'";
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
