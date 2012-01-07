package Presentation;

import DomainControllers.CasUsReservarHabitacio;
import TupleTypes.DadesHotel;
import TupleTypes.DadesReserva;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author clara
 */
public class ReservarHabitacioController {
    
    private static ReservarHabitacioController singletonObject = null;
    private CasUsReservarHabitacio domini;
    private ReservarHabitacioView vista;
    
    /**
     * Creadora encarregada de crear les instàncies de domini i vista
     * @author clara
     */
    private ReservarHabitacioController() {
        domini = new CasUsReservarHabitacio();
        vista = new ReservarHabitacioView(this);
        
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                preparaPoblacions();
            }
        });
    }
    
    private void preparaPoblacions() {
        ArrayList<String> poblacions = domini.obtePoblacions();
        vista.mostraPoblacions(poblacions);
    }
    
    public static ReservarHabitacioController getInstance() {
        if(singletonObject == null){
            singletonObject = new ReservarHabitacioController();
        }
        return singletonObject;
    }
    
    /**
     * Transició entre la pantalla 1 i 2
     * @param pob
     * @param dIni
     * @param dFi
     * @param numOcup 
     * @author clara
     */
    public void PrOkObteHabitacions(String pob, Date dIni, Date dFi, int numOcup) {
        //comprovació de les dates
        Calendar c = Calendar.getInstance();
        c.setTime(dIni);
        long dataIni = c.getTimeInMillis();
        c.setTime(dFi);
        long dataFi = c.getTimeInMillis();
        if((dataFi < dataIni) || dataFi-dataIni < 1000){
            vista.mostraMissatge("Dates incorrectes",1);
            return;
        }
        
        //comprovació del nombre d'ocupants
        //com hem implementat un spinner amb els valors 1-9, no es pot donar un valor incorrecte
        /*if(numOcup <= 0){
            vista.mostraMissatge("Número d'ocupants incorrecte");
            return;
        }*/
        
        //intentem aconseguir les dades dels hotels
        try {
            ArrayList<DadesHotel> resultat = domini.buscarHabitacio(pob, dIni, dFi, numOcup);
            DadesReserva basicData = new DadesReserva();
            basicData.pob = pob;
            basicData.dIni = dIni;
            basicData.dFi = dFi;
            basicData.numOc = numOcup;
            vista.mostraHabitacions(basicData, resultat);
        }
        catch (Exception e) {
            //capturem les excepcions de domini
            if(e.getMessage().equals("hotelsNoDisp")){
                vista.mostraMissatge("No hi ha hotels dosponibles en aquesta població",1);
            }
        }
        
        
    }
    
    /**
     * Transició entre la pantalla 2 i 3
     * @param hotel
     * @param tipusHab 
     */
    public void PrOkSeleccionarHabitacio(String hotel, String tipusHab) {
        DadesReserva res = domini.seleccionarHabitacio(hotel, tipusHab);
        vista.mostraPreu(res);
    }
    
    /**
     * Transició entre la pantalla 3 i 4
     * @param dni 
     */
    public void PrOkIntroduirDni(String dni) {
        try {
            DadesReserva c = domini.introduirDni(dni);
            vista.mostraDadesClient(c);
            //mostra la info de les finestres anteriors
        }catch(Exception e){
           if(e.getMessage().equals("ClientNoExisteix")){
                vista.mostraMissatge("No hi ha cap client al sistema amb aquest DNI",3);
           }
        }
        
    }
    }
    
    /**
     * Transició entre la pantalla 4 i 5
     * @param numTarg
     * @param dCad 
     */
    public void PrOkRealitzaPagament(String numTarg, Date dCad){
         try {
            domini.pagament(numTarg, dCad);
            vista.mostraMissatgeFi();
        }catch(Exception e){
           if(e.getMessage().equals("ServeiNoDisponible")){
                vista.mostraMissatge("Error en el pagament",4);
           }
           
        }
        
    }
    
    /**
     * Confirmació de final
     */
    public void PrOkMissatgeFi() {
        vista.tanca();
    }
    
    /**
     * Petició de cancel·lació
     */
    public void PrCancel() {
        vista.tanca();
    }
}
