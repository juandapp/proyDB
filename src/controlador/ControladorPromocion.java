/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dao.DaoPrepago;
import dao.DaoPromocion;
import java.util.LinkedList;
import logica.Equipo;
import logica.Prepago;
import logica.Promocion;

/**
 *
 * @author juandapp
 */
public class ControladorPromocion {

    DaoPromocion daoPromocion;
    DaoPrepago  daoPrepago;

    public ControladorPromocion() {
        daoPromocion = new DaoPromocion();
        daoPrepago=new DaoPrepago();
    }

    public int guardar(String nombre, String descripcion, String cod_plan) {
        if (!nombre.isEmpty() && !descripcion.isEmpty() && !cod_plan.isEmpty()) {
            Prepago pre=daoPrepago.consultar(nombre);
            Promocion promocion = new Promocion(nombre, descripcion, pre);
            int retorno = daoPromocion.guardar(promocion);
            return retorno;
        } else {
            return -1;
        }
    }

    public Promocion consultar(String nombre) {
        Promocion promocion = new Promocion();
        promocion = daoPromocion.consultar(nombre);
        return promocion;
    }

    public LinkedList consultar(String nombre, String cod_plan) {
        LinkedList proConsultar = new LinkedList();
        proConsultar = daoPromocion.consultar(nombre, cod_plan);
        return proConsultar;
    }

    public int editar(String nombre, String descripcion, String cod_plan) {
        if (!nombre.isEmpty() && !descripcion.isEmpty() && !cod_plan.isEmpty()) {
            Promocion promocion = new Promocion(nombre, descripcion, new DaoPrepago().consultar(cod_plan));
            int retorno = daoPromocion.editar(promocion);
            return retorno;
        } else {
            return -1;
        }
    }
}
