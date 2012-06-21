/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author juandrd
 */
public class Simcard {

    String codigo, num_telefono, activacion_internet, bloqueado_por_robo,
            activacion_correo, autorizacion_roaming;
            
    public Simcard() {
    }
    public Simcard(String codigo, String num_telefono, String activacion_internet, String bloqueado_por_robo,
            String activacion_correo, String autorizacion_roaming){
        this.codigo=codigo;
        this.num_telefono=num_telefono;
        this.activacion_internet=activacion_internet;
        this.bloqueado_por_robo=bloqueado_por_robo;
        this.activacion_correo=activacion_correo;
        this.autorizacion_roaming=autorizacion_roaming;
    }

    public String getActivacion_correo() {
        return activacion_correo;
    }

    public String getActivacion_internet() {
        return activacion_internet;
    }

    public String getAutorizacion_roaming() {
        return autorizacion_roaming;
    }

    public String getBloqueado_por_robo() {
        return bloqueado_por_robo;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNum_telefono() {
        return num_telefono;
    }

    public void setActivacion_correo(String activacion_correo) {
        this.activacion_correo = activacion_correo;
    }

    public void setActivacion_internet(String activacion_internet) {
        this.activacion_internet = activacion_internet;
    }

    public void setAutorizacion_roaming(String autorizacion_roaming) {
        this.autorizacion_roaming = autorizacion_roaming;
    }

    public void setBloqueado_por_robo(String bloqueado_por_robo) {
        this.bloqueado_por_robo = bloqueado_por_robo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNum_telefono(String num_telefono) {
        this.num_telefono = num_telefono;
    }
    
    
}
