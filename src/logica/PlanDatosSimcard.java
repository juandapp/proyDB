/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author chokuno
 */
public class PlanDatosSimcard {
     Simcard simcard;
     PlanDatos cod_plan_datos;
     String tipo_pago;
     String vol_datos_correo;
     String vol_datos_internet;
    
    
    public PlanDatosSimcard()
    {}
    
    
    public PlanDatosSimcard(Simcard simcard,PlanDatos cod_plan_datos,
     String tipo_pago,String vol_datos_correo, String vol_datos_internet)
    {
    this.simcard=simcard;
    this.cod_plan_datos=cod_plan_datos;
    this.tipo_pago=tipo_pago;
    this.vol_datos_correo=vol_datos_correo;
    this.vol_datos_internet=vol_datos_internet;
    
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
     * @return the cod_plan_datos
     */
    public PlanDatos getCod_plan_datos() {
        return cod_plan_datos;
    }

    /**
     * @param cod_plan_datos the cod_plan_datos to set
     */
    public void setCod_plan_datos(PlanDatos cod_plan_datos) {
        this.cod_plan_datos = cod_plan_datos;
    }

    /**
     * @return the tipo_pago
     */
    public String getTipo_pago() {
        return tipo_pago;
    }

    /**
     * @param tipo_pago the tipo_pago to set
     */
    public void setTipo_pago(String tipo_pago) {
        this.tipo_pago = tipo_pago;
    }

    /**
     * @return the vol_datos_correo
     */
    public String getVol_datos_correo() {
        return vol_datos_correo;
    }

    /**
     * @param vol_datos_correo the vol_datos_correo to set
     */
    public void setVol_datos_correo(String vol_datos_correo) {
        this.vol_datos_correo = vol_datos_correo;
    }

    /**
     * @return the vol_datos_internet
     */
    public String getVol_datos_internet() {
        return vol_datos_internet;
    }

    /**
     * @param vol_datos_internet the vol_datos_internet to set
     */
    public void setVol_datos_internet(String vol_datos_internet) {
        this.vol_datos_internet = vol_datos_internet;
    }
    
}
