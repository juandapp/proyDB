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
public class LlamadaSalRoamming {
    private Simcard sim;
    private Date fecha;
    private Time hora_inicio;
    private Time hora_fin;
    private String pais_destino;
    private String tel_destino;
    private Cia_internacional cInter;

    public LlamadaSalRoamming() {
    }

    public LlamadaSalRoamming(Simcard sim, Date fecha, Time hora_inicio,
            Time hora_fin, String pais_destino, String tel_destino, 
            Cia_internacional cInter) {
        this.sim = sim;
        this.fecha = fecha;
        this.hora_inicio = hora_inicio;
        this.hora_fin = hora_fin;
        this.pais_destino = pais_destino;
        this.tel_destino = tel_destino;
        this.cInter = cInter;
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
     * @return the hora_inicio
     */
    public Time getHora_inicio() {
        return hora_inicio;
    }

    /**
     * @param hora_inicio the hora_inicio to set
     */
    public void setHora_inicio(Time hora_inicio) {
        this.hora_inicio = hora_inicio;
    }

    /**
     * @return the hora_fin
     */
    public Time getHora_fin() {
        return hora_fin;
    }

    /**
     * @param hora_fin the hora_fin to set
     */
    public void setHora_fin(Time hora_fin) {
        this.hora_fin = hora_fin;
    }

    /**
     * @return the pais_destino
     */
    public String getPais_destino() {
        return pais_destino;
    }

    /**
     * @param pais_destino the pais_destino to set
     */
    public void setPais_destino(String pais_destino) {
        this.pais_destino = pais_destino;
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
    
    
    
}
