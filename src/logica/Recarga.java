/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.Date;

/**
 *
 * @author juandapp
 */
public class Recarga {
    int valor;
    Date fecha;
    String medio_recarga;
    Simcard simcard;

    public Date getFecha() {
        return fecha;
    }

    public String getMedio_recarga() {
        return medio_recarga;
    }

    public Simcard getSimcard() {
        return simcard;
    }

    public int getValor() {
        return valor;
    }
 
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setMedio_recarga(String medio_recarga) {
        this.medio_recarga = medio_recarga;
    }

    public void setSimcard(Simcard simcard) {
        this.simcard = simcard;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
           
}
