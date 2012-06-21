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
import logica.PlanDatos;


/**
 *
 * @author chokuno
 */
public class DaoPlanDatos {



    FachadaBD fachada;

    public DaoPlanDatos() {
        fachada = new FachadaBD();
    }

    public int guardar(PlanDatos pDatos) {
        String sql_guardar;
        sql_guardar = "INSERT INTO plan_datos VALUES ('"
                + pDatos.getCod_plan_datos() + "', '"
                + pDatos.getCosto_internet() + "', '"
                + pDatos.getCosto_correo() + "')";
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

    public PlanDatos consultar(String cod_plan) {
        PlanDatos pDatos = new PlanDatos();
        String sql_select;
        sql_select = "SELECT * FROM plan_datos WHERE cod_plan_datos='" + cod_plan + "'";
        try {
            Connection conn = fachada.conectar();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            if (tabla.next()) {

                pDatos.setCod_plan_datos(tabla.getString("cod_plan"));
                pDatos.setCosto_internet(tabla.getInt("costo_internet"));
                pDatos.setCosto_internet(tabla.getInt("costo_correo"));

            }

            conn.close();
            System.out.println("Conexion cerrada");
            return pDatos;

        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }

        return null;
    }
public LinkedList consultar(String cod_plan_datos, String costo_internet, String costo_correo) {
        
        LinkedList pDatosConsulta = new LinkedList();
        String sql_select = "SELECT * FROM plan_datos ";
        if (!cod_plan_datos.equals("") || !costo_internet.equals("") || !costo_correo.equals("")) {
            sql_select += "WHERE ";
        }
        if (!cod_plan_datos.equals("")) {
            sql_select += "cod_plan_datos = '" + cod_plan_datos + "' AND ";
        }
        if (!costo_internet.equals("")) {
            sql_select += "costo_internet LIKE '%" + costo_internet + "%'" + " AND ";
        }
        if (!costo_correo.equals("")) {
            sql_select += "costo_correo LIKE '%" + costo_correo + "%'" + " AND ";
        }
        sql_select = sql_select.substring(0, sql_select.length() - 5);
        try {
            Connection conn = fachada.conectar();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            while (tabla.next()) {
                PlanDatos pDatos= new PlanDatos();
                pDatos.setCod_plan_datos(tabla.getString("cod_plan_datos"));
                pDatos.setCosto_internet(tabla.getInt("costo_internet"));
                pDatos.setCosto_correo(tabla.getInt("costo_correo"));
                pDatosConsulta.add(pDatos);
            }
            conn.close();
            System.out.println("Conexion cerrada");
            return pDatosConsulta;

        } catch (SQLException e) {
            System.out.println(e);
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println(e);
        }

        return null;
    }

    public int editar(PlanDatos pDatos) {

        String sql_update;
        sql_update = "UPDATE plan_datos SET "
                + "costo_internet='" + pDatos.getCosto_internet() + "', "
                + "costo_correo='" + pDatos.getCosto_correo() + "' "
                + "WHERE cod_plan_datos='" + pDatos.getCod_plan_datos() + "'";
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


