/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.Date;

/**
 *
 * @author juandapp
 */
public class Empleado {

    String id_empleado, nombre, genero, estado_civil, tipo_contrato, cargo;
    Date fecha_nacimiento, fecha_ingreso;
    Sucursal cod_sucursal;

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public Sucursal getCod_sucursal() {
        return cod_sucursal;
    }

    public String getId_empleado() {
        return id_empleado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo_contrato() {
        return tipo_contrato;
    }

    public Date getFecha_ingreso() {
        return fecha_ingreso;
    }

    public String getEstado_civil() {
        return estado_civil;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    public void setCod_sucursal(Sucursal cod_sucursal) {
        this.cod_sucursal = cod_sucursal;
    }

    public void setFecha_ingreso(Date fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public void setId_empleado(String id_empleado) {
        this.id_empleado = id_empleado;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo_contrato(String tipo_contrato) {
        this.tipo_contrato = tipo_contrato;
    }
}
