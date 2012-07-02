/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.sql.Time;
import java.sql.Date;

/**
 *
 * @author chokuno
 */
public class ConsumoMensaje {
     private Simcard simcard;
     private Cia_local compania_local;
     private int msjs_enviados;
     private Date fecha;
     private Time hora;
    
    
    public ConsumoMensaje()
    {}
    
    
    public ConsumoMensaje(Simcard simcard,
     Cia_local compania_local,int msjs_enviados, Date fecha, Time hora)
    {
    this.simcard=simcard;
    this.compania_local=compania_local;
    this.msjs_enviados=msjs_enviados;
    this.fecha=fecha;
    this.hora=hora;
    
    }

    /**
     * @return the simcard
     */
    public Simcard getSimcard() {
        return simcard;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public Time getHora() {
        return hora;
    }

   
    /**
     * @param simcard the simcard to set
     */
    public void setSimcard(Simcard simcard) {
        this.simcard = simcard;
    }

    /**
     * @return the compania_local
     */
    public Cia_local getCompania_local() {
        return compania_local;
    }

    /**
     * @param compania_local the compania_local to set
     */
    public void setCompania_local(Cia_local compania_local) {
        this.compania_local = compania_local;
    }

    /**
     * @return the msjs_enviados
     */
    public int getMsjs_enviados() {
        return msjs_enviados;
    }

    /**
     * @param msjs_enviados the msjs_enviados to set
     */
    public void setMsjs_enviados(int msjs_enviados) {
        this.msjs_enviados = msjs_enviados;
    }

    
}


