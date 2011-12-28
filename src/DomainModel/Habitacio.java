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
    Hotel hotel;
    ArrayList<Reserva> reserves;
    
    
    public Habitacio(Integer numero) {
        this.numero = numero;
        this.reserves = new ArrayList<Reserva>();
    }
    
    public Integer getNumero() {
       return numero; 
    }
    
    public boolean estaDisp(Date dataInici, Date dataFi) {
        for (int i = 0; i < reserves.size(); ++i) {
            if (reserves.get(i).esSolapa(dataInici, dataFi)) return false;
        }
        return true;
    }

    public void afReserva(Reserva r) {
        reserves.add(r);
    }
}
