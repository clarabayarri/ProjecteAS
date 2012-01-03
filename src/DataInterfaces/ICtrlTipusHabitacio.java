/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DataInterfaces;

import DomainModel.TipusHabitacio;
import java.util.ArrayList;

/**
 *
 * @author lluisgh28
 */
public interface ICtrlTipusHabitacio {
    
    public TipusHabitacio get(String nom);
    
    public ArrayList<TipusHabitacio> tots();
}
