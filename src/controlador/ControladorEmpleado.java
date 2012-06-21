/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import dao.DaoEmpleado;
import dao.DaoSucursal;
import java.sql.Date;
import logica.Empleado;
import logica.Sucursal;


/**
 *
 * @author chokuno
 */
public class ControladorEmpleado {
    
    DaoEmpleado daoEmpleado;
    
    public ControladorEmpleado()
    {
    
    daoEmpleado= new DaoEmpleado();
    }
    
    public int guardar(String id_empleado,String nombre,
            String genero,String estado_civil,Date fecha_nacimiento,
            Date fecha_ingreso,String tipo_contrato,String cargo,
            String codigo_sucursal)
    {
    if(!id_empleado.isEmpty() && !nombre.isEmpty() && !genero.isEmpty()
            && !estado_civil.isEmpty() && fecha_nacimiento!=null
            && fecha_ingreso!=null && !tipo_contrato.isEmpty() 
            && !cargo.isEmpty() && !codigo_sucursal.isEmpty())
    {
    
    Sucursal suc = (Sucursal) new DaoSucursal().consultar(codigo_sucursal);    
        
    Empleado emp = new Empleado(id_empleado,nombre,genero,
            estado_civil,fecha_nacimiento,fecha_ingreso,
            tipo_contrato,cargo,suc);           
    int retorno=daoEmpleado.guardar(emp);

    return retorno;
    }
 
    else return -1;
    }
    
}
