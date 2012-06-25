/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import accesoDatos.FachadaBD;
import java.sql.*;
import java.util.LinkedList;
import logica.Cia_local;
import logica.Llamada;
import logica.Simcard;

/**
 *
 * @author chokuno
 */
public class DaoLlamada {
  
    FachadaBD fachada;

    public DaoLlamada() {
        fachada = new FachadaBD();
    }

    public int guardar(Llamada llamada) {
        String sql_guardar;
        sql_guardar = "INSERT INTO llamada VALUES ('"
                + llamada.getSim().getCodigo()+ "', '"
                + llamada.getHora_inicio() + "', '"
                + llamada.getFecha()+ "', '"
                + llamada.getTelefono_destino() + "', '"
                + llamada.getHora_fin() + "','"
                + llamada.getcLocal().getId() + "')";
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

    public Llamada consultar(String simcard) {
        Llamada llamada = new Llamada();
        String sql_select;
        sql_select = "SELECT * FROM llamada WHERE simcard='" + simcard + "'";
        try {
            Connection conn = fachada.conectar();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);

            //
            if (tabla.next()) {

                llamada.setSim(new DaoSimcard().consultar(tabla.getString("simcard")));
                llamada.setHora_inicio(tabla.getTime("hora_inicio"));
                llamada.setFecha(tabla.getDate("simcard"));
                llamada.setTelefono_destino(tabla.getString("tel_destino"));
                llamada.setHora_fin(tabla.getTime("hora_fin"));
                llamada.setcLocal(new DaoCia_local().consultar(tabla.getString("cia_local")));

            }

            conn.close();
            System.out.println("Conexion cerrada");
            return llamada;

        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }

        return null;
    }

    public LinkedList consultar(String sim,String hora_inicio,String fecha,
            String telefono_destino,String hora_fin,String cLocal) {
        LinkedList llamadaConsulta = new LinkedList();
        String sql_select = "SELECT * FROM llamada      ";
        if (!sim.equals("") || !hora_inicio.equals("") || !fecha.equals("")
                || !telefono_destino.equals("") || !hora_fin.equals("") || !cLocal.equals("")) {
            sql_select += "WHERE ";
        }
        if (!sim.equals("")) {
            sql_select += "simcard ='" + sim + "' AND ";
        }
        if (!hora_inicio.equals("")) {
            sql_select += "hora_inicio LIKE '%" + hora_inicio + "%'" + " AND ";
        }
        if (!fecha.equals("")) {
            sql_select += "fecha LIKE '%" + fecha + "%'" + " AND ";
        }
        if (!telefono_destino.equals("")) {
            sql_select += "tel_destino LIKE '%" + telefono_destino + "%'" + " AND ";
        }
        if (!hora_fin.equals("")) {
            sql_select += "hora_fin LIKE '%" + hora_fin + "%'" + " AND ";
        }
        
        if (!cLocal.equals("")) {
            sql_select += "cia_local LIKE '%" + cLocal + "%'" + " AND ";
        }

        sql_select = sql_select.substring(0, sql_select.length() - 5);
        try {
            Connection conn = fachada.conectar();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            while (tabla.next()) {
                Llamada llamada = new Llamada();
                llamada.setSim(new DaoSimcard().consultar(tabla.getString("simcard")));
                llamada.setHora_inicio(tabla.getTime("hora_inicio"));
                llamada.setFecha(tabla.getDate("simcard"));
                llamada.setTelefono_destino(tabla.getString("tel_destino"));
                llamada.setHora_fin(tabla.getTime("hora_fin"));
                llamada.setcLocal(new DaoCia_local().consultar(tabla.getString("cia_local")));
                llamadaConsulta.add(llamada);
            }
            conn.close();
            System.out.println("Conexion cerrada");
            return llamadaConsulta;

        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }

        return null;
    }

    public int editar(Llamada llamada) {

        String sql_update;
        sql_update = "UPDATE simcard SET '"
                + llamada.getHora_inicio() + "', '"
                + llamada.getFecha()+ "', '"
                + llamada.getTelefono_destino() + "', '"
                + llamada.getHora_fin() + "','"
                + llamada.getcLocal().getId() + "'"
                + " WHERE codigo='" + llamada.getSim().getCodigo() + "'";
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
