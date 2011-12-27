/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DataInterfaces;

import DomainModel.Habitacio;

/**
 *
 * @author clara
 */
public interface CtrlHabitacio {
    
    /**
     * Recupera una habitacio a partir del nom de l'hotel i el numero de 
     * l'habitacio
     * @param numero
     * @param nomHotel
     * @return 
     */
    public Habitacio get(Integer numero, String nomHotel);
}
