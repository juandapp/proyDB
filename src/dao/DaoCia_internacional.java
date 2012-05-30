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
import logica.Cia_internacional;

/**
 *
 * @author juandapp
 */
public class DaoCia_internacional {

    FachadaBD fachada;

    public DaoCia_internacional() {
        fachada = new FachadaBD();
    }

    public int guardar(Cia_internacional ci) {

        String sql_guardar = "INSERT INTO cia_internacional VALUES ('"
                + ci.getId() + "', '"
                + ci.getNombre() + "', '"
                + ci.getPais() + "', "
                + ci.getTarifa_mensajes() + ", "
                + ci.getTar_llamada_entra_inter() + ", "
                + ci.getTar_llamada_sale_inter() + ", "
                + ci.getTar_llamada_entra_nal() + ", "
                + ci.getTar_llamada_sale_nal() + ", "
                + ci.getTar_datos_recibidos() + ", "
                + ci.getTar_datos_enviados() + ")";
        try {
            Connection conn = fachada.conectar();
            Statement sentencia = conn.createStatement();
            int numFilas = sentencia.executeUpdate(sql_guardar);
            conn.close();
            return numFilas;
        } catch (SQLException ex) {
            System.out.println(ex);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return -1;
    }

    public Cia_internacional consultar(String id) {
        Cia_internacional ci = new Cia_internacional();
        String sql_consulta;
        sql_consulta = "SELECT * FROM cia_internacional WHERE id= '" + id + "'";
        try {
            Connection conn = fachada.conectar();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_consulta);
            if (tabla.next()) {
                ci.setId(tabla.getString("id"));
                ci.setNombre(tabla.getNString("nombre"));
                ci.setPais(tabla.getString("pais"));
                ci.setTarifa_mensajes(tabla.getInt("tarifa_mensajes"));
                ci.setTar_llamada_entra_inter(tabla.getInt("tar_llamada_entra_inter"));
                ci.setTar_llamada_sale_inter(tabla.getInt("tar_llamada_sale_inter"));
                ci.setTar_llamada_entra_nal(tabla.getInt("tar_llamada_entra_nal"));
                ci.setTar_llamada_sale_nal(tabla.getInt("tar_llamada_sale_nal"));
                ci.setTar_datos_recibidos(tabla.getInt("tar_datos_recibidos"));
                ci.setTar_datos_enviados(tabla.getInt("tar_datos_enviados"));
            }
            return ci;
        } catch (SQLException ex) {
            System.out.println(ex);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return null;
    }

    public int editar(Cia_internacional ci) {
        String sql_editar;
        sql_editar = "UPDATE cia_internacional SET "
                + "nombre='" + ci.getId() + "'"
                + "pais='" + ci.getPais() + "'"
                + "tarifa_mensajes=" + ci.getTarifa_mensajes() + ""
                + "tar_llamada_entra_inter=" + ci.getTar_llamada_entra_inter() + ""
                + "tar_llamada_sale_inter=" + ci.getTar_llamada_sale_inter() + ""
                + "tar_llamada_entra_nal=" + ci.getTar_llamada_entra_nal() + ""
                + "tar_llamada_sale_nal=" + ci.getTar_llamada_sale_nal() + ""
                + "tar_datos_recibidos=" + ci.getTar_datos_recibidos() + ""
                + "tar_datos_enviados=" + ci.getTar_datos_enviados() + ""
                + "WHERE id='" +ci.getId()+"'";
        
        try {
            Connection conn = fachada.conectar();
            Statement sentencia = conn.createStatement();
            sentencia.executeUpdate(sql_editar);
            return 0;            
        } catch (SQLException ex) { 
            System.out.println(ex);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return -1;
    }
}
