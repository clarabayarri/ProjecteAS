package Presentation;

import TupleTypes.DadesHotel;
import TupleTypes.DadesReserva;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JFrame;

/**
 *
 * @author clara
 */
public class ReservarHabitacioView {
    
    private ReservarHabitacioController controlador;
    private static Window1 window1;
    private static Window2 window2;
    private static Window3 window3;
    private static Window4 window4;
    private static Window5 window5;
    
    private static void createAndShowGUI1() {
        //Mostrar la finestra 1
        window1.setVisible(true);
        
    }
    
    public ReservarHabitacioView(ReservarHabitacioController controlador){
        this.controlador = controlador;
        
        window1 = new Window1(this);
        
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI1();
            }
        });
        
    }
    
    /**
     * Mostra la primera pantalla
     * @param poblacions 
     * @author clara
     */
    public void mostraPoblacions(ArrayList<String> poblacions) {
        System.out.println("fins aqui ok");
        window1.loadPoblacions(poblacions);
    }
    
    public void confirmacioWindow1(String poblacio, Date dIni, Date dFi, int numOcup) {
        controlador.PrOkObteHabitacions(poblacio, dIni, dFi, numOcup);
    }
    
    public void mostraHabitacions(ArrayList<DadesHotel> dades) {
        window1.setVisible(false);
        window2 = new Window2();
        
        window2.setVisible(true);
    }
    
    public void mostraPreu(DadesReserva dades) {
        
    }
    
    public void mostraDadesClient(DadesReserva dades) {
        
    }
    
    /**
     * Pantalla de finalització on es mostra el missatge de confirmació del pagament.
     */
    public void mostraMissatgeFi() {
        
    }
    
    /**
     * Mostra el missatge corresponent a la message area
     * @param missatge 
     */
    public void mostraMissatge(String missatge, int windowIndex) {
        if(windowIndex == 1){
            window1.mostraMissatge(missatge);
        }
    }
    
    /**
     * Tanca la finestra de l'aplicació
     */
    public void tanca() {
        System.exit(0);
    }
}
