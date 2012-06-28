/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.LinkedList;
import dao.DaoEmpresa;
import dao.DaoPostpago;
import logica.Empresa;
import logica.Postpago;

/**
 *
 * @author chokuno
 */
public class ControladorEmpresa {
    
    DaoEmpresa daoEmpresa;
    DaoPostpago daoPostpago;
    
    
    public ControladorEmpresa()
    {
    daoEmpresa= new DaoEmpresa();
    daoPostpago= new DaoPostpago();
    }
    
    
    public int guardar(String nombre, String telefono,String direccion,
            String cod_plan) {
        if(!nombre.isEmpty() && !telefono.isEmpty() && !direccion.isEmpty()
                &&  !cod_plan.isEmpty() ) {
            Postpago postpago =daoPostpago.consultar(cod_plan);
            Empresa empresa = new Empresa(nombre, telefono,
                    direccion,postpago);
            int retorno = daoEmpresa.guardar(empresa);
            return retorno;
        } else {
            return -1;
        }
    }
        
     
     public Empresa consultar(String nombre) {
        Empresa empresa = new Empresa();
        empresa=daoEmpresa.consultar(nombre);
        return empresa;
    }
     
     
     

    public LinkedList consultar(String nombre, String telefono,String direccion,
            String cod_plan) {
        LinkedList empresaConsultar = new LinkedList();
        if(cod_plan.equals("Cargar Planes Postpago")){
            empresaConsultar = daoEmpresa.consultar(nombre,telefono,direccion,
                "");
        }
        else{
        empresaConsultar = daoEmpresa.consultar(nombre,telefono,direccion,
                cod_plan);}
        return empresaConsultar;
    }
    
    
    
    

    public int editar(String nombre, String telefono,String direccion,
            String cod_plan) {
        if(!nombre.isEmpty() && !telefono.isEmpty() && !direccion.isEmpty()
                &&  !cod_plan.isEmpty() ){
            
             if(cod_plan.equals("Cargar Planes Postpago")){
            return -1;
                            }
             else{
            Postpago postpago =daoPostpago.consultar(cod_plan);
            Empresa empresa = new Empresa(nombre,telefono,direccion,
                postpago);
            int retorno = daoEmpresa.editar(empresa);
            return retorno;
             }
        } else {
            return -1;
        }
    }
    
    
    
    }
    
    

