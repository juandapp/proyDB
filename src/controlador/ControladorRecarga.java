/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dao.DaoRecarga;
import dao.DaoSimcard;
import java.util.LinkedList;
import logica.Recarga;
import java.sql.Date;

/**
 *
 * @author juandapp
 */
public class ControladorRecarga {

    DaoRecarga daoRecarga;

    public ControladorRecarga() {
        daoRecarga = new DaoRecarga();
    }

    public int guardar(int valor , Date fecha, String medio_recarga, String simcard) {
        int retorno = 0;
        try {
            if (valor>0 && fecha!=null && !medio_recarga.equals(" ") && !simcard.equals(" ")) {
                Recarga r = new Recarga(valor, fecha, medio_recarga, new DaoSimcard().consultar(simcard));
                retorno = daoRecarga.guardar(r);
            }
        } catch (Exception e) {
            retorno = -1;
        }

        return retorno;
    }

      public LinkedList consultar(String valor, String fecha,
           String medio_recarga, String simcard) {
        LinkedList recargaConsulta = new LinkedList();
        recargaConsulta = daoRecarga.consultar(valor, fecha, medio_recarga,
                simcard);
        return recargaConsulta;
    }
    public int editar(int valor , Date fecha, String medio_recarga, String simcard) {
        if (valor>0 && fecha!=null && !medio_recarga.equals("") && !simcard.equals("")) {
            Recarga r = new Recarga(valor,  fecha, medio_recarga, new DaoSimcard().consultar(simcard));
            int retorno = daoRecarga.editar(r);
            return retorno;
        } else {
            return -1;
        }
    }
}
