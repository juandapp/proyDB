/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author chokuno
 */
public class PlanDatos {
    String cod_plan_datos;
    int costo_internet;
    int costo_correo;
    
    
    public PlanDatos()
    {}
    
    public PlanDatos(String cod_plan_datos,
            int costo_internet,int costo_correo)
    {
    this.cod_plan_datos=cod_plan_datos;
    this.costo_internet=costo_internet;
    this.costo_correo=costo_correo;
    
    }
    

    /**
     * @return the cod_plan_datos
     */
    public String getCod_plan_datos() {
        return cod_plan_datos;
    }

    /**
     * @param cod_plan_datos the cod_plan_datos to set
     */
    public void setCod_plan_datos(String cod_plan_datos) {
        this.cod_plan_datos = cod_plan_datos;
    }

    /**
     * @return the costo_internet
     */
    public int getCosto_internet() {
        return costo_internet;
    }

    /**
     * @param costo_internet the costo_internet to set
     */
    public void setCosto_internet(int costo_internet) {
        this.costo_internet = costo_internet;
    }

    /**
     * @return the costo_correo
     */
    public int getCosto_correo() {
        return costo_correo;
    }

    /**
     * @param costo_correo the costo_correo to set
     */
    public void setCosto_correo(int costo_correo) {
        this.costo_correo = costo_correo;
    }
    
    
    
}
