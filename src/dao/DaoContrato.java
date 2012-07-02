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
import logica.Contrato;

/**
 *
 * @author chokuno
 */
public class DaoContrato {
    
    FachadaBD fachada;

    public DaoContrato() {
        fachada = new FachadaBD();
    }

    public int guardar(Contrato contrato) {
        String sql_guardar;
        sql_guardar = "INSERT INTO contrato VALUES ('"
                + contrato.getAbonado().getId()+ "', '"
                + contrato.getEmpleado().getId_empleado() + "', '"
                + contrato.getPlan().getCod_plan()+ "', '"
                + contrato.getSim().getCodigo() + "', '"
                + contrato.getFecha_ingreso() + "')";
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

    public Contrato consultar(String id_abonado) {
        Contrato contrato= new Contrato();
        String sql_select;
        sql_select = "SELECT * FROM contrato WHERE id_abonado='" + id_abonado + "'";
        try {
            Connection conn = fachada.conectar();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);

            //
            if (tabla.next()) {

               contrato.setAbonado(new DaoAbonado().consultar(tabla.getString("id_abonado")));
               contrato.setEmpleado(new DaoEmpleado().consultar(tabla.getString("id_empleado")));
               contrato.setPlan(new DaoPlan().consultar(tabla.getString("cod_plan")));
               contrato.setSim(new DaoSimcard().consultar(tabla.getString("simcard")));
               contrato.setFecha_ingreso(tabla.getDate("fecha_ingreso"));
               
            }

            conn.close();
            System.out.println("Conexion cerrada");
            return contrato;

        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }

        return null;
    }

    public LinkedList consultar(String abonado, String empleado, String plan, 
            String sim, String fecha_ingreso) {
        LinkedList contratoConsulta = new LinkedList();
        String sql_select = "SELECT * FROM contrato      ";
        if (!abonado.equals("") || !empleado.equals("") || !plan.equals("")
                || !sim.equals("") || !fecha_ingreso.equals("")) {
            sql_select += "WHERE ";
        }
        if (!abonado.equals("")) {
            sql_select += "id_abonado ='" + abonado + "' AND ";
        }
        if (!empleado.equals("")) {
            sql_select += "id_empleado = '" + empleado + "'" + " AND ";
        }
        if (!plan.equals("")) {
            sql_select += "cod_plan = '" + plan + "'" + " AND ";
        }
        if (!sim.equals("")) {
            sql_select += "simcard = '" + sim + "'" + " AND ";
        }
        if (!fecha_ingreso.equals("")) {
            sql_select += "fecha_ingreso = '" + fecha_ingreso + "'" + " AND ";
        }
        
        

        sql_select = sql_select.substring(0, sql_select.length() - 5);
        try {
            Connection conn = fachada.conectar();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            while (tabla.next()) {
                Contrato contrato = new Contrato();
                contrato.setAbonado(new DaoAbonado().consultar(tabla.getString("id_abonado")));
                contrato.setEmpleado(new DaoEmpleado().consultar(tabla.getString("id_empleado")));
                contrato.setPlan(new DaoPlan().consultar(tabla.getString("cod_plan")));
                contrato.setSim(new DaoSimcard().consultar(tabla.getString("simcard")));
                contrato.setFecha_ingreso(tabla.getDate("fecha_ingreso"));
                contratoConsulta.add(contrato);
            }
            conn.close();
            System.out.println("Conexion cerrada");
            return contratoConsulta;

        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }

        return null;
    }

//    public int editar(Contrato contrato) {
//
//        String sql_update;
//        sql_update = "UPDATE contrato SET '"
//                + contrato.getEmpleado().getId_empleado() + "', '"
//                + contrato.getPlan().getCod_plan()+ "', '"
//                + contrato.getSim().getCodigo() + "', '"
//                + contrato.getFecha_ingreso() + "'"
//                + " WHERE id_abonado='" + contrato.getAbonado().getId() + "'";
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
