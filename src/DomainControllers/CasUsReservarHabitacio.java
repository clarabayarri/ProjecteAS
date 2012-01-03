/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainControllers;

import DataInterfaces.ICtrlHotel;
import DataInterfaces.ICtrlPoblacio;
import DataInterfaces.ICtrlTipusHabitacio;
import DomainFactories.CtrlDataFactory;
import DomainModel.Hotel;
import DomainModel.Poblacio;
import DomainModel.TipusHabitacio;
import TupleTypes.DadesHabitacio;
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
    
    public DadesHabitacio seleccionarHabitacio(String hotel, String tipusHab) {
        
        CtrlDataFactory cdf = CtrlDataFactory.getInstance();
        ICtrlTipusHabitacio cth = cdf.getCtrlTipusHabitacio();
        TipusHabitacio th = cth.get(tipusHab);
        nomHotel = hotel;
        tipusHabitacio = tipusHab;
        numHabitacio = th.obteNumHabLliure(nomHotel, dataInici, dataFi);
        return new DadesHabitacio(hotel, numHabitacio, preuTotal);
    }
    
    public void pagament(String numTarg, Date dCad) {
        //TODO cridar servei de pagament
    }
    
}
