package Presentation;

import TupleTypes.DadesHotel;
import TupleTypes.DadesReserva;
import java.util.ArrayList;

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
        //Crear i mostrar la finestra 1
        window1 = new Window1();
        window1.setVisible(true);
    }
    
    public ReservarHabitacioView(ReservarHabitacioController controlador){
        this.controlador = controlador;
        
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
    
    public void mostraHabitacions(ArrayList<DadesHotel> dades) {
        
    }
    
    public void mostraPreu(int preu) {
        
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
    public void mostraMissatge(String missatge) {
        
    }
    
    /**
     * Tanca la finestra de l'aplicació
     */
    public void tanca() {
        
    }
}
