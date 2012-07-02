/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.sql.Date;

/**
 *
 * @author JUANPAULO
 */
public class SimcardRobo {

    String ciudad;
    Simcard cod_SimCard;
    Date fecha;

    public SimcardRobo() {
    }

    public SimcardRobo(String ciudad, Simcard cod_SimCard, Date fecha) {
        this.ciudad = ciudad;
        this.cod_SimCard = cod_SimCard;
        this.fecha = fecha;
    }

    public String getCiudad() {
        return ciudad;
    }

    public Simcard getCod_SimCard() {
        return cod_SimCard;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setCod_SimCard(Simcard cod_SimCard) {
        this.cod_SimCard = cod_SimCard;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
