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
import logica.Cia_local;
import logica.ConsumoMensaje;
import logica.Simcard;

/**
 *
 * @author chokuno
 */
public class DaoConsumoMensaje {
     FachadaBD fachada;

    public DaoConsumoMensaje() {
        fachada = new FachadaBD();
    }

    public int guardar(ConsumoMensaje consumoMsj) {
        String sql_guardar;
        sql_guardar = "INSERT INTO consumo_mensaje VALUES ('"
                + consumoMsj.getSimcard().getCodigo() + "', '"
                + consumoMsj.getCompania_local().getId()+ "', "
                + consumoMsj.getMsjs_enviados() + ")";
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

    public ConsumoMensaje consultar(String simcard) {
        ConsumoMensaje consumoMsj = new ConsumoMensaje();
        String sql_select;
        sql_select = "SELECT * FROM consumo_mensaje WHERE simcard='" + simcard + "'";
        try {
            Connection conn = fachada.conectar();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            if (tabla.next()) {

                consumoMsj.setSimcard(new DaoSimcard().consultar(tabla.getString("simcard")));
                consumoMsj.setCompania_local(new DaoCia_local().consultar(tabla.getString("cia_local")));
                consumoMsj.setMsjs_enviados(tabla.getInt("msjs_enviados"));
                
            }

            conn.close();
            System.out.println("Conexion cerrada");
            return consumoMsj;

        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }

        return null;
    }
public LinkedList consultar(String simcard,
     String compania_local,String msjs_enviados) {
        
        LinkedList consumoMsjsConsulta = new LinkedList();
        String sql_select = "SELECT * FROM consumo_mensaje ";
        if (!simcard.equals("") || !compania_local.equals("") || !msjs_enviados.equals("")
               ) {
            sql_select += "WHERE ";
        }
        if (!simcard.equals("")) {
            sql_select += "simcard = '" + simcard + "' AND ";
        }
        if (!compania_local.equals("")) {
            sql_select += "cia_local LIKE '%" + compania_local + "%'" + " AND ";
        }
        if (!msjs_enviados.equals("")) {
            sql_select += "msjs_enviados LIKE '%" + msjs_enviados + "%'" + " AND ";
        }
        
        sql_select = sql_select.substring(0, sql_select.length() - 5);
        try {
            Connection conn = fachada.conectar();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            while (tabla.next()) {
                ConsumoMensaje consumoMsj= new ConsumoMensaje();
                
               consumoMsj.setSimcard(new DaoSimcard().consultar(tabla.getString("simcard")));
               consumoMsj.setCompania_local(new DaoCia_local().consultar(tabla.getString("cia_local")));
               consumoMsj.setMsjs_enviados(tabla.getInt("msjs_enviados"));
               
                consumoMsjsConsulta.add(consumoMsj);
            }
            conn.close();
            System.out.println("Conexion cerrada");
            return consumoMsjsConsulta;

        } catch (SQLException e) {
            System.out.println(e);
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println(e);
        }

        return null;
    }

    public int editar(ConsumoMensaje consumoMsj) {

        String sql_update;
        sql_update = "UPDATE consumo_mensaje SET "
                + "cia_local='" + consumoMsj.getCompania_local().getId() + "', "
                + "msjs_enviados=" + consumoMsj.getMsjs_enviados() + " "
                + "WHERE simcard='" + consumoMsj.getSimcard().getCodigo() + "'";
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
