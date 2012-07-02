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
import logica.Empleado;
import logica.Abonado;

/**
 *
 * @author juandapp
 */
public class DaoConsultas {

    FachadaBD fachada;

    public DaoConsultas() {
        fachada = new FachadaBD();
    }

    public LinkedList clientesPorMes(String fecha_i, String fecha_f) {
        String sql_select;
        LinkedList consulta = new LinkedList();
        

        sql_select = "SELECT nombres,apellidos,direccion,ciudad,cod_plan,"
                + "fecha_ingreso, tipo "
                + "FROM contrato JOIN abonado ON id=id_abonado "
                + "WHERE "
                + "fecha_ingreso BETWEEN '"+fecha_i+"' AND '"+fecha_f+"'";
                
             try {
            Connection conn = fachada.conectar();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            while (tabla.next()) {
                String[] resultado=new String[7];
                resultado[0]=tabla.getString("nombres");
                resultado[1]=tabla.getString("apellidos");
                resultado[2]=tabla.getString("direccion");
                resultado[3]=tabla.getString("ciudad");
                resultado[4]=tabla.getString("cod_plan");
                resultado[5]=tabla.getString("fecha_ingreso");
                resultado[6]=tabla.getString("tipo");
                consulta.add(resultado);
            }
            conn.close();
            System.out.println("Conexion cerrada");
            return consulta;
        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    
    
    public LinkedList clientesPorTipo(String tipo) {
        String sql_select;
        LinkedList consulta = new LinkedList();
        

        sql_select = "SELECT nombres,apellidos,direccion,ciudad,cod_plan,"
                + "fecha_ingreso, tipo "
                + "FROM contrato JOIN abonado ON id=id_abonado "
                + "WHERE "
                + "tipo = '"+tipo+"'";
                
             try {
            Connection conn = fachada.conectar();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            while (tabla.next()) {
                String[] resultado=new String[7];
                resultado[0]=tabla.getString("nombres");
                resultado[1]=tabla.getString("apellidos");
                resultado[2]=tabla.getString("direccion");
                resultado[3]=tabla.getString("ciudad");
                resultado[4]=tabla.getString("cod_plan");
                resultado[5]=tabla.getString("fecha_ingreso");
                resultado[6]=tabla.getString("tipo");
                consulta.add(resultado);
            }
            conn.close();
            System.out.println("Conexion cerrada");
            return consulta;
        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
    
    
    
    public LinkedList planesMasEscogidos() {
        String sql_select;
        LinkedList consulta = new LinkedList();
        

        sql_select = "SELECT "+
                    "COUNT(cod_plan) AS suscriptores,cod_plan"+
                    "FROM contrato NATURAL JOIN plan"+
                    "GROUP BY cod_plan ORDER BY suscriptores DESC; ";
                
             try {
            Connection conn = fachada.conectar();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            while (tabla.next()) {
                String[] resultado=new String[2];
                resultado[0]=tabla.getString("suscriptores");
                resultado[1]=tabla.getString("cod_plan");
                consulta.add(resultado);
            }
            conn.close();
            System.out.println("Conexion cerrada");
            return consulta;
        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
    
    public LinkedList usuariosPlan(String tipo_plan) {
        String sql_select;
        LinkedList consulta = new LinkedList();
        

        sql_select = "SELECT "+
                    "id,nombres,apellidos,direccion,ciudad,"
                +   " cod_plan,simcard,fecha_ingreso"+
                    "FROM abonado join contrato "+
                    "where id=id_abonado and cod_plan IN "
                  + " (SELECT cod_plan from "+tipo_plan+"); ";
                
             try {
            Connection conn = fachada.conectar();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            while (tabla.next()) {
                String[] resultado=new String[8];
                resultado[0]=tabla.getString("id");
                resultado[1]=tabla.getString("nombres");
                resultado[2]=tabla.getString("apellidos");
                resultado[3]=tabla.getString("direccion");
                resultado[4]=tabla.getString("ciudad");
                resultado[5]=tabla.getString("cod_plan");
                resultado[6]=tabla.getString("simcard");
                resultado[7]=tabla.getString("fecha_ingreso");
                consulta.add(resultado);
            }
            conn.close();
            System.out.println("Conexion cerrada");
            return consulta;
        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
    
    
}
