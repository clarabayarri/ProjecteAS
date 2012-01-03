/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainControllers;

import DataInterfaces.ICtrlPoblacio;
import DomainFactories.CtrlDataFactory;
import DomainModel.Poblacio;
import TupleTypes.DadesHotel;
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
        CtrlDataFactory cdf = CtrlDataFactory.getInstance();
        ICtrlPoblacio cp = cdf.getCtrlPoblacio();
        ArrayList<Poblacio> poblacions = cp.tots();
        ArrayList<String> result = new ArrayList<String>();
        for (int i = 0; i < poblacions.size(); ++i) {
            result.add(poblacions.get(i).getNom());
        }
        return result;
    }
    
        
    public ArrayList<DadesHotel> buscarHabitacio(String pob, Date dIni, Date dFi, Integer numOcup) {
        TxBuscarHabitacio buscar = new TxBuscarHabitacio(pob, dIni, dFi, numOcup);
        buscar.executar();
        return buscar.obteResultat();   
    }
     
     
    
    
    public void pagament(String numTarg, Date dCad) {
        //TODO cridar servei de pagament
    }
    
}
