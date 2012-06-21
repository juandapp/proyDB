/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dao.DaoPlanDatos;
import java.util.LinkedList;
import logica.PlanDatos;

/**
 *
 * @author chokuno
 */
public class ControladorPlanDatos {
    
    DaoPlanDatos daoPlanDatos;

    public ControladorPlanDatos() {
        daoPlanDatos = new DaoPlanDatos();
    }

    public int guardar(String cod_plan_datos,
            int costo_internet,int costo_correo) {
        if (!cod_plan_datos.isEmpty() && costo_internet > 0 && costo_correo > 0)
           {
            PlanDatos pDatos = new PlanDatos(cod_plan_datos,costo_internet,
                    costo_correo);
            int retorno = daoPlanDatos.guardar(pDatos);
            return retorno;
        } else {
            return -1;
        }
    }

    public PlanDatos consultar(String cod_plan_datos) {
        PlanDatos pDatos = new PlanDatos();
        pDatos = daoPlanDatos.consultar(cod_plan_datos);
        return pDatos;
    }

    public LinkedList consultar(String cod_plan, String costo_internet, String costo_correo) {
        LinkedList consulta = new LinkedList();
        consulta = daoPlanDatos.consultar(cod_plan, costo_internet, costo_correo);
        return consulta;
    }

    public int editar(String cod_plan_datos,
            int costo_internet,int costo_correo) {
        if(!cod_plan_datos.isEmpty() && costo_internet > 0 && costo_correo > 0) {
            PlanDatos pDatos = new PlanDatos(cod_plan_datos,costo_internet,
                    costo_correo);
            int retorno = daoPlanDatos.editar(pDatos);
            return retorno;
        } else {
            return -1;
        }
    }
    
    
}
