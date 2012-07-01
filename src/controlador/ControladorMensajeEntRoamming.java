/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dao.DaoCia_internacional;
import dao.DaoMensajeEntRoamming;
import dao.DaoSimcard;
import java.sql.Date;
import java.sql.Time;
import java.util.LinkedList;
import logica.Cia_internacional;
import logica.MensajeEntRoamming;
import logica.Simcard;

/**
 *
 * @author Juandapp
 */
public class ControladorMensajeEntRoamming {

    DaoMensajeEntRoamming daoMsjRoam;

    public ControladorMensajeEntRoamming() {
        daoMsjRoam = new DaoMensajeEntRoamming();
    }

    public int guardar(String sim, Date fecha, Time hora,
            String cInter, String tel_origen) {
        if (!sim.isEmpty() && sim != null && hora != null
                && !cInter.isEmpty() && !tel_origen.isEmpty()) {
            Simcard simcard = new DaoSimcard().consultar(sim);
            Cia_internacional ciaInter = new DaoCia_internacional().consultar(cInter);

            MensajeEntRoamming msjRoam = new MensajeEntRoamming(simcard, fecha,
                    hora, ciaInter, tel_origen);

            int retorno = daoMsjRoam.guardar(msjRoam);
            return retorno;
        } else {
            return -1;
        }
    }

    public MensajeEntRoamming consultar(String simcard) {
        MensajeEntRoamming msjRoam = new MensajeEntRoamming();
        msjRoam = daoMsjRoam.consultar(simcard);
        return msjRoam;
    }

    public LinkedList consultar(String sim, String fecha,
            String cInter, String tel_origen) {
        LinkedList msjRoamConsultar = new LinkedList();
        msjRoamConsultar = daoMsjRoam.consultar(sim, fecha, cInter, tel_origen);
        return msjRoamConsultar;
    }

    public int editar(String sim, Date fecha, Time hora,
            String cInter, String tel_origen) {
        if (!sim.isEmpty() && sim != null && hora != null
                && !cInter.isEmpty() && !tel_origen.isEmpty()) {
            Simcard simcard = new DaoSimcard().consultar(sim);
            Cia_internacional ciaInter = new DaoCia_internacional().consultar(cInter);
            MensajeEntRoamming msjRoam = new MensajeEntRoamming(simcard, fecha,
                    hora, ciaInter, tel_origen);
            int retorno = daoMsjRoam.editar(msjRoam);
            return retorno;
        } else {
            return -1;
        }
    }
}
