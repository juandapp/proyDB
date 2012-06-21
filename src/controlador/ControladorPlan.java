/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dao.DaoPlan;
import java.util.LinkedList;
import logica.Plan;

/**
 *
 * @author juandapp
 */
public class ControladorPlan {

    DaoPlan daoPlan;

    public ControladorPlan() {
        daoPlan = new DaoPlan();
    }

    public int guardar(String cod_plan, int tarifa_otro_operador, int tarifa_msj_multimedia, int tarifa_msj_texto) {
        int retorno = 0;
        try {
            if (!cod_plan.isEmpty() && tarifa_otro_operador > 0 && tarifa_msj_multimedia > 0 && tarifa_msj_texto > 0) {
                Plan p = new Plan(cod_plan, tarifa_otro_operador, tarifa_msj_multimedia, tarifa_msj_texto);
                retorno = daoPlan.guardar(p);
            }
        } catch (Exception e) {
            retorno = -1;
        }

        return retorno;
    }

    public Plan consultar(String cod_plan) {
        Plan p = new Plan();
        p = daoPlan.consultar(cod_plan);
        return p;
    }

   public LinkedList consultar(String cod_plan, String tarifa_otro_operador,
           String tarifa_msj_multimedia, String tarifa_msj_texto) {
        LinkedList planConsultados = new LinkedList();
        planConsultados = daoPlan.consultar(cod_plan, tarifa_otro_operador, tarifa_msj_multimedia,
                tarifa_msj_texto);
        return planConsultados;
    }
    public int editar(String cod_plan, int tarifa_otro_operador, int tarifa_msj_multimedia, int tarifa_msj_texto) {
        if (!cod_plan.isEmpty() && tarifa_otro_operador > 0 && tarifa_msj_multimedia > 0 && tarifa_msj_texto > 0) {
            Plan p = new Plan(cod_plan,  tarifa_otro_operador, tarifa_msj_multimedia, tarifa_msj_texto);
            int retorno = daoPlan.editar(p);
            return retorno;
        } else {
            return -1;
        }
    }
}
