/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.LinkedList;
import dao.DaoEmpresa;
import logica.Empresa;

/**
 *
 * @author chokuno
 */
public class ControladorEmpresa {
    
    DaoEmpresa daoEmpresa;
    
    
    public ControladorEmpresa()
    {
    daoEmpresa= new DaoEmpresa();
    
    }
    
    
    public int guardar(String nombre, String telefono,String direccion,
            String cod_plan) {
        if(!nombre.isEmpty() && !telefono.isEmpty() && !direccion.isEmpty()
                &&  !cod_plan.isEmpty() ) {
            Empresa empresa = new Empresa(nombre, telefono,
                    direccion,cod_plan);
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
        empresaConsultar = daoEmpresa.consultar(nombre,telefono,direccion,
                cod_plan);
        return empresaConsultar;
    }
    
    
    
    

    public int editar(String nombre, String telefono,String direccion,
            String cod_plan) {
        if(!nombre.isEmpty() && !telefono.isEmpty() && !direccion.isEmpty()
                &&  !cod_plan.isEmpty() ){
            Empresa empresa = new Empresa(nombre,telefono,direccion,
                cod_plan);
            int retorno = daoEmpresa.editar(empresa);
            return retorno;
        } else {
            return -1;
        }
    }
    
    
    
    }
    
    

