/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author juandrd
 */
public class Promocion {
    
    String nombre, descripcion;
    Prepago cod_plan;
    
    public Promocion(){        
    }
    
    public Promocion(String nombre, String descripcion, Prepago cod_plan){   
        this.nombre=nombre;
        this.descripcion=descripcion;
        this.cod_plan=cod_plan;
             
    }

    public Prepago getCod_plan() {
        return cod_plan;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setCod_plan(Prepago cod_plan) {
        this.cod_plan = cod_plan;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
     
}
