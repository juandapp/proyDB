/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dao.DaoAbonado;
import dao.DaoEquipo;
import java.sql.Date;
import java.util.LinkedList;
import logica.Abonado;
import logica.Equipo;

/**
 *
 * @author chokuno
 */
public class ControladorAbonado {
    
    DaoAbonado daoAbonado;

    public ControladorAbonado() {
        daoAbonado = new DaoAbonado();
    }

    public int guardar(String id,String tipo_documento,String nombres,
            String apellidos,String direccion,String genero,String estado_civil, 
            Date fecha_nacimiento,String comuna,String barrio,String ciudad,
            String tipo,String imei) {
        if(!id.isEmpty() && !tipo_documento.isEmpty() && !nombres.isEmpty() &&
            !apellidos.isEmpty() && !direccion.isEmpty() && !genero.isEmpty() &&
            !estado_civil.isEmpty() && fecha_nacimiento!=null && !comuna.isEmpty() &&
            !barrio.isEmpty() && !ciudad.isEmpty() && !ciudad.isEmpty() && !imei.isEmpty()
                ) {
            Equipo e=new DaoEquipo().consultar(imei);
            Abonado abonado= new Abonado(id, tipo_documento, nombres, apellidos, 
                    direccion, genero, estado_civil, fecha_nacimiento, comuna,
                    barrio, ciudad, tipo, e);
            int retorno = daoAbonado.guardar(abonado);
            return retorno;
        } else {
            return -1;
        }
    }

    public Abonado consultar(String id) {
        Abonado a = new Abonado();
        a=daoAbonado.consultar(id);
        return a;
    }

    public LinkedList consultar(String id,String tipo_documento,String nombres,
            String apellidos,String direccion,String genero,String estado_civil, 
            String fecha_nacimiento,String comuna,String barrio,String ciudad,
            String tipo,String imei) {
        LinkedList abonadoConsultar = new LinkedList();
        abonadoConsultar = daoAbonado.consultar(id, tipo_documento, nombres, apellidos, 
                    direccion, genero, estado_civil, fecha_nacimiento, comuna,
                    barrio, ciudad, tipo, imei);
        return abonadoConsultar;
    }

    public int editar(String id,String tipo_documento,String nombres,
            String apellidos,String direccion,String genero,String estado_civil, 
            Date fecha_nacimiento,String comuna,String barrio,String ciudad,
            String tipo,String imei) {
        if(!id.isEmpty() && !tipo_documento.isEmpty() && !nombres.isEmpty() &&
            !apellidos.isEmpty() && !direccion.isEmpty() && !genero.isEmpty() &&
            !estado_civil.isEmpty() && fecha_nacimiento!=null && !comuna.isEmpty() &&
            !barrio.isEmpty() && !ciudad.isEmpty() && !ciudad.isEmpty() && !imei.isEmpty()
                ) {
            Equipo e=new DaoEquipo().consultar(imei);
            Abonado abonado= new Abonado(id, tipo_documento, nombres, apellidos, 
                    direccion, genero, estado_civil, fecha_nacimiento, comuna,
                    barrio, ciudad, tipo, e);
            int retorno = daoAbonado.editar(abonado);
            return retorno;
        } else {
            return -1;
        }
    }
}
