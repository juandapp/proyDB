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
   
   public LinkedList operNacionalUtil(){
      
LinkedList consultar = new LinkedList();
        consultar = daoConsultas.operNacionalUtil();
        return consultar;
  
    }
   
   public LinkedList ConsumoInternetCorreoGen(String genero){
      
LinkedList consultar = new LinkedList();
        consultar = daoConsultas.ConsumoInternetCorreoGenero(genero);
        return consultar;
  
    }
   
   public LinkedList ConsumoInternetCorreoCiudad(String ciudad){
      
LinkedList consultar = new LinkedList();
        consultar = daoConsultas.ConsumoInternetCorreoCiudad(ciudad);
        return consultar;
  
    }
   
   public LinkedList ConsumoMensajeCiudad(String ciudad){
      
LinkedList consultar = new LinkedList();
        consultar = daoConsultas.ConsumoMensajesCiudad(ciudad);
        return consultar;
  
    }
   
   public LinkedList ConsumoMensajeGenero(String genero){
      
LinkedList consultar = new LinkedList();
        consultar = daoConsultas.ConsumoMensajesGen(genero);
        return consultar;
  
    }
   
   public LinkedList roboConsulta(){
      
LinkedList consultar = new LinkedList();
        consultar = daoConsultas.roboConsulta();
        return consultar;
  
    }
   
   public LinkedList equiposDemandados(){
      
LinkedList consultar = new LinkedList();
        consultar = daoConsultas.equiposDemandados();
        return consultar;
  
    }
   
   
   public LinkedList oficinasGanancias(){
      
LinkedList consultar = new LinkedList();
        consultar = daoConsultas.oficinaGanancias();
        return consultar;
  
    }
   
   public LinkedList consumoTipoAbonado(String tipo,String consumo){
      
LinkedList consultar = new LinkedList();
        consultar = daoConsultas.ConsumoTipoAbonado(tipo, consumo);
        return consultar;
  
    }
   
   
   
   
   
}
