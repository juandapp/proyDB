/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author juandapp
 */
public class Cia_internacional {
    String id, nombre,pais;
    int tarifa_mensajes,tar_llamada_entra_inter,tar_llamada_sale_inter,tar_llamada_entra_nal,
            tar_llamada_sale_nal,tar_datos_recibidos,tar_datos_enviados;

    public Cia_internacional() {
    }
    
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPais() {
        return pais;
    }

    public int getTar_datos_enviados() {
        return tar_datos_enviados;
    }

    public int getTar_datos_recibidos() {
        return tar_datos_recibidos;
    }

    public int getTar_llamada_entra_inter() {
        return tar_llamada_entra_inter;
    }

    public int getTar_llamada_entra_nal() {
        return tar_llamada_entra_nal;
    }

    public int getTar_llamada_sale_inter() {
        return tar_llamada_sale_inter;
    }

    public int getTar_llamada_sale_nal() {
        return tar_llamada_sale_nal;
    }

    public int getTarifa_mensajes() {
        return tarifa_mensajes;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setTar_datos_enviados(int tar_datos_enviados) {
        this.tar_datos_enviados = tar_datos_enviados;
    }

    public void setTar_datos_recibidos(int tar_datos_recibidos) {
        this.tar_datos_recibidos = tar_datos_recibidos;
    }

    public void setTar_llamada_entra_inter(int tar_llamada_entra_inter) {
        this.tar_llamada_entra_inter = tar_llamada_entra_inter;
    }

    public void setTar_llamada_entra_nal(int tar_llamada_entra_nal) {
        this.tar_llamada_entra_nal = tar_llamada_entra_nal;
    }

    public void setTar_llamada_sale_inter(int tar_llamada_sale_inter) {
        this.tar_llamada_sale_inter = tar_llamada_sale_inter;
    }

    public void setTar_llamada_sale_nal(int tar_llamada_sale_nal) {
        this.tar_llamada_sale_nal = tar_llamada_sale_nal;
    }

    public void setTarifa_mensajes(int tarifa_mensajes) {
        this.tarifa_mensajes = tarifa_mensajes;
    }  
    
     
}
