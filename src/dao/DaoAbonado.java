/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import accesoDatos.FachadaBD;
import java.sql.*;
import java.util.LinkedList;
import logica.Abonado;
import logica.Equipo;

/**
 *
 * @author juandrd
 */
public class DaoAbonado {

    FachadaBD fachada;

    public DaoAbonado() {
        fachada = new FachadaBD();
    }//

    public int guardar(Abonado abonado) {
        String sql_guardar;
        sql_guardar = "INSERT INTO abonado VALUES ('"
                + abonado.getId() + "', '"
                + abonado.getTipo_documento() + "', '"
                + abonado.getNombres() + "', '"
                + abonado.getApellidos() + "','"
                + abonado.getDireccion() + "','"
                + abonado.getGenero() + "','"
                + abonado.getEstado_civil() + "','"
                + abonado.getFecha_nacimiento() + "','"
                + abonado.getComuna() + "','"
                + abonado.getBarrio() + "','"
                + abonado.getCiudad() + "','"
                + abonado.getTipo() + "','"
                + abonado.getImei().getImei() + "')";
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

    
    public Abonado consultar(String id) {
        Abonado a = new Abonado();
        String sql_select;
        sql_select = "SELECT * FROM abonado WHERE id='" + id + "'";
        try {
            Connection conn = fachada.conectar();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);

            //
            if (tabla.next()) {

                a.setNombres(tabla.getString("nombres"));
                a.setApellidos(tabla.getString("apellidos"));
                a.setDireccion(tabla.getString("direccion"));
                a.setGenero(tabla.getString("genero"));
                a.setEstado_civil(tabla.getString("estado_civil"));
                a.setFecha_nacimiento(tabla.getDate("fecha_nacimiento"));
                a.setComuna(tabla.getString("comuna"));
                a.setBarrio(tabla.getString("barrio"));
                a.setCiudad(tabla.getString("ciudad"));
                a.setTipo(tabla.getString("tipo"));
                a.setImei(new DaoEquipo().consultar(tabla.getString("imei")));
                

            }

            conn.close();
            System.out.println("Conexion cerrada");
            return a;

        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }

        return null;
    }
    
    
    public LinkedList consultar(String id,String tipo_documento,String nombres,
            String apellidos,String direccion,String genero,String estado_civil, 
            String fecha_nacimiento,String comuna,String barrio,String ciudad,
            String tipo,String imei)
    {
    
         LinkedList abonadoConsulta = new LinkedList();
        String sql_select = "SELECT * FROM abonado      ";
        if (!id.equals("") 
            || !tipo_documento.equals("")
            || !apellidos.equals("")
            || !direccion.equals("")
            || !genero.equals("")
            || !estado_civil.equals("")
            || !fecha_nacimiento.equals("")
            || !comuna.equals("")
            || !barrio.equals("")
            || !ciudad.equals("")
            || !tipo.equals("")
            || !imei.equals("")) {
            sql_select += "WHERE ";
        }
      
        if(!id.equals("")){
            sql_select += "id LIKE '%"+id+"%'"+" AND ";
        }
        if(!tipo_documento.equals("")){
            sql_select += "tipo_documento LIKE '%"+tipo_documento+"%'"+" AND ";
        }
        if(!apellidos.equals("")){
            sql_select += "apellidos LIKE '%"+apellidos+"%'"+" AND ";
        }
        if(!direccion.equals("")){
            sql_select += "direccion LIKE '%"+direccion+"%'"+" AND ";
        }
        if(!genero.equals("")){
            sql_select += "genero LIKE '%"+genero+"%'"+" AND ";
        }
        if(!estado_civil.equals("")){
            sql_select += "estado_civil LIKE '%"+estado_civil+"%'"+" AND ";
        }
        if(!fecha_nacimiento.equals("")){
            sql_select += "fecha_nacimiento LIKE '%"+fecha_nacimiento+"%'"+" AND ";
        }
        if(!comuna.equals("")){
            sql_select += "comuna LIKE '%"+comuna+"%'"+" AND ";
        }
        if(!barrio.equals("")){
            sql_select += "barrio LIKE '%"+barrio+"%'"+" AND ";
        }
        if(!ciudad.equals("")){
            sql_select += "ciudad LIKE '%"+ciudad+"%'"+" AND ";
        }
        if(!tipo.equals("")){
            sql_select += "tipo LIKE '%"+tipo+"%'"+" AND ";
        }
        if(!imei.equals("")){
            sql_select += "imei LIKE '%"+imei+"%'"+" AND ";
        }
                     
        sql_select = sql_select.substring(0, sql_select.length() - 5);
        try {
            Connection conn = fachada.conectar();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            while (tabla.next()) {
                Abonado a = new Abonado();
                a.setId(tabla.getString("id"));
                a.setTipo_documento(tabla.getString("tipo_documento"));
                a.setNombres(tabla.getString("nombres"));
                a.setApellidos(tabla.getString("apellidos"));
                a.setDireccion(tabla.getString("direccion"));
                a.setGenero(tabla.getString("genero"));
                a.setEstado_civil(tabla.getString("estado_civil"));
                a.setFecha_nacimiento(Date.valueOf(tabla.getString("fecha_nacimiento")));
                a.setComuna(tabla.getString("comuna"));
                a.setBarrio(tabla.getString("barrio"));
                a.setCiudad(tabla.getString("ciudad"));
                a.setTipo(tabla.getString("tipo"));
                a.setImei(new DaoEquipo().consultar(tabla.getString("imei")));
                
                
            }
            conn.close();
            System.out.println("Conexion cerrada");
            return abonadoConsulta;

        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }

        return null;
        
    
    
    }

    public int editar(Abonado abonado) {

        String sql_update;
        sql_update = "UPDATE abonado SET ('"
                + abonado.getTipo_documento() + "', '"
                + abonado.getNombres() + "', '"
                + abonado.getApellidos() + "','"
                + abonado.getDireccion() + "','"
                + abonado.getGenero() + "','"
                + abonado.getEstado_civil() + "','"
                + abonado.getFecha_nacimiento() + "','"
                + abonado.getComuna() + "','"
                + abonado.getBarrio() + "','"
                + abonado.getCiudad() + "','"
                + abonado.getTipo() + "','"
                + abonado.getImei().getImei() + "' "
                + "WHERE id='"
                + abonado.getId()+"' ";
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
