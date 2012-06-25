/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dao.DaoCia_local;
import dao.DaoConsumoMensaje;
import dao.DaoSimcard;
import java.util.LinkedList;
import logica.Cia_local;
import logica.ConsumoMensaje;
import logica.Simcard;

/**
 *
 * @author chokuno
 */
public class ControladorConsumoMensaje {
     DaoConsumoMensaje daoConsumoMsjs;

    public ControladorConsumoMensaje() {
        daoConsumoMsjs = new DaoConsumoMensaje();
    }

    public int guardar(String simcard,
     String compania_local,String msjs_enviados) {
        if (!simcard.isEmpty() && !compania_local.isEmpty()  && 
                !msjs_enviados.isEmpty() )
           {
            Simcard sim=new DaoSimcard().consultar(simcard);
            Cia_local cLocal=new DaoCia_local().consultar(compania_local);
               
            ConsumoMensaje consumoMsjs = new ConsumoMensaje(sim,cLocal,
                    Integer.parseInt(msjs_enviados));
            
            int retorno = daoConsumoMsjs.guardar(consumoMsjs);
            return retorno;
        } else {
            return -1;
        }
    }

    public ConsumoMensaje consultar(String simcard) {
        ConsumoMensaje consumoMsjs = new ConsumoMensaje();
        consumoMsjs = daoConsumoMsjs.consultar(simcard);
        return consumoMsjs;
    }

    public LinkedList consultar(String simcard,
     String compania_local,String msjs_enviados) {
        LinkedList consulta = new LinkedList();
        consulta = daoConsumoMsjs.consultar(simcard,compania_local,
                    msjs_enviados);
        return consulta;
    }

    public int editar(String simcard,
     String compania_local,String msjs_enviados) {
        if (!simcard.isEmpty() && !compania_local.isEmpty()  && 
                !msjs_enviados.isEmpty() )
           {
            Simcard sim=new DaoSimcard().consultar(simcard);
            Cia_local cLocal=new DaoCia_local().consultar(compania_local);
               
            ConsumoMensaje consumoMsjs = new ConsumoMensaje(sim,cLocal,
                    Integer.parseInt(msjs_enviados));
            
            
            int retorno = daoConsumoMsjs.editar(consumoMsjs);
            return retorno;
        } else {
            return -1;
        }
    }
}
