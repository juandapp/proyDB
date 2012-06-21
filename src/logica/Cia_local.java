/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author juandrd
 */
public class Cia_local {
    String id, nombre;

    public Cia_local() {
    }
    
   
    public Cia_local(String id, String nombre) {
        this.id=id;
        this.nombre=nombre;
    }
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
