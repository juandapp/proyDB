/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author juandrd
 */
public class Correos {
    String email;
    Abonado id_abonado;

    public Correos() {
    }

    public Correos(String email, Abonado id_abonado) {
        this.email = email;
        this.id_abonado = id_abonado;
    }
    
    
    
    public String getEmail() {
        return email;
    }

    public Abonado getId_abonado() {
        return id_abonado;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId_abonado(Abonado id_abonado) {
        this.id_abonado = id_abonado;
    }
    
    
    
}
