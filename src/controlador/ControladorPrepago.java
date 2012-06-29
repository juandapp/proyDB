/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dao.DaoPlan;
import dao.DaoPrepago;
import java.util.LinkedList;
import logica.Plan;
import logica.Prepago;

/**
 *
 * @author chokuno
 */
public class ControladorPrepago {
    DaoPrepago daoPrepago;
    DaoPlan daoPlan;

    public ControladorPrepago() {
        daoPrepago = new DaoPrepago();
        daoPlan = new DaoPlan();
    }

    public int guardar(String cod_plan,int tarifa_otro_operador, int tarifa_msj_multimedia,
            int tarifa_msj_texto) {
        if (!cod_plan.isEmpty()) {
            
            Plan plan= new Plan(cod_plan, tarifa_otro_operador,
                    tarifa_msj_multimedia, tarifa_msj_texto);
            daoPlan.guardar(plan);
                     
            
            Prepago prepago = new Prepago(plan);
            int retorno = daoPrepago.guardar(prepago);
            return retorno;
        } else {
            return -1;
        }
    }

    public Prepago consultar(String cod_plan) {
        Prepago prepago = new Prepago();
        prepago=daoPrepago.consultar(cod_plan);
        return prepago;
    }

   

    public int editar(String cod_plan) {
        if (!cod_plan.isEmpty())  {
            Plan plan=daoPlan.consultar(cod_plan);
            Prepago prepago = new Prepago(plan);
            int retorno = daoPrepago.editar(prepago);
            return retorno;
        } else {
            return -1;
        }
    }
}
