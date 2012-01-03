/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainFactories;

import DataInterfaces.ICtrlClient;
import DataInterfaces.ICtrlHabitacio;
import DataInterfaces.ICtrlHotel;
import DataInterfaces.ICtrlPoblacio;
import DataInterfaces.ICtrlTipusHabitacio;

/**
 *
 * @author lluisgh28
 */
public class CtrlDataFactory {
    private static CtrlDataFactory instance;
    private ICtrlPoblacio ctrlPoblacio;
    private ICtrlHotel ctrlHotel;
    private ICtrlClient ctrlClient;
    private ICtrlHabitacio ctrlHabitacio;
    
    
    private CtrlDataFactory() {};
    
    public static CtrlDataFactory getInstance() {
        if (instance == null) instance = new CtrlDataFactory();
        return instance;
    }
    
    public ICtrlPoblacio getCtrlPoblacio() {
        //TODO    if (ctrlPoblacio == null) ctrlPoblacio = new ICtrlPoblacio();
        return ctrlPoblacio;
    }
    
    public ICtrlHotel getCtrlHotel() {
    //TODO    if (ctrlHotel == null) ctrlHotel = new ICtrlHotel();
        return ctrlHotel;
    }
    
    public ICtrlClient getCtrlClient() {
    //TODO    if (ctrlClient == null) ctrlClient = new ICtrlClient();
        return ctrlClient;
    }
    
    public ICtrlHabitacio getCtrlHabitacio() {
    //TODO    if (ctrlHabitacio == null) ctrlHabitacio = new ICtrlHabitacio();
        return ctrlHabitacio;
    }
        
}
