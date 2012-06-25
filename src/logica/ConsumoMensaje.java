/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author chokuno
 */
public class ConsumoMensaje {
     private Simcard simcard;
     private Cia_local compania_local;
     private int msjs_enviados;
    
    
    public ConsumoMensaje()
    {}
    
    
    public ConsumoMensaje(Simcard simcard,
     Cia_local compania_local,int msjs_enviados)
    {
    this.simcard=simcard;
    this.compania_local=compania_local;
    this.msjs_enviados=msjs_enviados;
    
    }

    /**
     * @return the simcard
     */
    public Simcard getSimcard() {
        return simcard;
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


