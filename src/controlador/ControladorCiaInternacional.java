/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dao.DaoCia_internacional;
import java.util.LinkedList;
import logica.Cia_internacional;

/**
 *
 * @author juandapp
 */
public class ControladorCiaInternacional {

    DaoCia_internacional daoCiaInternacional;

    public ControladorCiaInternacional() {
        daoCiaInternacional = new DaoCia_internacional();
    }

    public int guardar(String id, String nombre, String pais, int tarifa_mensajes,
            int tar_llam_entra_i, int tar_llam_sale_i, int tar_llam_entra_n,
            int tar_llam_sale_n, int tar_datos_recibidos, int tar_datos_enviados) {
        if (!id.isEmpty() && !nombre.isEmpty() && !pais.isEmpty()
                && tarifa_mensajes > 0 && tar_llam_entra_i > 0 && tar_llam_sale_i > 0
                && tar_llam_entra_n > 0 && tar_llam_sale_n > 0 && tar_datos_recibidos > 0
                && tar_datos_enviados > 0) {
            Cia_internacional ciaI = new Cia_internacional(id, nombre, pais, tarifa_mensajes, tar_llam_entra_i,
                    tar_llam_sale_i, tar_llam_entra_n, tar_llam_sale_n,
                    tar_datos_recibidos, tar_datos_enviados);
            int retorno = daoCiaInternacional.guardar(ciaI);
            return retorno;
        } else {
            return -1;
        }
    }

    public Cia_internacional consultar(String id) {
        Cia_internacional ciaI = new Cia_internacional();
        ciaI = daoCiaInternacional.consultar(id);
        return ciaI;
    }

    public LinkedList consultar(String id, String nombre, String pais, String tarifa_mensajes,
            String tar_llam_entra_i, String tar_llam_sale_i, String tar_llam_entra_n,
            String tar_llam_sale_n, String tar_datos_recibidos, String tar_datos_enviados) {
        LinkedList Consultar = new LinkedList();
        Consultar = daoCiaInternacional.consultar(id, nombre, pais, tarifa_mensajes,
                tar_llam_entra_i, tar_llam_sale_i, tar_llam_entra_n,
                tar_llam_sale_n, tar_datos_recibidos, tar_datos_enviados);
        return Consultar;
    }

    public int editar(String id, String nombre, String pais, int tarifa_mensajes,
            int tar_llam_entra_i, int tar_llam_sale_i, int tar_llam_entra_n,
            int tar_llam_sale_n, int tar_datos_recibidos, int tar_datos_enviados) {
        if (!id.isEmpty() && !nombre.isEmpty() && !pais.isEmpty()
                && tarifa_mensajes > 0 && tar_llam_entra_i > 0 && tar_llam_sale_i > 0
                && tar_llam_entra_n > 0 && tar_llam_sale_n > 0 && tar_datos_recibidos > 0
                && tar_datos_enviados > 0) {
            Cia_internacional ciaI = new Cia_internacional(id, nombre, pais, tarifa_mensajes, tar_llam_entra_i,
                                                           tar_llam_sale_i, tar_llam_entra_n,  tar_llam_sale_n,
                                                            tar_datos_recibidos, tar_datos_enviados);
            int retorno = daoCiaInternacional.editar(ciaI);
            return retorno;
        } else {
            return -1;
        }
    }
    /// metodo para llenar los JComboBox con las Compañias
        public String[] listar() {
        LinkedList consultaCompaniaInt = daoCiaInternacional.consultar("", "", "", "", "", "", "", "", "", "");
        String[] companiaInt = new String[consultaCompaniaInt.size()+1];
        companiaInt[0] = " ";
        for (int i = 0; i < consultaCompaniaInt.size(); i++) {
            companiaInt[i+1] = ((Cia_internacional) consultaCompaniaInt.get(i)).getId() + " - " + ((Cia_internacional) consultaCompaniaInt.get(i)).getNombre();
        }
        return companiaInt;
    }
}
