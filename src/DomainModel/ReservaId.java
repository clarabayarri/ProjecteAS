/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainModel;

import java.util.Date;

/**
 *
 * @author lluisgh28
 */
public class ReservaId {
    String nomHotel;
    Integer numeroHabitacio;
    Date dataInici;

    public Date getDataInici() {
        return dataInici;
    }

    public void setDataInici(Date dataInici) {
        this.dataInici = dataInici;
    }

    public String getNomHotel() {
        return nomHotel;
    }

    public void setNomHotel(String nomHotel) {
        this.nomHotel = nomHotel;
    }

    public Integer getNumeroHabitacio() {
        return numeroHabitacio;
    }

    public void setNumeroHabitacio(Integer numeroHabitacio) {
        this.numeroHabitacio = numeroHabitacio;
    }
    
    
}
