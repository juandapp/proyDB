/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author juandapp
 */
public class Plan {

    String cod_plan;
    int tarifa_otro_operador, tarifa_msj_multimedia, tarifa_msj_texto;

    public Plan() {
    }
    public Plan(String cod_plan, int tarifa_otro_operador, int tarifa_msj_multimedia, int tarifa_msj_texto){
        this.cod_plan=cod_plan;
        this.tarifa_otro_operador=tarifa_otro_operador;
        this.tarifa_msj_multimedia=tarifa_msj_multimedia;
        this.tarifa_msj_texto=tarifa_msj_texto;
    }
    public String getCod_plan() {
        return cod_plan;
    }

    public int getTarifa_msj_multimedia() {
        return tarifa_msj_multimedia;
    }

    public int getTarifa_msj_texto() {
        return tarifa_msj_texto;
    }

    public int getTarifa_otro_operador() {
        return tarifa_otro_operador;
    }

    public void setCod_plan(String cod_plan) {
        this.cod_plan = cod_plan;
    }

    public void setTarifa_msj_multimedia(int tarifa_msj_multimedia) {
        this.tarifa_msj_multimedia = tarifa_msj_multimedia;
    }

    public void setTarifa_msj_texto(int tarifa_msj_texto) {
        this.tarifa_msj_texto = tarifa_msj_texto;
    }

    public void setTarifa_otro_operador(int tarifa_otro_operador) {
        this.tarifa_otro_operador = tarifa_otro_operador;
    }
    
    
}
