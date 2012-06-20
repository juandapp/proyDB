/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dao.DaoSucursal;
import java.util.LinkedList;
import logica.Sucursal;

/**
 *
 * @author juandapp
 */
public class ControladorSucursal {

    DaoSucursal daoSucursal;

    public ControladorSucursal() {
        daoSucursal = new DaoSucursal();
    }

    public int guardar(String cod_s, String nombre_s, String ciudad_s, String direccion_s,
            String telefono_s) {
        if (!cod_s.isEmpty() && !nombre_s.isEmpty() && !ciudad_s.isEmpty()
                && !direccion_s.isEmpty() && !telefono_s.isEmpty()) {
            Sucursal suc = new Sucursal(cod_s, nombre_s, ciudad_s, direccion_s, telefono_s);
            int retorno = daoSucursal.guardar(suc);
            return retorno;
        } else {
            return -1;
        }
    }

    public Sucursal consultar(String cod_s) {
        Sucursal s = new Sucursal();
        s = daoSucursal.consultar(cod_s);
        return s;
    }

    public LinkedList consultar(String cod_s, String nombre_s, String ciudad_s, String direccion_s,
            String telefono_s) {
        LinkedList sucursalConsultar = new LinkedList();
        sucursalConsultar = daoSucursal.consultar(cod_s, nombre_s, ciudad_s, direccion_s, telefono_s);
        return sucursalConsultar;
    }

    public int editar(String cod_s, String nombre_s, String ciudad_s, String direccion_s,
            String telefono_s) {
        if (!cod_s.isEmpty() && !nombre_s.isEmpty() && !ciudad_s.isEmpty()
                && !direccion_s.isEmpty() && !telefono_s.isEmpty()) {
            Sucursal suc = new Sucursal(cod_s, nombre_s, ciudad_s, direccion_s, telefono_s);
            int retorno = daoSucursal.editar(suc);
            return retorno;
        } else {
            return -1;
        }
    }

    /// metodo para llenar los JComboBox con las sucursales
    public String[] listar() {
        LinkedList sucursalesConsultar = daoSucursal.consultar("", "", "", "", "");
        String[] sucursales = new String[sucursalesConsultar.size()+1];
        //System.out.println("size"+sucursalesConsultar.size());
        sucursales[0] = " ";
        for (int i = 0; i < sucursalesConsultar.size(); i++) {
            sucursales[i+1] = ((Sucursal) sucursalesConsultar.get(i)).getCod_sucursal() + " - " + ((Sucursal) sucursalesConsultar.get(i)).getNombre();
        }
        return sucursales;
    }
}
