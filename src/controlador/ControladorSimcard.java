/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dao.DaoSimcard;
import java.util.LinkedList;
import logica.Simcard;


/**
 *
 * @author juandapp
 */
public class ControladorSimcard {

    DaoSimcard daoSimcard;

    public ControladorSimcard() {
        daoSimcard = new DaoSimcard();
    }

    public int guardar(String codigo, String num_telefono, String activacion_internet, String bloqueado_por_robo,
            String activacion_correo, String autorizacion_roaming ) {
        if (!codigo.isEmpty() && !num_telefono.isEmpty() && !activacion_internet.isEmpty()
                && !bloqueado_por_robo.isEmpty() && !activacion_correo.isEmpty()) {
            Simcard sim = new Simcard(codigo, num_telefono, activacion_internet, bloqueado_por_robo, activacion_correo, autorizacion_roaming);
            int retorno = daoSimcard.guardar(sim);
            return retorno;
        } else {
            return -1;
        }
    }

    public Simcard consultar(String codigo) {
        Simcard s = new Simcard();
        s = daoSimcard.consultar(codigo);
        return s;
    }

    public LinkedList consultar(String codigo, String num_telefono, String activacion_internet, String bloqueado_por_robo,
            String activacion_correo, String autorizacion_roaming) {
        LinkedList simConsultar = new LinkedList();
        simConsultar = daoSimcard.consultar(codigo, num_telefono, activacion_internet, bloqueado_por_robo, activacion_correo, autorizacion_roaming);
        return simConsultar;
    }

    public int editar(String codigo, String num_telefono, String activacion_internet, String bloqueado_por_robo,
            String activacion_correo, String autorizacion_roaming) {
        if (!codigo.isEmpty() && !num_telefono.isEmpty() && !activacion_internet.isEmpty()
                && !bloqueado_por_robo.isEmpty() && !activacion_correo.isEmpty()) {
            Simcard sim = new Simcard(codigo, num_telefono, activacion_internet, bloqueado_por_robo, activacion_correo, autorizacion_roaming);
            int retorno = daoSimcard.editar(sim);
            return retorno;
        } else {
            return -1;
        }
    }
    
     public String[] listar() {
        LinkedList SimcardConsultar = daoSimcard.consultar("", "", " ", " ", " ", " ");
        String[] simcards = new String[SimcardConsultar.size()+1];
        simcards[0] = " ";
        for (int i = 0; i < SimcardConsultar.size(); i++) {
            simcards[i+1] = ((Simcard) SimcardConsultar.get(i)).getCodigo();
        }
        return simcards;
    }
}
