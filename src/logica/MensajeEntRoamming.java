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
public class MensajeEntRoamming {
    private Simcard sim;
    private Date fecha;
    private Time hora;
    private Cia_internacional cInter;
    private String tel_Origen;
    
    public MensajeEntRoamming()
    {}

    public MensajeEntRoamming(Simcard sim, Date fecha, Time hora,
            Cia_internacional cInter, String tel_Origen) {
        this.sim = sim;
        this.fecha = fecha;
        this.hora = hora;
        this.cInter = cInter;
        this.tel_Origen = tel_Origen;
    }

    public Simcard getSim() {
        return sim;
    }

    public void setSim(Simcard sim) {
        this.sim = sim;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }
    public Cia_internacional getcInter() {
        return cInter;
    }

    public void setcInter(Cia_internacional cInter) {
        this.cInter = cInter;
    }

    public void setTel_Origen(String tel_Origen) {
        this.tel_Origen = tel_Origen;
    }

    public String getTel_Origen() {
        return tel_Origen;
    }

    
    
    
}
