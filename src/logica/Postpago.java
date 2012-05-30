/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author juandapp
 */
public class Postpago {
    Plan cod_plan;
    int total_minutos, costo_min_adicional;

    public Plan getCod_plan() {
        return cod_plan;
    }

    public int getCosto_min_adicional() {
        return costo_min_adicional;
    }

    public int getTotal_minutos() {
        return total_minutos;
    }

    public void setCod_plan(Plan cod_plan) {
        this.cod_plan = cod_plan;
    }

    public void setCosto_min_adicional(int costo_min_adicional) {
        this.costo_min_adicional = costo_min_adicional;
    }

    public void setTotal_minutos(int total_minutos) {
        this.total_minutos = total_minutos;
    }        
}
