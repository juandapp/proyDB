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
import logica.Promocion;

/**
 *
 * @author juandrd
 */
public class DaoPromocion {

    FachadaBD fachada;

    public DaoPromocion() {
        fachada = new FachadaBD();
    }//

    public int guardar(Promocion pro) {
        String sql_guardar;
        sql_guardar = "INSERT INTO promocion VALUES ('"
                + pro.getNombre() + "', '"
                + pro.getDescripcion() + "', '"
                + pro.getCod_plan().getCod_plan().getCod_plan() + "')";
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

    public Promocion consultar(String nombre) {
        Promocion p = new Promocion();
        String sql_select;
        sql_select = "SELECT * FROM promocion WHERE nombre='" + nombre + "'";
        try {
            Connection conn = fachada.conectar();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);

            //
            if (tabla.next()) {

                p.setNombre(tabla.getString("nombre"));
                p.setDescripcion(tabla.getString("descripcion"));
                p.setCod_plan(new DaoPrepago().consultar(
                             tabla.getString("cod_plan")));
            }

            conn.close();
            System.out.println("Conexion cerrada");
            return p;


        } catch (SQLException ex) {
            System.out.println(ex);
        } catch (Exception ex) {
            System.out.println(ex);
        }

        return null;
    }
    
    public LinkedList consultar(String nombre, String cod_plan) {
        LinkedList promocionConsulta = new LinkedList();
        String sql_select = "SELECT * FROM promocion      ";
        if (!nombre.equals("") || !cod_plan.equals("")) {
            sql_select += "WHERE ";
        }
        if (!nombre.equals("")) {
            sql_select += "nombre ='" + nombre + "' AND ";
        }
        if(!cod_plan.equals("")){
            sql_select += "cod_plan LIKE '%"+cod_plan+"%'"+" AND ";
        }
      
                
        sql_select = sql_select.substring(0, sql_select.length() - 5);
        try {
            Connection conn = fachada.conectar();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            while (tabla.next()) {
                Promocion p = new Promocion();
                p.setNombre(tabla.getString("nombre"));
                p.setDescripcion(tabla.getString("descripcion"));
                p.setCod_plan(new DaoPrepago().consultar(tabla.getString("cod_plan")));
                promocionConsulta.add(p);
            }
            conn.close();
            System.out.println("Conexion cerrada");
            return promocionConsulta;

        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }

        return null;
    }


    public int editar(Promocion pro) {

        String sql_update;
        sql_update = "UPDATE promocion SET "
                + "descripcion='" + pro.getDescripcion() + "', "
                + "cod_plan='" + pro.getCod_plan() + "' "
                + "WHERE nombre='"+ pro.getNombre() + "'";
        try {
            Connection conn = fachada.conectar();
            Statement sentencia = conn.createStatement();
            sentencia.executeUpdate(sql_update);


            conn.close();

            System.out.println("Conexion cerrada");
            return 0;

        } catch (SQLException ex) {
            System.out.println(ex);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return -1;
    }
}
