package Presentation;

import TupleTypes.DadesHotel;
import TupleTypes.DadesReserva;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author clara i elena 
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
        window1.loadPoblacions(poblacions);
    }
    
    /**
     * 
     * @param poblacio
     * @param dIni
     * @param dFi
     * @param numOcup 
     */
    public void confirmacioWindow1(String poblacio, Date dIni, Date dFi, int numOcup) {
        controlador.PrOkObteHabitacions(poblacio, dIni, dFi, numOcup);
    }
    /**
     * mostra les dades dels hotels i les seves habitacions disponibles 
     * @param basicData
     * @param dades 
     * @author elena
     */
    public void mostraHabitacions(DadesReserva basicData, ArrayList<DadesHotel> dades) {
        window1.setVisible(false);
        window2 = new Window2();
        window2.loadData(basicData, dades);
        window2.setVisible(true);
    }
    /**
     * mostra el preu total de la reserva i les dades acumulades sobre la rserva 
     * @param dades 
     * @author elena
     */
    public void mostraPreu(DadesReserva dades) {
        window2.setVisible(false);
        window3 = new Window3();
        window3.mostraDades(dades);
        window3.setVisible(true);
    }
    
    /**
     * mostra les dades del client i totes les dades acumulades de la reserva
     * @param dades 
     * @author elena
     */
    public void mostraDadesClient(DadesReserva dades) {
        window3.setVisible(false);
        window4 = new Window4();
        //window4.mostraClient(dades);
        window4.setVisible(true);
    }
    
    /**
     * Pantalla de finalització on es mostra el missatge de confirmació del pagament.
     * @author elena
     */
    public void mostraMissatgeFi() {
        window4.setVisible(false);
        window5 = new Window5();
        window5.setVisible(true);
    }
    
    /**
     * Mostra el missatge corresponent a la message area
     * @param missatge 
     * @author clara i elena  
     */
    public void mostraMissatge(String missatge, int windowIndex) {
        if(windowIndex == 1){
            window1.mostraMissatge(missatge);
        }
        else if(windowIndex == 3) window3.mostraError(missatge);
       // else window4.mostraError(missatge);
    }
    
    /**
     * Tanca la finestra de l'aplicació
     * @author clara
     */
    public void tanca() {
        System.exit(0);
    }

    /**
     * crida a la funcio del controlador per a canviar de pantalla de la 3 a la 4 i li passa el dni que han introduït
     * com a nova informació 
     * @param Tdni
     * @author elena
     */
    void confirmacioWindow3(JTextField Tdni) {
        //throw new UnsupportedOperationException("Not yet implemented");
        controlador.PrOkIntroduirDni(Tdni.toString());
    }
}
