/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import sun.util.calendar.BaseCalendar.Date;

/**
 *
 * @author chokuno
 */
public class Contrato {
    private Abonado abonado;
    private Empleado empleado;
    private Plan plan;
    private Simcard sim;
    private Date fecha_ingreso;

    public Contrato() {
    }

    public Contrato(Abonado abonado, Empleado empleado, Plan plan, Simcard sim, Date fecha_ingreso) {
        this.abonado = abonado;
        this.empleado = empleado;
        this.plan = plan;
        this.sim = sim;
        this.fecha_ingreso = fecha_ingreso;
    }

    /**
     * @return the abonado
     */
    public Abonado getAbonado() {
        return abonado;
    }

    /**
     * @param abonado the abonado to set
     */
    public void setAbonado(Abonado abonado) {
        this.abonado = abonado;
    }

    /**
     * @return the empleado
     */
    public Empleado getEmpleado() {
        return empleado;
    }

    /**
     * @param empleado the empleado to set
     */
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    /**
     * @return the plan
     */
    public Plan getPlan() {
        return plan;
    }

    /**
     * @param plan the plan to set
     */
    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    /**
     * @return the sim
     */
    public Simcard getSim() {
        return sim;
    }

    /**
     * @param sim the sim to set
     */
    public void setSim(Simcard sim) {
        this.sim = sim;
    }

    /**
     * @return the fecha_ingreso
     */
    public Date getFecha_ingreso() {
        return fecha_ingreso;
    }

    /**
     * @param fecha_ingreso the fecha_ingreso to set
     */
    public void setFecha_ingreso(Date fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }
    
    
    
}
