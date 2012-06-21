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
import logica.Equipo;

/**
 *
 * @author juandrd
 */
public class DaoEquipo {

    FachadaBD fachada;

    public DaoEquipo() {
        fachada = new FachadaBD();
    }//

    public int guardar(Equipo equipo) {
        String sql_guardar;
        sql_guardar = "INSERT INTO equipo VALUES ('"
                + equipo.getImei() + "', '"
                + equipo.getModelo() + "', '"
                + equipo.getMarca() + "')";
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

    public Equipo consultar(String imei) {
        Equipo e = new Equipo();
        String sql_select;
        sql_select = "SELECT * FROM equipo WHERE imei='" + imei + "'";
        try {
            Connection conn = fachada.conectar();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);

            //
            if (tabla.next()) {

                e.setImei(tabla.getString("imei"));
                e.setModelo(tabla.getString("modelo"));
                e.setMarca(tabla.getString("marca"));
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
    
    public LinkedList consultar(String imei, String modelo, String marca) {
        LinkedList sucursalConsulta = new LinkedList();
        String sql_select = "SELECT * FROM equipo      ";
        if (!imei.equals("") || !modelo.equals("") || !marca.equals("")) {
            sql_select += "WHERE ";
        }
        if (!imei.equals("")) {
            sql_select += "imei ='" + imei + "' AND ";
        }
        if(!modelo.equals("")){
            sql_select += "modelo LIKE '%"+modelo+"%'"+" AND ";
        }
        if(!marca.equals("")){
            sql_select += "marca LIKE '%"+marca+"%'"+" AND ";
        }
                
        sql_select = sql_select.substring(0, sql_select.length() - 5);
        try {
            Connection conn = fachada.conectar();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            while (tabla.next()) {
                Equipo eq = new Equipo();
                eq.setImei(tabla.getString("imei"));
                eq.setModelo(tabla.getString("modelo"));
                eq.setMarca(tabla.getString("marca"));
                sucursalConsulta.add(eq);
            }
            conn.close();
            System.out.println("Conexion cerrada");
            return sucursalConsulta;

        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }

        return null;
    }


    public int editar(Equipo e) {

        String sql_update;
        sql_update = "UPDATE equipo SET "
                + "modelo='" + e.getModelo() + "', "
                + "marca='" + e.getMarca() + "' "
                + "WHERE imei='"+ e.getImei() + "'";
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
