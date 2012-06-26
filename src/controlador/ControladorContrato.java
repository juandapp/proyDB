/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dao.*;
import java.sql.Date;
import java.util.LinkedList;
import logica.*;

/**
 *
 * @author chokuno
 */
public class ControladorContrato {
     DaoContrato daoContrato;

    public ControladorContrato() {
        daoContrato = new DaoContrato();
    }

    public int guardar(String abonado, String empleado, String plan, 
            String sim, String fecha_ingreso) {
        if (!abonado.isEmpty() && !empleado.isEmpty()  && 
                !plan.isEmpty() && !sim.isEmpty() && !fecha_ingreso.isEmpty())
           {
            Abonado abon=new DaoAbonado().consultar(abonado);
            Empleado empl=new DaoEmpleado().consultar(empleado);
            Plan p=new DaoPlan().consultar(plan);
            Simcard simcard=new DaoSimcard().consultar(sim);
            Date fecha=java.sql.Date.valueOf(fecha_ingreso);
            
            Contrato contrato= new Contrato(abon, empl, p, simcard, fecha);
            
            
            int retorno = daoContrato.guardar(contrato);
            return retorno;
        } else {
            return -1;
        }
    }

    public Contrato consultar(String id_abonado) {
        Contrato contrato = new Contrato();
        contrato = daoContrato.consultar(id_abonado);
        return contrato;
    }

    public LinkedList consultar(String abonado, String empleado, String plan, 
            String sim, String fecha_ingreso) {
        LinkedList consulta = new LinkedList();
        consulta = daoContrato.consultar( abonado,  empleado,  plan, 
             sim,  fecha_ingreso);
        return consulta;
    }

    public int editar(String abonado, String empleado, String plan, 
            String sim, String fecha_ingreso) {
        if (!abonado.isEmpty() && !empleado.isEmpty()  && 
                !plan.isEmpty() && !sim.isEmpty() && !fecha_ingreso.isEmpty())
           {
            Abonado abon=new DaoAbonado().consultar(abonado);
            Empleado empl=new DaoEmpleado().consultar(empleado);
            Plan p=new DaoPlan().consultar(plan);
            Simcard simcard=new DaoSimcard().consultar(sim);
            Date fecha=java.sql.Date.valueOf(fecha_ingreso);
            
            Contrato contrato= new Contrato(abon, empl, p, simcard, fecha);
            
            
            int retorno = daoContrato.editar(contrato);
            return retorno;
        } else {
            return -1;
        }
    }
}
