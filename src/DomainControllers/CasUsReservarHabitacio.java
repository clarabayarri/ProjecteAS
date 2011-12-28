/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainControllers;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author lluisgh28
 */
public class CasUsReservarHabitacio {
    String poblacio;
    Date dataInici;
    Date dataFi;
    String dniClient;
    String nomHotel;
    String tipusHabitacio;
    Integer numHabitacio;
    Float preuTotal;
    
    
    public CasUsReservarHabitacio() {};
    
    public ArrayList<String> obtePoblacions() {
        ArrayList<String> s = new ArrayList<String>();
        return s;
    }
    
    /*    
    public buscarHabitacio(String pob, Date dIni, Date dFi, Integer numOcup) {
        
    }
     * 
     */
    
    
    public void pagament(String numTarg, Date dCad) {
        //TODO cridar servei de pagament
    }
    
}
