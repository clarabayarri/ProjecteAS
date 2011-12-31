package DataControllers;

import DataInterfaces.ICtrlHabitacio;
import DomainModel.Habitacio;

/**
 * Contrlador de cada de gestió de dades encarregat de recuperar 
 * instancies d'habitacions.
 * @author clara
 */
public class CtrlHabitacio implements ICtrlHabitacio{

    @Override
    public Habitacio get(Integer numero, String nomHotel) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
