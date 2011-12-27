/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DataInterfaces;

import DomainModel.Habitacio;

/**
 *
 * @author lluisgh28
 */
public class CtrlDataFactory {
    private static CtrlDataFactory instance;
    private CtrlPoblacio ctrlPoblacio;
    private CtrlHotel ctrlHotel;
    private CtrlClient ctrlClient;
    private CtrlHabitacio ctrlHabitacio;
    
    
    private CtrlDataFactory() {};
    
    public static CtrlDataFactory getInstance() {
        if (instance == null) instance = new CtrlDataFactory();
        return instance;
    }
    
    public CtrlPoblacio getCtrlPoblacio() {
        if (ctrlPoblacio == null) ctrlPoblacio = new CtrlPoblacio();
        return ctrlPoblacio;
    }
    
    public CtrlHotel getCtrlHotel() {
        if (ctrlHotel == null) ctrlHotel = new CtrlHotel();
        return ctrlHotel;
    }
    
    public CtrlClient getCtrlClient() {
        if (ctrlClient == null) ctrlClient = new CtrlClient();
        return ctrlClient;
    }
    
    public CtrlHabitacio getCtrlHabitacio() {
        if (ctrlHabitacio == null) ctrlHabitacio = new CtrlHabitacio();
        return ctrlHabitacio;
    }
    
    
}
