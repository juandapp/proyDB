/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dao.DaoEquipo;
import java.util.LinkedList;
import logica.Equipo;

/**
 *
 * @author juandapp
 */
public class ControladorEquipo {

    DaoEquipo daoEquipo;

    public ControladorEquipo() {
        daoEquipo = new DaoEquipo();
    }

    public int guardar(String imei_eq, String modelo_eq, String marca_eq) {
        if (!imei_eq.isEmpty() && !modelo_eq.isEmpty() && !marca_eq.isEmpty()) {
            Equipo eq = new Equipo(imei_eq, modelo_eq, marca_eq);
            int retorno = daoEquipo.guardar(eq);
            return retorno;
        } else {
            return -1;
        }
    }

    public Equipo consultar(String imei) {
        Equipo eq = new Equipo();
        eq = daoEquipo.consultar(imei);
        return eq;
    }

    public LinkedList consultar(String imei_eq, String modelo_eq, String marca_eq) {
        LinkedList eqConsultar = new LinkedList();
        eqConsultar = daoEquipo.consultar(imei_eq, modelo_eq, marca_eq);
        return eqConsultar;
    }

    public int editar(String imei_eq, String modelo_eq, String marca_eq) {
        if (!imei_eq.isEmpty() && !modelo_eq.isEmpty() && !marca_eq.isEmpty()) {
            Equipo eq = new Equipo(imei_eq, modelo_eq, marca_eq);
            int retorno = daoEquipo.editar(eq);
            return retorno;
        } else {
            return -1;
        }
    }
    
    public String[] listar() {
        LinkedList equiposConsultar = daoEquipo.consultar("", "", "");
        String[] equipos = new String[equiposConsultar.size()+1];
        equipos[0] = " ";
        for (int i = 0; i < equiposConsultar.size(); i++) {
            equipos[i+1] = ((Equipo) equiposConsultar.get(i)).getImei() ;
        }
        return equipos;
    }
}
