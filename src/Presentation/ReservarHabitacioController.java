package Presentation;

import DomainControllers.CasUsReservarHabitacio;
import TupleTypes.DadesHotel;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author clara
 */
public class ReservarHabitacioController {
    
    private CasUsReservarHabitacio domini;
    private ReservarHabitacioView vista;
    
    /**
     * Creadora encarregada de crear les instàncies de domini i vista
     */
    public ReservarHabitacioController() {
        domini = new CasUsReservarHabitacio();
        vista = new ReservarHabitacioView();
        
        //TODO: Crear la pantalla 1
        
        ArrayList<String> poblacions = domini.obtePoblacions();
        
        //TODO: omplir la llista amb poblacions
    }
    
    /**
     * Transició entre la pantalla 1 i 2
     * @param pob
     * @param dIni
     * @param dFi
     * @param numOcup 
     */
    public void PrOkObteHabitacions(String pob, Date dIni, Date dFi, int numOcup) {
        //comprovació de les dates
        if(dIni.after(dFi) || dIni.equals(dFi)){
            vista.mostraMissatge("Dates incorrectes");
            return;
        }
        
        //comprovació del nombre d'ocupants
        if(numOcup <= 0){
            vista.mostraMissatge("Número d'ocupants incorrecte");
            return;
        }
        
        //intentem aconseguir les dades dels hotels
        try {
            ArrayList<DadesHotel> resultat = domini.buscarHabitacio(pob, dIni, dFi, numOcup);
            vista.mostraHabitacions(resultat);
        }
        catch (Exception e) {
            //capturem les excepcions de domini
            if(e.getMessage().equals("hotelsNoDisp")){
                vista.mostraMissatge("No hi ha hotels dosponibles en aquesta població");
            }
        }
        
        
    }
    
    /**
     * Transició entre la pantalla 2 i 3
     * @param hotel
     * @param tipusHab 
     */
    public void PrOkSeleccionarHabitacio(String hotel, String tipusHab) {
        
    }
    
    /**
     * Transició entre la pantalla 3 i 4
     * @param dni 
     */
    public void PrOkIntroduirDni(String dni) {
        
    }
    
    /**
     * Transició entre la pantalla 4 i 5
     * @param numTarg
     * @param dCad 
     */
    public void PrOkRealitzaPagament(String numTarg, Date dCad){
        
    }
    
    /**
     * Confirmació de final
     */
    public void PrOkMissatgeFi() {
        
    }
    
    /**
     * Petició de cancel·lació
     */
    public void PrCancel() {
        
    }
}
