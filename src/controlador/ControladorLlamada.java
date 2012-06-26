/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dao.DaoCia_local;
import dao.DaoLlamada;
import dao.DaoSimcard;
import java.sql.Date;
import java.sql.Time;
import java.util.LinkedList;
import logica.Cia_local;
import logica.Llamada;
import logica.Simcard;

/**
 *
 * @author chokuno
 */
public class ControladorLlamada {
    DaoLlamada daoLlamada;

    public ControladorLlamada() {
        daoLlamada = new DaoLlamada();
    }

    public int guardar(String sim,Time hora_inicio,Date fecha,
            String telefono_destino,Time hora_fin,String cLocal) {
        int retorno = 0;
        try {
            if (!sim.isEmpty() && hora_inicio!=null && 
                    fecha!=null && !telefono_destino.isEmpty() &&
                    hora_fin!=null && !cLocal.isEmpty() ) {
                Simcard simcard= new DaoSimcard().consultar(sim);
                Cia_local ciaLocal= new DaoCia_local().consultar(cLocal);
                
                Llamada ll= new Llamada(simcard, hora_inicio, fecha,
                        telefono_destino, hora_fin, ciaLocal);
                
                retorno = daoLlamada.guardar(ll);
            }
        } catch (Exception e) {
            retorno = -1;
        }

        return retorno;
    }

    public Llamada consultar(String simcard) {
        Llamada ll = new Llamada();
        ll = daoLlamada.consultar(simcard);
        return ll;
    }

   public LinkedList consultar(String sim,String hora_inicio,String fecha,
            String telefono_destino,String hora_fin,String cLocal) {
        LinkedList llamadaConsultados = new LinkedList();
        llamadaConsultados = daoLlamada.consultar(sim, hora_inicio, fecha, 
                telefono_destino, hora_fin, cLocal);
        return llamadaConsultados;
    }
    public int editar(String sim,Time hora_inicio,Date fecha,
            String telefono_destino,Time hora_fin,String cLocal) {
        
            if (!sim.isEmpty() && hora_inicio!=null && 
                    fecha!=null && !telefono_destino.isEmpty() &&
                    hora_fin!=null && !cLocal.isEmpty() ) {
                Simcard simcard= new DaoSimcard().consultar(sim);
                Cia_local ciaLocal= new DaoCia_local().consultar(cLocal);
                
                Llamada ll= new Llamada(simcard, hora_inicio, fecha,
                        telefono_destino, hora_fin, ciaLocal);
            int retorno = daoLlamada.editar(ll);
            return retorno;
            }
            
         else {
            return -1;
        }
    }
}
