/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dao.DaoConsultas;
import java.util.LinkedList;


/**
 *
 * @author juandapp
 */
public class ControladorConsultas {

    DaoConsultas daoConsultas;

    public ControladorConsultas() {
        daoConsultas = new DaoConsultas();
    }

  public LinkedList clientesPorMes(String fecha_i, String fecha_f){
      
LinkedList consultar = new LinkedList();
        consultar = daoConsultas.clientesPorMes(fecha_i, fecha_f);
        return consultar;
  
    }
  
   public LinkedList clientesPorTipo(String tipo){
      
LinkedList consultar = new LinkedList();
        consultar = daoConsultas.clientesPorTipo(tipo);
        return consultar;
  
    }
   
   public LinkedList planesMasEscogidos(){
      
LinkedList consultar = new LinkedList();
        consultar = daoConsultas.planesMasEscogidos();
        return consultar;
  
    }
   
   public LinkedList usuariosPlan(String tipo_plan){
      
LinkedList consultar = new LinkedList();
        consultar = daoConsultas.usuariosPlan(tipo_plan);
        return consultar;
  
    }
   
   public LinkedList listadoPlanDatos(){
      
LinkedList consultar = new LinkedList();
        consultar = daoConsultas.listadoPlanDatos();
        return consultar;
  
    }
   
   public LinkedList operadoresExtranjeros(){
      
LinkedList consultar = new LinkedList();
        consultar = daoConsultas.operadoresExtranjeros();
        return consultar;
  
    }
}
