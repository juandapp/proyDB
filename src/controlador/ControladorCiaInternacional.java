/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dao.DaoCia_internacional;
import java.util.LinkedList;
import logica.Cia_internacional;
import logica.Sucursal;

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
                && tarifa_mensajes>0 && tar_llam_entra_i>0 && tar_llam_sale_i>0
                && tar_llam_entra_n>0 && tar_llam_sale_n>0 && tar_datos_recibidos>0
                && tar_datos_enviados>0) {
            Cia_internacional ciaI = new Cia_internacional(id, nombre, pais, tarifa_mensajes, tar_llam_entra_i,
                                                           tar_llam_sale_i, tar_llam_entra_n, tar_llam_sale_n,
                                                            tar_datos_recibidos, tar_datos_enviados );
            int retorno = daoCiaInternacional.guardar(ciaI);
            return retorno;
        } else {
            return -1;
        }
    }

    public Sucursal consultar(String cod_s) {
        Sucursal s = new Sucursal();
        s = daoCiaInternacional.consultar(cod_s);
        return s;
    }

    public LinkedList consultar(String cod_s, String nombre_s, String ciudad_s, String direccion_s,
            String telefono_s) {
        LinkedList sucursalConsultar = new LinkedList();
        sucursalConsultar = daoCiaInternacional.consultar(cod_s, nombre_s, ciudad_s, direccion_s, telefono_s);
        return sucursalConsultar;
    }

    public int editar(String cod_s, String nombre_s, String ciudad_s, String direccion_s,
            String telefono_s) {
        if (!cod_s.isEmpty() && !nombre_s.isEmpty() && !ciudad_s.isEmpty()
                && !direccion_s.isEmpty() && !telefono_s.isEmpty()) {
            Sucursal suc = new Sucursal(cod_s, nombre_s, ciudad_s, direccion_s, telefono_s);
            int retorno = daoCiaInternacional.editar(suc);
            return retorno;
        } else {
            return -1;
        }
    }

    /// metodo para llenar los JComboBox con las sucursales

}
