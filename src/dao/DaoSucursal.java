/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import accesoDatos.FachadaBD;
import java.sql.*;
import logica.Sucursal;
import java.util.LinkedList;

/**
 *
 * @author juandrd
 */
public class DaoSucursal {

    FachadaBD fachada;

    public DaoSucursal() {
        fachada = new FachadaBD();
    }

    public int guardar(Sucursal sucursal) {
        String sql_guardar;
        sql_guardar = "INSERT INTO sucursal VALUES ('"
                + sucursal.getCod_sucursal() + "', '"
                + sucursal.getNombre() + "', '"
                + sucursal.getCiudad() + "', '"
                + sucursal.getDireccion() + "','"
                + sucursal.getTelefono() + "')";
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

    public Sucursal consultar(String cod_sucursal) {
        Sucursal s = new Sucursal();
        String sql_select;
        sql_select = "SELECT * FROM sucursal WHERE cod_sucursal='" + cod_sucursal + "'";
        try {
            Connection conn = fachada.conectar();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);

            //
            if (tabla.next()) {

                s.setCod_sucursal(tabla.getString("cod_sucursal"));
                s.setNombre(tabla.getString("nombre"));
                s.setCiudad(tabla.getString("ciudad"));
                s.setDireccion(tabla.getString("direccion"));
                s.setTelefono(tabla.getString("telefono"));

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
    
    
    public LinkedList consultar(String cod_s, String nombre_s, String ciudad_s, String direccion_s,
                                 String telefono_s) {
        LinkedList sucursalConsulta = new LinkedList();
        String sql_select = "SELECT * FROM sucursal      ";
        if (!cod_s.equals("") || !nombre_s.equals("") || !ciudad_s.equals("")
            || !direccion_s.equals("") || !telefono_s.equals("")) {
            sql_select += "WHERE ";
        }
        if (!cod_s.equals("")) {
            sql_select += "cod_sucursal ='" + cod_s + "' AND ";
        }
        if(!nombre_s.equals("")){
            sql_select += "nombre LIKE '%"+nombre_s+"%'"+" AND ";
        }
        if(!ciudad_s.equals("")){
            sql_select += "ciudad LIKE '%"+ciudad_s+"%'"+" AND ";
        }
        if(!direccion_s.equals("")){
            sql_select += "direccion LIKE '%"+direccion_s+"%'"+" AND ";
        }
        if(!telefono_s.equals("")){
            sql_select += "telefono LIKE '%"+telefono_s+"%'"+" AND ";
        }
        
        sql_select = sql_select.substring(0, sql_select.length() - 5);
        try {
            Connection conn = fachada.conectar();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            while (tabla.next()) {
                Sucursal suc = new Sucursal();
                suc.setCod_sucursal(tabla.getString("cod_sucursal"));
                suc.setNombre(tabla.getString("nombre"));
                suc.setCiudad(tabla.getString("ciudad"));
                suc.setDireccion(tabla.getString("direccion"));
                suc.setTelefono(tabla.getString("telefono"));
                sucursalConsulta.add(suc);
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

    public int editar(Sucursal s) {

        String sql_update;
        sql_update = "UPDATE sucursal SET "
                + "nombre='" + s.getNombre() + "', "
                + "ciudad='" + s.getCiudad() + "', "
                + "direccion='" + s.getDireccion() + "', "
                + "telefono='" + s.getTelefono() + "' "
                + " WHERE cod_sucursal='" + s.getCod_sucursal() + "'";
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
