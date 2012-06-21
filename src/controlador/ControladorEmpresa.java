/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
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
    
    
}
