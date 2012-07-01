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
import logica.LlamadaEntRoamming;

/**
 *
 * @author Juandapp
 */
public class DaoLlamadaEntRoamming {

    FachadaBD fachada;

    public DaoLlamadaEntRoamming() {
        fachada = new FachadaBD();
    }

    public int guardar(LlamadaEntRoamming llamaRoam) {
        String sql_guardar;
        sql_guardar = "INSERT INTO llamada_entrante_roaming VALUES ('"
                + llamaRoam.getSim().getCodigo() + "', '"
                + llamaRoam.getFecha() + "', '"
                + llamaRoam.getHora_inicio() + "', '"
                + llamaRoam.getHora_fin() + "','"
                + llamaRoam.getPais_destino() + "','"
                + llamaRoam.getTel_Origen() + "','"
                + llamaRoam.getcInter().getId() + "')";
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

    public LlamadaEntRoamming consultar(String simcard) {
        LlamadaEntRoamming llamaRoam = new LlamadaEntRoamming();
        String sql_select;
        sql_select = "SELECT * FROM llamada_entrante_roaming WHERE simcard='" + simcard + "'";
        try {
            Connection conn = fachada.conectar();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);

            if (tabla.next()) {
                llamaRoam.setSim(new DaoSimcard().consultar(tabla.getString("simcard")));
                llamaRoam.setFecha(tabla.getDate("fecha"));
                llamaRoam.setHora_inicio(tabla.getTime("hora_inicio"));
                llamaRoam.setHora_fin(tabla.getTime("hora_fin"));
                llamaRoam.setPais_destino(tabla.getString("pais_destino"));
                llamaRoam.setTel_Origen(tabla.getString("tel_origen"));
                llamaRoam.setcInter(new DaoCia_internacional().consultar(tabla.getString("cia_internacional")));
            }
            conn.close();
            System.out.println("Conexion cerrada");
            return llamaRoam;

        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }

        return null;
    }

    public LinkedList consultar(String sim, String fecha, String hora_inicio,
            String hora_fin, String pais_destino, String tel_origen,
            String cInter) {
        LinkedList llamaRoamConsulta = new LinkedList();
        String sql_select = "SELECT * FROM llamada_entrante_roaming      ";
        if (!sim.equals("") || !fecha.equals("") || !hora_inicio.equals("")
                || !hora_fin.equals("") || !pais_destino.equals("") || !tel_origen.equals("")
                || !cInter.equals("")) {
            sql_select += "WHERE ";
        }
        if (!sim.equals("")) {
            sql_select += "simcard ='" + sim + "' AND ";
        }
        if (!fecha.equals("")) {
            sql_select += "fecha = '" + fecha + "'" + " AND ";
        }
        if (!hora_inicio.equals("")) {
            sql_select += "hora_inicio = '" + hora_inicio + "'" + " AND ";
        }
        if (!hora_fin.equals("")) {
            sql_select += "hora_fin = '" + hora_fin + "'" + " AND ";
        }
        if (!pais_destino.equals("")) {
            sql_select += "pais_destino LIKE '%" + pais_destino + "%'" + " AND ";
        }
        if (!tel_origen.equals("")) {
            sql_select += "tel_destino  ='" + tel_origen + "'" + " AND ";
        }
        if (!cInter.equals("")) {
            sql_select += "cia_internacional = '" + cInter + "'" + " AND ";
        }
        sql_select = sql_select.substring(0, sql_select.length() - 5);
        try {
            Connection conn = fachada.conectar();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            while (tabla.next()) {
                LlamadaEntRoamming llamaRoam = new LlamadaEntRoamming();
                llamaRoam.setSim(new DaoSimcard().consultar(tabla.getString("simcard")));
                llamaRoam.setFecha(tabla.getDate("fecha"));
                llamaRoam.setHora_inicio(tabla.getTime("hora_inicio"));
                llamaRoam.setHora_fin(tabla.getTime("hora_fin"));
                llamaRoam.setPais_destino(tabla.getString("pais_destino"));
                llamaRoam.setTel_Origen(tabla.getString("tel_origen"));
                llamaRoam.setcInter(new DaoCia_internacional().consultar(tabla.getString("cia_internacional")));
                llamaRoamConsulta.add(llamaRoam);
            }
            conn.close();
            System.out.println("Conexion cerrada");
            return llamaRoamConsulta;

        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }

        return null;
    }
//    public int editar(LlamadaSalRoamming llamaRoam) {
//
//        String sql_update;
//        sql_update = "UPDATE llamada_entrante_roaming SET "
//                + llamaRoam.getFecha() + "', '"
//                + llamaRoam.getHora_inicio() + "', '"
//                + llamaRoam.getHora_fin() + "','"
//                + llamaRoam.getPais_destino() + "','"
//                + llamaRoam.getTel_destino() + "','"
//                + llamaRoam.getcInter().getId() + "' "
//                + " WHERE simcard='" + llamaRoam.getSim().getCodigo() + "'";
//        try {
//            Connection conn = fachada.conectar();
//            Statement sentencia = conn.createStatement();
//            sentencia.executeUpdate(sql_update);
//
//
//            conn.close();
//
//            System.out.println("Conexion cerrada");
//            return 0;
//
//        } catch (SQLException e) {
//            System.out.println("Conexion aquii");
//            System.out.println(e);
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//        return -1;
//    }
}
