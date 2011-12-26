/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainModel;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author lluisgh28
 */
public class Habitacio {
    Integer numero;
    TipusHabitacio tipusHabitacio;
    ArrayList<Reserva> reserves;
    
    public Integer getNumero() {
       return numero; 
    }
    
    public boolean estaDisp(Date dataInici, Date dataFi) {
        for (int i = 0; i < reserves.size(); ++i) {
            if (reserves.get(i).esSolapa(dataInici, dataFi)) return false;
        }
        return true;
    }
    
    public String getNomTipus() {
        return tipusHabitacio.getNom();
    }
    
    public boolean esDeTipus(String tipus) {
        return tipus.equals(tipusHabitacio.getNom());
    }
    
    public void afReserva(Reserva r) {
        reserves.add(r);
    }
}
