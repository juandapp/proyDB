/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dao.DaoCia_internacional;
import dao.DaoMensajeSalRoamming;
import dao.DaoSimcard;
import java.sql.Date;
import java.sql.Time;
import java.util.LinkedList;
import logica.Cia_internacional;
import logica.MensajeSalRoamming;
import logica.Simcard;

/**
 *
 * @author chokuno
 */
public class ControladorMensajeSalRoamming {
     DaoMensajeSalRoamming daoMsjRoam;
     
    
    
    public ControladorMensajeSalRoamming()
    {
    daoMsjRoam= new DaoMensajeSalRoamming();

    }
    
    
    public int guardar(String sim, Date fecha, Time hora,
            String cInter, String tel_destino) {
        if(!sim.isEmpty() && sim!=null && hora!=null
                &&  !cInter.isEmpty() &&  !tel_destino.isEmpty()) {
            Simcard simcard= new DaoSimcard().consultar(sim);
            Cia_internacional ciaInter=new DaoCia_internacional().consultar(cInter);
            
            MensajeSalRoamming msjRoam= new MensajeSalRoamming(simcard, fecha,
                    hora, ciaInter, tel_destino);
            
            int retorno = daoMsjRoam.guardar(msjRoam);
            return retorno;
        } else {
            return -1;
        }
    }
        
     
     public MensajeSalRoamming consultar(String simcard) {
        MensajeSalRoamming msjRoam = new MensajeSalRoamming();
        msjRoam=daoMsjRoam.consultar(simcard);
        return msjRoam;
    }
     
     
     

    public LinkedList consultar(String sim, String fecha, String hora,
            String cInter, String tel_destino) {
        LinkedList msjRoamConsultar = new LinkedList();
        msjRoamConsultar = daoMsjRoam.consultar(sim, fecha, 
                hora, cInter, tel_destino);
        return msjRoamConsultar;
    }
    
    
    
    

    public int editar(String sim, Date fecha, Time hora,
            String cInter, String tel_destino) {
        if(!sim.isEmpty() && sim!=null && hora!=null
                &&  !cInter.isEmpty() &&  !tel_destino.isEmpty()) {
            Simcard simcard= new DaoSimcard().consultar(sim);
            Cia_internacional ciaInter=new DaoCia_internacional().consultar(cInter);
            
            MensajeSalRoamming msjRoam= new MensajeSalRoamming(simcard, fecha,
                    hora, ciaInter, tel_destino);
            int retorno = daoMsjRoam.editar(msjRoam);
            return retorno;
        } else {
            return -1;
        }
    }
}
