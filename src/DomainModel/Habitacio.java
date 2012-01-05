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
        
    public boolean estaDisp(Date dataInici, Date dataFi) {
        for (int i = 0; i < reserves.size(); ++i) {
            if (reserves.get(i).esSolapa(dataInici, dataFi)) return false;
        }
        return true;
    }

    public void afReserva(Reserva r) {
        reserves.add(r);
    }

    boolean esDelHotel(String nomHotel) {
        return this.hotel.getNom().equals(nomHotel);
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public ArrayList<Reserva> getReserves() {
        return reserves;
    }

    public void setReserves(ArrayList<Reserva> reserves) {
        this.reserves = reserves;
    }
    
    
}
