/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author chokuno
 */
public class MensajeSalRoamming {
    private Simcard sim;
    private Date fecha;
    private Time hora;
    private Cia_internacional cInter;
    private String tel_destino;
    
    public MensajeSalRoamming()
    {}

    public MensajeSalRoamming(Simcard sim, Date fecha, Time hora, Cia_internacional cInter, String tel_destino) {
        this.sim = sim;
        this.fecha = fecha;
        this.hora = hora;
        this.cInter = cInter;
        this.tel_destino = tel_destino;
    }

    /**
     * @return the sim
     */
    public Simcard getSim() {
        return sim;
    }

    /**
     * @param sim the sim to set
     */
    public void setSim(Simcard sim) {
        this.sim = sim;
    }

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the hora
     */
    public Time getHora() {
        return hora;
    }

    /**
     * @param hora the hora to set
     */
    public void setHora(Time hora) {
        this.hora = hora;
    }

    /**
     * @return the cInter
     */
    public Cia_internacional getcInter() {
        return cInter;
    }

    /**
     * @param cInter the cInter to set
     */
    public void setcInter(Cia_internacional cInter) {
        this.cInter = cInter;
    }

    /**
     * @return the tel_destino
     */
    public String getTel_destino() {
        return tel_destino;
    }

    /**
     * @param tel_destino the tel_destino to set
     */
    public void setTel_destino(String tel_destino) {
        this.tel_destino = tel_destino;
    }
    
    
    
}
