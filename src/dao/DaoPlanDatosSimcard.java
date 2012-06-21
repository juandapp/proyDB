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
import logica.PlanDatosSimcard;


/**
 *
 * @author chokuno
 */
public class DaoPlanDatosSimcard {

    FachadaBD fachada;

    public DaoPlanDatosSimcard() {
        fachada = new FachadaBD();
    }

    public int guardar(PlanDatosSimcard pDatosSim) {
        String sql_guardar;
        sql_guardar = "INSERT INTO plan_datos_simcard VALUES ('"
                + pDatosSim.getSimcard().getCodigo() + "', '"
                + pDatosSim.getCod_plan_datos().getCod_plan_datos()+ "', '"
                + pDatosSim.getTipo_pago()+ "', '"
                + pDatosSim.getVol_datos_correo()+ "', '"
                + pDatosSim.getVol_datos_internet() + "')";
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

    public PlanDatosSimcard consultar(String simcard) {
        PlanDatosSimcard pDatosSim = new PlanDatosSimcard();
        String sql_select;
        sql_select = "SELECT * FROM plan_datos_simcard WHERE simcard='" + simcard + "'";
        try {
            Connection conn = fachada.conectar();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            if (tabla.next()) {

                pDatosSim.setSimcard(new DaoSimcard().consultar(tabla.getString("simcard")));
                pDatosSim.setCod_plan_datos(new DaoPlanDatos().consultar(tabla.getString("cod_plan_datos")));
                pDatosSim.setTipo_pago(tabla.getString("tipo_pago"));
                pDatosSim.setVol_datos_correo(tabla.getString("vol_datos_correo"));
                pDatosSim.setVol_datos_internet(tabla.getString("vol_datos_internet"));
            }

            conn.close();
            System.out.println("Conexion cerrada");
            return pDatosSim;

        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }

        return null;
    }
public LinkedList consultar(String simcard,String cod_plan_datos,
     String tipo_pago,String vol_datos_correo, String vol_datos_internet) {
        
        LinkedList pDatosSimConsulta = new LinkedList();
        String sql_select = "SELECT * FROM plan_datos_simcard ";
        if (!simcard.equals("") || !cod_plan_datos.equals("") || !tipo_pago.equals("")
                || !vol_datos_correo.equals("") || !vol_datos_internet.equals("")) {
            sql_select += "WHERE ";
        }
        if (!simcard.equals("")) {
            sql_select += "simcard = '" + simcard + "' AND ";
        }
        if (!cod_plan_datos.equals("")) {
            sql_select += "cod_plan_datos LIKE '%" + cod_plan_datos + "%'" + " AND ";
        }
        if (!tipo_pago.equals("")) {
            sql_select += "tipo_pago LIKE '%" + tipo_pago + "%'" + " AND ";
        }
        if (!vol_datos_correo.equals("")) {
            sql_select += "vol_datos_correo = " + vol_datos_correo + " AND ";
        }
        if (!vol_datos_internet.equals("")) {
            sql_select += "vol_datos_internet = " + vol_datos_internet + " AND ";
        }
        
        sql_select = sql_select.substring(0, sql_select.length() - 5);
        try {
            Connection conn = fachada.conectar();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            while (tabla.next()) {
                PlanDatosSimcard pDatosSim= new PlanDatosSimcard();
                
                pDatosSim.setSimcard(new DaoSimcard().consultar(tabla.getString("simcard")));
                pDatosSim.setCod_plan_datos(new DaoPlanDatos().consultar(tabla.getString("cod_plan_datos")));
                pDatosSim.setTipo_pago(tabla.getString("tipo_pago"));
                pDatosSim.setVol_datos_correo(tabla.getString("vol_datos_correo"));
                pDatosSim.setVol_datos_internet(tabla.getString("vol_datos_internet"));
               
                pDatosSimConsulta.add(pDatosSim);
            }
            conn.close();
            System.out.println("Conexion cerrada");
            return pDatosSimConsulta;

        } catch (SQLException e) {
            System.out.println(e);
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println(e);
        }

        return null;
    }

    public int editar(PlanDatosSimcard pDatosSim) {

        String sql_update;
        sql_update = "UPDATE plan_datos_simcard SET "
                + "cod_plan_datos='" + pDatosSim.getCod_plan_datos().getCod_plan_datos() + "', "
                + "tipo_pago='" + pDatosSim.getTipo_pago() + "', "
                + "vol_datos_correo='" + pDatosSim.getVol_datos_correo() + "', "
                + "vol_datos_internet='" + pDatosSim.getVol_datos_internet() + "' "
                + "WHERE simcard='" + pDatosSim.getSimcard() + "'";
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



