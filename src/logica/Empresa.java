/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author juandrd
 */
public class Empresa {
    
    String nombre, telefono, direccion;
    Postpago cod_plan;

    public Empresa(String nombre, String telefono,String direccion,
            Postpago cod_plan) {
        
       this.nombre=nombre;
       this.telefono=telefono;
       this.direccion=direccion;
       this.cod_plan=cod_plan;
        
    }
    
    public Empresa() {
    }


    public Postpago getCod_plan() {
        return cod_plan;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setCod_plan(Postpago cod_plan) {
        this.cod_plan = cod_plan;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
    
    
}
