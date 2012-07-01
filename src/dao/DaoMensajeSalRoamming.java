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
import logica.MensajeSalRoamming;

/**
 *
 * @author chokuno
 */
public class DaoMensajeSalRoamming {

    FachadaBD fachada;

    public DaoMensajeSalRoamming() {
        fachada = new FachadaBD();
    }

    public int guardar(MensajeSalRoamming msjRoam) {
        String sql_guardar;
        sql_guardar = "INSERT INTO mensaje_saliente_roaming VALUES ('"
                + msjRoam.getSim().getCodigo() + "', '"
                + msjRoam.getFecha() + "', '"
                + msjRoam.getHora() + "', '"
                + msjRoam.getcInter().getId() + "','"
                + msjRoam.getTel_destino() + "')";
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

    public MensajeSalRoamming consultar(String simcard) {
        MensajeSalRoamming msjRoam = new MensajeSalRoamming();
        String sql_select;
        sql_select = "SELECT * FROM mensaje_saliente_roaming WHERE simcard='" + simcard + "'";
        try {
            Connection conn = fachada.conectar();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            if (tabla.next()) {
                msjRoam.setSim(new DaoSimcard().consultar(tabla.getString("simcard")));
                msjRoam.setFecha(tabla.getDate("fecha"));
                msjRoam.setHora(tabla.getTime("hora"));
                msjRoam.setcInter(new DaoCia_internacional().consultar(tabla.getString("cia_internacional")));
                msjRoam.setTel_destino(tabla.getString("tel_destino"));
            }
            conn.close();
            System.out.println("Conexion cerrada");
            return msjRoam;

        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }

        return null;
    }

    public LinkedList consultar(String sim, String fecha,
            String cInter, String tel_destino) {
        LinkedList msjRoamConsulta = new LinkedList();
        String sql_select = "SELECT * FROM mensaje_saliente_roaming      ";
        if (!sim.equals("") || !fecha.equals("")
                || !cInter.equals("") || !tel_destino.equals("")) {
            sql_select += "WHERE ";
        }
        if (!sim.equals("")) {
            sql_select += "simcard ='" + sim + "' AND ";
        }
        if (!fecha.equals("")) {
            sql_select += "fecha = '" + fecha + "'" + " AND ";
        }
        if (!cInter.equals("")) {
            sql_select += "cia_internacional = '" + cInter + "'" + " AND ";
        }
        if (!tel_destino.equals("")) {
            sql_select += "tel_destino = '" + tel_destino + "'" + " AND ";
        }
        System.out.println(sql_select);
        sql_select = sql_select.substring(0, sql_select.length() - 5);
        try {
            Connection conn = fachada.conectar();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            while (tabla.next()) {
                MensajeSalRoamming msjRoam = new MensajeSalRoamming();
                msjRoam.setSim(new DaoSimcard().consultar(tabla.getString("simcard")));
                msjRoam.setFecha(tabla.getDate("fecha"));
                msjRoam.setHora(tabla.getTime("hora"));
                msjRoam.setcInter(new DaoCia_internacional().consultar(tabla.getString("cia_internacional")));
                msjRoam.setTel_destino(tabla.getString("tel_destino"));
                
                msjRoamConsulta.add(msjRoam);
            }
            conn.close();
            System.out.println("Conexion cerrada");
            return msjRoamConsulta;

        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }

        return null;
    }

    public int editar(MensajeSalRoamming msjRoam) {

        String sql_update;
        sql_update = "UPDATE mensaje_saliente_roaming SET "
                + "fecha=" + msjRoam.getFecha() + ", "
                + "hora=" + msjRoam.getHora() + ", "
                + "cia_internacional='" + msjRoam.getcInter().getId() + "',"
                + "tel_destino='" + msjRoam.getTel_destino() + "'"
                + " WHERE simcard='" + msjRoam.getSim().getCodigo() + "'";
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
