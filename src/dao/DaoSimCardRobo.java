/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import accesoDatos.FachadaBD;
import controlador.ControladorSimcard;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import logica.LlamadaEntRoamming;
import logica.Simcard;
import logica.SimcardRobo;

/**
 *
 * @author Juandapp
 */
public class DaoSimCardRobo {

    FachadaBD fachada;
    ControladorSimcard csimcard;

    public DaoSimCardRobo() {
        fachada = new FachadaBD();
        csimcard = new ControladorSimcard();
    }

    public int guardar(SimcardRobo scrobo) {
        String sql_guardar;
        sql_guardar = "INSERT INTO simcard_robo VALUES ('"
                + scrobo.getCod_SimCard().getCodigo() + "', '"
                + scrobo.getCiudad() + "', '"
                + scrobo.getFecha() + "')";
        Simcard sc = new Simcard();
        sc = csimcard.consultar(scrobo.getCod_SimCard().getCodigo());
        sc.setBloqueado_por_robo("Si");
        csimcard.editar(sc);

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

    public SimcardRobo consultar(String simcard) {
        SimcardRobo simcardrobo = new SimcardRobo();
        String sql_select;
        sql_select = "SELECT * FROM simcard_robo WHERE simcard='" + simcard + "'";
        try {
            Connection conn = fachada.conectar();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);

            if (tabla.next()) {
                simcardrobo.setCod_SimCard(new DaoSimcard().consultar(tabla.getString("simcard")));
                simcardrobo.setCiudad(tabla.getString("ciudad"));
                simcardrobo.setFecha(tabla.getDate("fecha"));
            }
            conn.close();
            System.out.println("Conexion cerrada");
            return simcardrobo;

        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }

        return null;
    }
    

    public LinkedList consultar(String sim, String fecha, String ciudad) {
        LinkedList simcardRobo = new LinkedList();
        String sql_select = "SELECT * FROM simcard_robo      ";
        if (!sim.equals("") || !fecha.equals("") || !ciudad.equals("")) {
            sql_select += "WHERE ";
        }
        if (!sim.equals("")) {
            sql_select += "simcard ='" + sim + "' AND ";
        }
        if (!fecha.equals("")) {
            sql_select += "fecha = '" + fecha + "'" + " AND ";
        }
        if (!ciudad.equals("")) {
            sql_select += "ciudad = '" + ciudad + "'" + " AND ";
        }        
        sql_select = sql_select.substring(0, sql_select.length() - 5);
        System.out.print(sql_select);
        try {
            Connection conn = fachada.conectar();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            while (tabla.next()) {
                SimcardRobo simcardR = new SimcardRobo();
                simcardR.setCod_SimCard(new DaoSimcard().consultar(tabla.getString("simcard")));
                simcardR.setCiudad(tabla.getString("ciudad"));
                simcardR.setFecha(tabla.getDate("fecha"));
                simcardRobo.add(simcardR);
            }
            conn.close();
            System.out.println("Conexion cerrada");
            return simcardRobo;

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
//                + llamaRoam.getpais_origen() + "','"
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
