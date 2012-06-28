/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dao.DaoPostpago;
import java.util.LinkedList;
import logica.Postpago;
import logica.Plan;

/**
 *
 * @author juandapp
 */
public class ControladorPostPago {

    DaoPostpago daoPostpago;

    public ControladorPostPago() {
        daoPostpago = new DaoPostpago();
    }

    public int guardar(String cod_plan, int tarifa_otro_operador, int tarifa_msj_multimedia,
            int tarifa_msj_texto, int total_minutos, int costo_min_adicional) {
        if (!cod_plan.isEmpty() && total_minutos> 0 && costo_min_adicional>0
                && tarifa_otro_operador>0 && tarifa_msj_multimedia>0
                && tarifa_msj_texto>0) {
            Postpago postPago = new Postpago(new Plan(cod_plan, tarifa_otro_operador, tarifa_msj_multimedia, tarifa_msj_texto), total_minutos, costo_min_adicional);
            int retorno = daoPostpago.guardar(postPago);
            return retorno;
        } else {
            return -1;
        }
    }

    public Postpago consultar(String cod_plan) {
        Postpago postPago = new Postpago();
        postPago = daoPostpago.consultar(cod_plan);
        return postPago;
    }

    public LinkedList consultar(String cod_plan,  String tarifa_otro_operador, String tarifa_msj_multimedia, String tarifa_msj_texto, String total_minutos, String costo_min_adicional) {
        LinkedList consulta = new LinkedList();
        consulta = daoPostpago.consultar(cod_plan,   tarifa_otro_operador, tarifa_msj_multimedia,  tarifa_msj_texto,total_minutos,  costo_min_adicional);
        return consulta;
    }

    public int editar(String cod_plan, int tarifa_otro_operador, int tarifa_msj_multimedia, int tarifa_msj_texto, int total_minutos, int costo_min_adicional) {
        if (!cod_plan.isEmpty() && total_minutos > 0 && costo_min_adicional > 0
                && tarifa_otro_operador>0 && tarifa_msj_multimedia>0
                && tarifa_msj_texto>0) {
            Postpago post = new Postpago(new Plan(cod_plan, tarifa_otro_operador, tarifa_msj_multimedia, tarifa_msj_texto), total_minutos, costo_min_adicional);
            int retorno = daoPostpago.editar(post);
            return retorno;
        } else {
            return -1;
        }
    }
    
    
     public String[] listar() {
        LinkedList postConsultar = daoPostpago.consultar("", "", "", "", "", "");
        String[] postpagos = new String[postConsultar.size()+1];
        postpagos[0] = " ";
        for (int i = 0; i < postConsultar.size(); i++) {
            postpagos[i+1] = ((Postpago) postConsultar.get(i)).getCod_plan().getCod_plan();
        }
        return postpagos;
    }
}
