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
import logica.Empresa;

/**
 *
 * @author juandrd
 */
public class DaoEmpresa {
    
FachadaBD fachada;

    DaoEmpresa() {
        fachada = new FachadaBD();
    }//

    public int guardar(Empresa e) {
        String sql_guardar;
        sql_guardar = "INSERT INTO empresa VALUES ('"
                + e.getNombre() + "', '"
                + e.getTelefono() + "', '"
                + e.getDireccion() + "', '"
                + e.getCod_plan().getCod_plan().getCod_plan() + "')";
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
    }//fin guardar

    public Empresa consultar(String nombre) {
        Empresa em = new Empresa();
        String sql_select;
        sql_select = "SELECT * FROM empresa WHERE nombre='" + nombre + "'";
        try {
            Connection conn = fachada.conectar();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);

            //
            if (tabla.next()) {
                
                em.setNombre(tabla.getString("nombre"));
                em.setTelefono(tabla.getString("telefono"));
                em.setDireccion(tabla.getString("direccion"));
                em.setCod_plan(new DaoPlan.consultar(new DaoPostpago().consultar(tabla.getString("cod_plan"))));
                
                
               
            }

            conn.close();
            System.out.println("Conexion cerrada");
            return em;
            
        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }

        return null;
    }

    public int editar(Empresa em) {

        String sql_update;
        sql_update = "UPDATE empresa  SET"
                + "telefono='" + em.getTelefono() + "'"
                + "direccion='" + em.getDireccion() + "'"
                + "cod_plan='" + em.getCod_plan() + "'"   
                + "WHERE nombre='" + em.getNombre() + "'";
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
