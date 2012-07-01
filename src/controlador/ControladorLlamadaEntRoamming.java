/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dao.DaoCia_internacional;
import dao.DaoLlamadaEntRoamming;
import dao.DaoLlamadaSalRoamming;
import dao.DaoSimcard;
import java.sql.Date;
import java.sql.Time;
import java.util.LinkedList;
import logica.Cia_internacional;
import logica.LlamadaEntRoamming;
import logica.LlamadaSalRoamming;
import logica.Simcard;

/**
 *
 * @author chokuno
 */
public class ControladorLlamadaEntRoamming {

    DaoLlamadaEntRoamming daollamaRoam;

    public ControladorLlamadaEntRoamming() {
        daollamaRoam = new DaoLlamadaEntRoamming();

    }

    public int guardar(String sim, Date fecha, Time hora_inicio,
            Time hora_fin, String pais_destino, String tel_Origen,
            String cInter) {
        if (!sim.isEmpty() && fecha != null && hora_inicio != null
                && hora_fin != null && !pais_destino.isEmpty()
                && !tel_Origen.isEmpty() && !cInter.isEmpty() && !cInter.equals(" ")) {
            
            Simcard simcard = new DaoSimcard().consultar(sim);
            Cia_internacional ciaInter = new DaoCia_internacional().consultar(cInter);

            LlamadaEntRoamming llamaRoam = new LlamadaEntRoamming(simcard,
                    fecha, hora_inicio, hora_fin, pais_destino, tel_Origen, ciaInter);

            int retorno = daollamaRoam.guardar(llamaRoam);
            
            return retorno;
        } else {

            return -1;
        }
    }

    public LlamadaEntRoamming consultar(String simcard) {
        LlamadaEntRoamming llamaRoam = new LlamadaEntRoamming();
        llamaRoam = daollamaRoam.consultar(simcard);
        return llamaRoam;
    }

    public LinkedList consultar(String sim, String fecha, String hora_inicio,
            String hora_fin, String pais_destino, String tel_Origen,
            String cInter) {
        LinkedList llamaRoamConsultar = new LinkedList();
        llamaRoamConsultar = daollamaRoam.consultar(sim, fecha, hora_inicio,
                hora_fin, pais_destino, tel_Origen, cInter);
        return llamaRoamConsultar;
    }

//    public int editar(String sim, Date fecha, Time hora_inicio,
//            Time hora_fin, String pais_destino, String tel_Origen,
//            String cInter) {
//        if (!sim.isEmpty() && sim != null && hora_inicio != null
//                && hora_fin != null && !pais_destino.isEmpty()
//                && !tel_Origen.isEmpty() && !cInter.isEmpty()) {
//            Simcard simcard = new DaoSimcard().consultar(sim);
//            Cia_internacional ciaInter = new DaoCia_internacional().consultar(cInter);
//
//            LlamadaSalRoamming llamaRoam = new LlamadaSalRoamming(simcard,
//                    fecha, hora_inicio, hora_fin, pais_destino, tel_Origen, ciaInter);
//            int retorno = daollamaRoam.editar(llamaRoam);
//            return retorno;
//        } else {
//            return -1;
//        }
//    }
}
