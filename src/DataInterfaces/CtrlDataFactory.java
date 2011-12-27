/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DataInterfaces;

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
    
    
}
