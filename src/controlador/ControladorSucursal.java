/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dao.DaoSucursal;
import logica.Sucursal;

/**
 *
 * @author juandapp
 */
public class ControladorSucursal {
    DaoSucursal daoSucursal;
    public ControladorSucursal() {
        daoSucursal = new DaoSucursal();
                
    }
    
    public int guardar(String cod_sucursal, String nombre, String ciudad, String direccion, String telefono){
        Sucursal s = new Sucursal(cod_sucursal, nombre, ciudad, direccion, telefono);
        int retorno = daoSucursal.guardar(s);
        return retorno;
    }
    
    
}
