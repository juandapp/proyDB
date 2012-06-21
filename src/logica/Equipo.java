/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author juandrd
 */
public class Equipo {

    String imei, modelo, marca;

    public Equipo() {
    }
  public Equipo(String imei, String modelo, String marca) {
        this.imei = imei;
        this.modelo = modelo;
        this.marca = marca;
    }
    public String getImei() {
        return imei;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
