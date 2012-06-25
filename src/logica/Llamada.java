/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;
import logica.Simcard;
import logica.Cia_local;
import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author chokuno
 */
public class Llamada {
    private Simcard sim;
    private Time hora_inicio;
    private Time hora_fin;
    private Date fecha;
    private String telefono_destino;
    private Cia_local cLocal;
    
    public Llamada()
    {}
    
    public Llamada(Simcard sim,Time hora_inicio,Date fecha,
            String telefono_destino,Time hora_fin,Cia_local cLocal)
    {
    this.sim=sim;
    this.hora_inicio=hora_inicio;
    this.fecha=fecha;
    this.telefono_destino=telefono_destino;
    this.hora_fin=hora_fin;
    this.cLocal=cLocal;
    
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
     * @return the telefono_destino
     */
    public String getTelefono_destino() {
        return telefono_destino;
    }

    /**
     * @param telefono_destino the telefono_destino to set
     */
    public void setTelefono_destino(String telefono_destino) {
        this.telefono_destino = telefono_destino;
    }

    /**
     * @return the cLocal
     */
    public Cia_local getcLocal() {
        return cLocal;
    }

    /**
     * @param cLocal the cLocal to set
     */
    public void setcLocal(Cia_local cLocal) {
        this.cLocal = cLocal;
    }
    
}
