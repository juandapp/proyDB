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
import logica.Recarga;
import logica.Simcard;

/**
 *
 * @author juandrd
 */
public class DaoRecarga {

    FachadaBD fachada;

    public DaoRecarga() {
        fachada = new FachadaBD();
    }

    public int guardar(Recarga recarga) {
        String sql_guardar;
        sql_guardar = "INSERT INTO recarga VALUES ("
                + recarga.getValor() + ", '"
                + recarga.getFecha() + "', '"
                + recarga.getMedio_recarga() + "', '"
                + recarga.getSimcard().getCodigo()+ "')";
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

  
public LinkedList consultar(String valor, String fecha, String medio_recarga, String simcard) {
        
        LinkedList recargaConsulta = new LinkedList();
        String sql_select = "SELECT * FROM recarga  JOIN simcard  ON simcard=codigo     ";
        if (!valor.equals("") || !fecha.equals("") || !medio_recarga.equals("") || !simcard.equals("")) {
            sql_select += "WHERE ";
        }
        if (!valor.equals("")) {
            sql_select += "valor = " + valor + " AND ";
        }
        if (!fecha.equals("")) {
            sql_select += "fecha LIKE '%" + fecha + "%'" + " AND ";
        }
        if (!medio_recarga.equals("")) {
            sql_select += "medio_recarga LIKE '%" + medio_recarga + "%'" + " AND ";
        }
        if (!simcard.equals("")) {
            sql_select += "simcard = '" + simcard + "'" + " AND ";
        }
        
        sql_select = sql_select.substring(0, sql_select.length() - 5);
        try {
            Connection conn = fachada.conectar();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            while (tabla.next()) {
                Recarga recarga = new Recarga();
                Simcard sim = new Simcard();
                sim.setCodigo(tabla.getString("codigo"));
                sim.setNum_telefono(tabla.getString("num_telefono"));
                sim.setActivacion_internet(tabla.getString("activacion_internet"));
                sim.setBloqueado_por_robo(tabla.getString("bloqueado_por_robo"));
                sim.setActivacion_correo(tabla.getString("activacion_correo"));
                 sim.setAutorizacion_roaming(tabla.getString("autorizacion_roaming"));
                recarga.setSimcard(sim);
                recarga.setValor(tabla.getInt("valor"));
                recarga.setFecha(tabla.getDate("fecha"));
                recarga.setMedio_recarga(tabla.getString("medio_recarga"));
                recargaConsulta.add(recarga);
            }
            conn.close();
            System.out.println("Conexion cerrada");
            return recargaConsulta;

        } catch (SQLException e) {
            System.out.println(e);
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println(e);
        }

        return null;
    }

    public int editar(Recarga recarga) {

        String sql_update;
        sql_update = "UPDATE recarga SET "
                + "valor=" + recarga.getValor() + ", "
                + "fecha='" + recarga.getFecha() + "', "
                + "medio_recarga='" + recarga.getMedio_recarga() + "', "
                + "simcard='" + recarga.getSimcard() + "', "
                + "WHERE simcard='" + recarga.getSimcard() + "'";
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
