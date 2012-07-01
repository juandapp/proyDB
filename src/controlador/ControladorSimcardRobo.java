/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dao.DaoCia_local;
import dao.DaoConsumoMensaje;
import dao.DaoSimCardRobo;
import dao.DaoSimcard;
import java.sql.Date;
import java.sql.Time;
import java.util.LinkedList;
import logica.Cia_local;
import logica.ConsumoMensaje;
import logica.Simcard;
import logica.SimcardRobo;

/**
 *
 * @author chokuno
 */
public class ControladorSimcardRobo {
     DaoSimCardRobo daoSimcardRobo;

    public ControladorSimcardRobo() {
        daoSimcardRobo = new DaoSimCardRobo();
    }

    public int guardar(String simcard, String ciudad, Date fecha) {
        if (!simcard.isEmpty())
           {
            SimcardRobo sim = new SimcardRobo();
            sim.setCiudad(ciudad);
            sim.setFecha(fecha);
            sim.setCod_SimCard(new DaoSimcard().consultar(simcard));            
            int retorno = daoSimcardRobo.guardar(sim);
            return retorno;
        } else {
            return -1;
        }
    }

    public SimcardRobo consultar(String simcard) {
        SimcardRobo scardRobo = new SimcardRobo();
        scardRobo = daoSimcardRobo.consultar(simcard);
        return scardRobo;
    }

    public LinkedList consultar(String simcard,
     String ciudad,String fecha) {
        LinkedList consulta = new LinkedList();
        consulta = daoSimcardRobo.consultar(simcard,ciudad,fecha);
        return consulta;
    }

//    public int editar(String simcard,
//     String compania_local,int msjs_enviados, Date fecha, Time hora) {
//        if (!simcard.isEmpty() && !compania_local.isEmpty()  && 
//                msjs_enviados>0 && !fecha.equals(null) && !hora.equals(null) )
//           {
//            Simcard sim=new DaoSimcard().consultar(simcard);
//            Cia_local cLocal=new DaoCia_local().consultar(compania_local);
//               
//            ConsumoMensaje consumoMsjs = new ConsumoMensaje(sim,cLocal,
//                    msjs_enviados, fecha, hora);
//            
//            
//            int retorno = daoSimcardRobo.editar(consumoMsjs);
//            return retorno;
//        } else {
//            return -1;
//        }
//    }
}
