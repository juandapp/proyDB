/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author Juandapp
 */
public class LlamadaEntRoamming {
    private Simcard sim;
    private Date fecha;
    private Time hora_inicio;
    private Time hora_fin;
    private String pais_origen;
    private String tel_Origen;
    private Cia_internacional cInter;

    public LlamadaEntRoamming() {
    }

    public LlamadaEntRoamming(Simcard sim, Date fecha, Time hora_inicio,
            Time hora_fin, String pais_origen, String tel_Origen, 
            Cia_internacional cInter) {
        this.sim = sim;
        this.fecha = fecha;
        this.hora_inicio = hora_inicio;
        this.hora_fin = hora_fin;
        this.pais_origen = pais_origen;
        this.tel_Origen = tel_Origen;
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

    public String getpais_origen() {
        return pais_origen;
    }

    /**
     * @return the pais_origen
     */


    /**
     * @param pais_origen the pais_origen to set
     */
    public void setpais_origen(String pais_origen) {
        this.pais_origen = pais_origen;
    }

    /**
     * @return the tel_Origen
     */
    public String getTel_Origen() {
        return tel_Origen;
    }

    /**
     * @param tel_Origen the tel_Origen to set
     */
    public void setTel_Origen(String tel_Origen) {
        this.tel_Origen = tel_Origen;
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
