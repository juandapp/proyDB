/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.sql.Date;

/**
 *
 * @author juandapp
 */
public class Recarga {
    int valor, num_recarga;
    Date fecha;
    String medio_recarga;
    Simcard simcard;
    

    public Recarga(){
        
    }
    
    public Recarga(int num_recarga, int valor, Date fecha, String medio_recarga, Simcard simcard){
       this.num_recarga=num_recarga;
               
        this.valor=valor;
        this.fecha=fecha;
        this.medio_recarga=medio_recarga;
        this.simcard=simcard;
    }

    public int getNum_recarga() {
        return num_recarga;
    }

    public void setNum_recarga(int num_recarga) {
        this.num_recarga = num_recarga;
    }
    
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
