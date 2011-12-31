package DataControllers;

import DataInterfaces.ICtrlHotel;
import DomainModel.Hotel;

/**
 * Contrlador de cada de gestió de dades encarregat de recuperar 
 * instancies d'hotels.
 * @author clara
 */
public class CtrlHotel implements ICtrlHotel{

    @Override
    public Hotel get(String nom) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
