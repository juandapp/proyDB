/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dao.DaoCia_local;
import java.util.LinkedList;
import logica.Cia_local;

/**
 *
 * @author juandapp
 */
public class ControladorCiaLocal {

    DaoCia_local daoCiaLocal;

    public ControladorCiaLocal() {
        daoCiaLocal = new DaoCia_local();
    }

    public int guardar(String id, String nombre) {
        if (!id.isEmpty() && !nombre.isEmpty()) {
            Cia_local clocal = new Cia_local(id, nombre);
            int retorno = daoCiaLocal.guardar(clocal);
            return retorno;
        } else {
            return -1;
        }
    }

    public Cia_local consultar(String id) {
        Cia_local clocal = new Cia_local();
        clocal=daoCiaLocal.consultar(id);
        return clocal;
    }

    public LinkedList consultar(String id, String nombre) {
        LinkedList ciaLocalConsultar = new LinkedList();
        ciaLocalConsultar = daoCiaLocal.consultar(id, nombre);
        return ciaLocalConsultar;
    }

    public int editar(String id, String nombre) {
        if (!id.isEmpty() && !nombre.isEmpty()) {
            Cia_local cl = new Cia_local(id, nombre);
            int retorno = daoCiaLocal.editar(cl);
            return retorno;
        } else {
            return -1;
        }
    }
}
