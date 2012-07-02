/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dao.DaoAbonado;
import dao.DaoCorreos;
import java.util.LinkedList;
import logica.Abonado;
import logica.Correos;

/**
 *
 * @author chokuno
 */
public class ControladorCorreos {
      DaoCorreos daoCorreos;
   
 

    public ControladorCorreos() {
        daoCorreos = new DaoCorreos();
       
        
    }

    public int guardar(String email, String id_abonado) {
        if (!email.isEmpty() && !id_abonado.isEmpty() ) {
            Abonado abonado=new DaoAbonado().consultar(id_abonado);
             System.err.println(abonado.getId());
            Correos correo=new Correos(email, abonado);
            int retorno = daoCorreos.guardar(correo);
            return retorno;
        } else {
            return -1;
        }
    }

    public Correos consultar(String email) {
        Correos promocion = new Correos();
        promocion = daoCorreos.consultar(email);
        return promocion;
    }

    public LinkedList consultar(String email, String id_abonado) {
        LinkedList correoConsultar = new LinkedList();
        correoConsultar = daoCorreos.consultar(email, id_abonado);
        return correoConsultar;
    }

    public int editar(String email, String id_abonado) {
        if (!email.isEmpty() && !email.isEmpty() ) {
            Abonado abonado=new DaoAbonado().consultar(id_abonado);
            Correos correo=new Correos(email, abonado);
            int retorno = daoCorreos.editar(correo);
            return retorno;
        } else {
            return -1;
        }
    }
}
