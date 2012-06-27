/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import accesoDatos.FachadaBD;
import java.sql.*;
import logica.Simcard;
import java.util.LinkedList;

/**
 *
 * @author juandrd
 */
public class DaoSimcard {

    FachadaBD fachada;

    public DaoSimcard() {
        fachada = new FachadaBD();
    }

    public int guardar(Simcard simcard) {
        String sql_guardar;
        sql_guardar = "INSERT INTO simcard VALUES ('"
                + simcard.getCodigo() + "', '"
                + simcard.getNum_telefono() + "', '"
                + simcard.getActivacion_internet() + "', '"
                + simcard.getBloqueado_por_robo() + "','"
                + simcard.getActivacion_correo() + "','"
                + simcard.getAutorizacion_roaming() + "')";
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

    public Simcard consultar(String codigo) {
        Simcard s = new Simcard();
        String sql_select;
        sql_select = "SELECT * FROM simcard WHERE codigo='" + codigo + "'";
        try {
            Connection conn = fachada.conectar();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);

            //
            if (tabla.next()) {

                s.setCodigo(tabla.getString("codigo"));
                s.setNum_telefono(tabla.getString("num_telefono"));
                s.setActivacion_internet(tabla.getString("activacion_internet"));
                s.setBloqueado_por_robo(tabla.getString("bloqueado_por_robo"));
                s.setActivacion_correo(tabla.getString("activacion_correo"));
                 s.setAutorizacion_roaming(tabla.getString("autorizacion_roaming"));

            }

            conn.close();
            System.out.println("Conexion cerrada");
            return s;

        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }

        return null;
    }

    public LinkedList consultar(String codigo, String num_telefono, String activacion_internet, String bloqueado_por_robo,
            String activacion_correo, String autorizacion_roaming) {
        LinkedList simcardConsulta = new LinkedList();
        String sql_select = "SELECT * FROM simcard      ";
        if (!codigo.equals("") || !num_telefono.equals("") || !activacion_internet.equals("")
                || !bloqueado_por_robo.equals("") || !activacion_correo.equals("") || !autorizacion_roaming.equals("")) {
            sql_select += "WHERE ";
        }
        if (!codigo.equals("")) {
            sql_select += "codigo ='" + codigo + "' AND ";
        }
        if (!num_telefono.equals("")) {
            sql_select += "num_telefono ='" + num_telefono  + "' AND ";
        }
        if (!activacion_internet.equals("")) {
            sql_select += "activacion_internet ='" + activacion_internet + "'" + " AND ";
        }
        if (!bloqueado_por_robo.equals("")) {
            sql_select += "bloqueado_por_robo = '" + bloqueado_por_robo + "'" + " AND ";
        }
        if (!activacion_correo.equals("")) {
            sql_select += "activacion_correo = '" + activacion_correo + "'" + " AND ";
        }
        
        if (!autorizacion_roaming.equals("")) {
            sql_select += "autorizacion_roaming = '" + autorizacion_roaming + "'" + " AND ";
        }

        sql_select = sql_select.substring(0, sql_select.length() - 5);
        try {
            Connection conn = fachada.conectar();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            while (tabla.next()) {
                Simcard sim = new Simcard();
                sim.setCodigo(tabla.getString("codigo"));
                sim.setNum_telefono(tabla.getString("num_telefono"));
                sim.setActivacion_internet(tabla.getString("activacion_internet"));
                sim.setBloqueado_por_robo(tabla.getString("bloqueado_por_robo"));
                sim.setActivacion_correo(tabla.getString("activacion_correo"));
                sim.setAutorizacion_roaming(tabla.getString("activacion_correo"));
                simcardConsulta.add(sim);
            }
            conn.close();
            System.out.println("Conexion cerrada");
            return simcardConsulta;

        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }

        return null;
    }

    public int editar(Simcard sim) {

        String sql_update;
        sql_update = "UPDATE simcard SET "
                + "num_telefono='" + sim.getNum_telefono() + "', "
                + "activacion_internet='" + sim.getActivacion_internet() + "', "
                + "bloqueado_por_robo='" + sim.getBloqueado_por_robo() + "', "
                + "activacion_correo='" + sim.getActivacion_correo() + "',"
                + "autorizacion_roaming='" + sim.getAutorizacion_roaming() + "' "
                + " WHERE codigo='" + sim.getCodigo() + "'";
        try {
            Connection conn = fachada.conectar();
            Statement sentencia = conn.createStatement();
            sentencia.executeUpdate(sql_update);


            conn.close();

            System.out.println("Conexion cerrada");
            return 0;

        } catch (SQLException e) {
            System.out.println("Conexion aquii");
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        return -1;
    }
}
