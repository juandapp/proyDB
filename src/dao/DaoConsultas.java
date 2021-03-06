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
import java.util.ArrayList;
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
                    "COUNT(cod_plan) AS suscriptores,cod_plan "+
                    " FROM contrato NATURAL JOIN plan "+
                    " GROUP BY cod_plan ORDER BY suscriptores DESC; ";
                
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
                +   " cod_plan,simcard,fecha_ingreso "+
                    "FROM abonado join contrato "+
                    "ON id=id_abonado and cod_plan IN "
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
    
    
    
    public LinkedList listadoPlanDatos() {
        String sql_select;
        LinkedList consulta = new LinkedList();
        

        sql_select = "SELECT "+
                    "id,nombres,apellidos,cod_plan_datos,costo_correo,costo_internet,"
                +   "vol_datos_correo,vol_datos_internet "+
                    "FROM abonado JOIN contrato NATURAL JOIN plan_datos_simcard "
                  + "NATURAL JOIN plan_datos "+
                    "ON id=id_abonado ORDER BY id; ";
                
             try {
            Connection conn = fachada.conectar();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            while (tabla.next()) {
                String[] resultado=new String[8];
                resultado[0]=tabla.getString("id");
                resultado[1]=tabla.getString("nombres");
                resultado[2]=tabla.getString("apellidos");
                resultado[3]=tabla.getString("cod_plan_datos");
                resultado[4]=tabla.getString("costo_correo");
                resultado[5]=tabla.getString("costo_internet");
                resultado[6]=tabla.getString("vol_datos_correo");
                resultado[7]=tabla.getString("vol_datos_internet");
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
    
    
    public LinkedList operadoresExtranjeros() {
        String sql_select;
        LinkedList consulta = new LinkedList();
        

        sql_select = "SELECT "+
                     "* "+
                     "FROM cia_internacional; ";
                
             try {
            Connection conn = fachada.conectar();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            while (tabla.next()) {
                String[] resultado=new String[10];
                resultado[0]=tabla.getString("id");
                resultado[1]=tabla.getString("nombre");
                resultado[2]=tabla.getString("pais");
                resultado[3]=tabla.getString("tarifa_mensajes");
                resultado[4]=tabla.getString("tar_llamada_entra_inter");
                resultado[5]=tabla.getString("tar_llamada_sale_inter");
                resultado[6]=tabla.getString("tar_llamada_entra_nal");
                resultado[7]=tabla.getString("tar_llamada_sale_nal");
                resultado[8]=tabla.getString("tar_datos_enviados");
                resultado[9]=tabla.getString("tar_datos_recibidos");
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
    
    
    public LinkedList operNacionalUtil() {
        String sql_select;
        LinkedList consulta = new LinkedList();
        
        

        sql_select = "SELECT cia_local,COUNT(cia_local) AS veces_utilizado "+
                     "FROM llamada GROUP BY cia_local;";
                
             try {
            Connection conn = fachada.conectar();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            while (tabla.next()) {
                String[] resultado=new String[2];
                resultado[0]=tabla.getString("cia_local");
                resultado[1]=tabla.getString("veces_utilizado");
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
    
    
    public LinkedList planPreferCorp() {
        String sql_select;
        LinkedList consulta = new LinkedList();
        
        

        sql_select = "SELECT cod_plan AS codigo_plan_corporativo,COUNT(cod_plan) "+
                    "AS suscriptores FROM abonado JOIN contrato ON "+
                    "id=id_abonado AND tipo='Corporativo'  "+
                     "GROUP BY cod_plan ORDER BY suscriptores DESC;";
                
             try {
            Connection conn = fachada.conectar();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            while (tabla.next()) {
                String[] resultado=new String[2];
                resultado[0]=tabla.getString("codigo_plan_corporativo");
                resultado[1]=tabla.getString("suscriptores");
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
    
    
    public LinkedList ConsumoInternetCorreoGenero(String genero) {
        String sql_select;
        LinkedList consulta = new LinkedList();
        
        

        sql_select = "SELECT id,genero,ciudad,cod_plan_datos,vol_datos_correo,vol_datos_internet "+
                    "FROM abonado JOIN contrato NATURAL JOIN plan_datos_simcard "+
                     "ON id=id_abonado AND genero='"+genero+"';";
                
             try {
            Connection conn = fachada.conectar();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            while (tabla.next()) {
                String[] resultado=new String[6];
                resultado[0]=tabla.getString("id");
                resultado[1]=tabla.getString("genero");
                resultado[2]=tabla.getString("ciudad");
                resultado[3]=tabla.getString("cod_plan_datos");
                resultado[4]=tabla.getString("vol_datos_correo");
                resultado[5]=tabla.getString("vol_datos_internet");
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
    
    public LinkedList ConsumoInternetCorreoCiudad(String ciudad) {
        String sql_select;
        LinkedList consulta = new LinkedList();
        
        

        sql_select = "SELECT id,genero,ciudad,cod_plan_datos,vol_datos_correo,vol_datos_internet "+
                    "FROM abonado JOIN contrato NATURAL JOIN plan_datos_simcard "+
                     "ON id=id_abonado AND ciudad='"+ciudad+"';";
                
             try {
            Connection conn = fachada.conectar();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            while (tabla.next()) {
                String[] resultado=new String[6];
                resultado[0]=tabla.getString("id");
                resultado[1]=tabla.getString("genero");
                resultado[2]=tabla.getString("ciudad");
                resultado[3]=tabla.getString("cod_plan_datos");
                resultado[4]=tabla.getString("vol_datos_correo");
                resultado[5]=tabla.getString("vol_datos_internet");
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
    
    public LinkedList ConsumoMensajesGen(String genero) {
        String sql_select;
        LinkedList consulta = new LinkedList();
        
        

        sql_select = "SELECT id,genero,ciudad,cia_local,fecha,hora,msjs_enviados "+
                    "FROM abonado JOIN contrato NATURAL JOIN consumo_mensaje "+
                     "ON id=id_abonado AND genero='"+genero+"';";
                
             try {
            Connection conn = fachada.conectar();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            while (tabla.next()) {
                String[] resultado=new String[7];
                resultado[0]=tabla.getString("id");
                resultado[1]=tabla.getString("genero");
                resultado[2]=tabla.getString("ciudad");
                resultado[3]=tabla.getString("cia_local");
                resultado[4]=tabla.getString("fecha");
                resultado[5]=tabla.getString("hora");
                resultado[6]=tabla.getString("msjs_enviados");
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
    
    
    public LinkedList ConsumoMensajesCiudad(String ciudad) {
        String sql_select;
        LinkedList consulta = new LinkedList();
        
        

        sql_select = "SELECT id,genero,ciudad,cia_local,fecha,hora,msjs_enviados "+
                    "FROM abonado JOIN contrato NATURAL JOIN consumo_mensaje "+
                     "ON id=id_abonado AND ciudad='"+ciudad+"';";
                
             try {
            Connection conn = fachada.conectar();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            while (tabla.next()) {
                String[] resultado=new String[7];
                resultado[0]=tabla.getString("id");
                resultado[1]=tabla.getString("genero");
                resultado[2]=tabla.getString("ciudad");
                resultado[3]=tabla.getString("cia_local");
                resultado[4]=tabla.getString("fecha");
                resultado[5]=tabla.getString("hora");
                resultado[6]=tabla.getString("msjs_enviados");
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
    
    
    public LinkedList roboConsulta() {
        String sql_select;
        LinkedList consulta = new LinkedList();
        
        

        sql_select = "SELECT fecha,ciudad  "+
                     "FROM simcard_robo;";
                
             try {
            Connection conn = fachada.conectar();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            while (tabla.next()) {
                String[] resultado=new String[2];
                resultado[0]=tabla.getString("fecha");
                resultado[1]=tabla.getString("ciudad");
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
    
    
    public LinkedList equiposDemandados() {
        String sql_select;
        LinkedList consulta = new LinkedList();
        
        

        sql_select = "SELECT modelo,marca,COUNT(modelo) AS cantidad  "+
                     "FROM equipo NATURAL JOIN abonado "+
                     "GROUP BY modelo, marca ORDER BY cantidad DESC;";
                
             try {
            Connection conn = fachada.conectar();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            while (tabla.next()) {
                String[] resultado=new String[3];
                resultado[0]=tabla.getString("modelo");
                resultado[1]=tabla.getString("marca");
                resultado[2]=tabla.getString("cantidad");
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
    
  
    
    public LinkedList franjaRedUso() {
        String sql_view;
        String sql_select;
        LinkedList consulta = new LinkedList();
        
        

        sql_select = "SELECT franja_horaria,count(*) AS veces_usada FROM  "+
                     "(SELECT extract(HOUR from hora_inicio)AS franja_horaria FROM llamada "+
                     "UNION ALL "+
                     "SELECT extract(HOUR from hora_fin)AS franja_horaria FROM llamada) R1 "+
                     "GROUP BY franja_horaria "+
                     "ORDER BY veces_usada  DESC;";
                
             try {
            Connection conn = fachada.conectar();
            Statement sentencia = conn.createStatement();
         
            ResultSet tabla = sentencia.executeQuery(sql_select);
            while (tabla.next()) {
                String[] resultado=new String[2];
                resultado[0]=tabla.getString("franja_horaria");
                resultado[1]=tabla.getString("veces_usada");
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
    
    public LinkedList oficinaGanancias() {
        
        String sql_select;
        LinkedList consulta = new LinkedList();
        
 

        sql_select = "SELECT cod_sucursal,nombre_sucursal,SUM(valor) AS Facturacion FROM "+
                     "(SELECT id_empleado ,s.nombre AS nombre_sucursal,s.cod_sucursal "+
                     "from empleado e INNER JOIN sucursal s   "+
                     "ON e.cod_sucursal=s.cod_sucursal ) R1 NATURAL JOIN contrato "+
                     "GROUP BY cod_sucursal, nombre_sucursal";
                
             try {
            Connection conn = fachada.conectar();
            Statement sentencia = conn.createStatement();
           
            ResultSet tabla = sentencia.executeQuery(sql_select);
            while (tabla.next()) {
                String[] resultado=new String[3];
                resultado[0]=tabla.getString("cod_sucursal");
                resultado[1]=tabla.getString("nombre_sucursal");
                resultado[2]=tabla.getString("Facturacion");
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
    
    
    public LinkedList ConsumoTipoAbonado(String tipo,String consumo) {
        String sql_select="";

        LinkedList consulta = new LinkedList();   
  
        
        
       if(consumo.equals("mensaje"))
        sql_select = "SELECT DISTINCT id,tipo,nombres,apellidos,simcard,msjs_enviados,cia_local,fecha,hora "+
                    "FROM (SELECT id,nombres,apellidos,tipo,cod_plan,simcard "+
                    "FROM abonado JOIN contrato "+
                    "ON id=id_abonado AND tipo='"+tipo+"' AND cod_plan IN(SELECT cod_plan from postpago))R1 NATURAL JOIN consumo_mensaje "+
                     ";";
       
       if(consumo.equals("llamada"))
           sql_select = "SELECT DISTINCT id,tipo,nombres,apellidos,simcard,cia_local,hora_inicio,hora_fin "+
                     "FROM (SELECT id,nombres,apellidos,tipo,cod_plan,simcard "+
                     "FROM abonado JOIN contrato "+
                     "ON id=id_abonado AND tipo='"+tipo+"' AND cod_plan IN(SELECT cod_plan from postpago))R1 NATURAL JOIN llamada "+
                     ";";
       
                
             try {
            Connection conn = fachada.conectar();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            if(consumo.equals("llamada"))
            while (tabla.next()) {
                String[] resultado=new String[8];
                resultado[0]=tabla.getString("id");
                resultado[1]=tabla.getString("tipo");
                resultado[2]=tabla.getString("nombres");
                resultado[3]=tabla.getString("apellidos");
                resultado[4]=tabla.getString("simcard");
                resultado[5]=tabla.getString("cia_local");
                resultado[6]=tabla.getString("hora_inicio");
                resultado[7]=tabla.getString("hora_fin");
                consulta.add(resultado);
            }
            
            if(consumo.equals("mensaje"))
                while (tabla.next()) {
                String[] resultado=new String[9];
                resultado[0]=tabla.getString("id");
                resultado[1]=tabla.getString("tipo");
                resultado[2]=tabla.getString("nombres");
                resultado[3]=tabla.getString("apellidos");
                resultado[4]=tabla.getString("simcard");
                resultado[5]=tabla.getString("msjs_enviados");
                resultado[6]=tabla.getString("cia_local");
                resultado[7]=tabla.getString("fecha");
                resultado[8]=tabla.getString("hora");
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
