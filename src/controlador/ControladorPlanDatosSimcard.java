/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dao.DaoPlanDatos;
import dao.DaoPlanDatosSimcard;
import dao.DaoSimcard;
import java.util.LinkedList;
import logica.PlanDatos;
import logica.PlanDatosSimcard;
import logica.Simcard;

/**
 *
 * @author chokuno
 */
public class ControladorPlanDatosSimcard {
     DaoPlanDatosSimcard daoPlanDatosSim;

    public ControladorPlanDatosSimcard() {
        daoPlanDatosSim = new DaoPlanDatosSimcard();
    }

    public int guardar(String simcard,String cod_plan_datos,
     String tipo_pago,String vol_datos_correo, String vol_datos_internet) {
        if (!simcard.isEmpty() && !cod_plan_datos.isEmpty()  && 
                !tipo_pago.isEmpty() && !vol_datos_correo.isEmpty() &&
                !vol_datos_internet.isEmpty())
           {
            Simcard sim=new DaoSimcard().consultar(simcard);
            PlanDatos pDatos=new DaoPlanDatos().consultar(cod_plan_datos);
               
            PlanDatosSimcard pDatosSim = new PlanDatosSimcard(sim,pDatos,
                    tipo_pago,vol_datos_correo,vol_datos_internet);
            
            int retorno = daoPlanDatosSim.guardar(pDatosSim);
            return retorno;
        } else {
            return -1;
        }
    }

    public PlanDatosSimcard consultar(String simcard) {
        PlanDatosSimcard pDatosSim = new PlanDatosSimcard();
        pDatosSim = daoPlanDatosSim.consultar(simcard);
        return pDatosSim;
    }

    public LinkedList consultar(String simcard,String cod_plan_datos,
     String tipo_pago,String vol_datos_correo, String vol_datos_internet) {
        LinkedList consulta = new LinkedList();
        consulta = daoPlanDatosSim.consultar(simcard,cod_plan_datos,
                    tipo_pago,vol_datos_correo,vol_datos_internet);
        return consulta;
    }

    public int editar(String simcard,String cod_plan_datos,
     String tipo_pago,String vol_datos_correo, String vol_datos_internet) {
        if (!simcard.isEmpty() && !cod_plan_datos.isEmpty()  && 
                !tipo_pago.isEmpty() && !vol_datos_correo.isEmpty() &&
                !vol_datos_internet.isEmpty())
           {
            Simcard sim=new DaoSimcard().consultar(simcard);
            PlanDatos pDatos=new DaoPlanDatos().consultar(cod_plan_datos);
               
            PlanDatosSimcard pDatosSim = new PlanDatosSimcard(sim,pDatos,
                    tipo_pago,vol_datos_correo,vol_datos_internet);
            
            int retorno = daoPlanDatosSim.editar(pDatosSim);
            return retorno;
        } else {
            return -1;
        }
    }
}
