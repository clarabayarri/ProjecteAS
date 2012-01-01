package DomainControllers;

import DataInterfaces.ICtrlPoblacio;
import DomainFactories.CtrlDataFactory;
import DomainModel.Poblacio;
import TupleTypes.DadesHotel;
import java.util.ArrayList;
import java.util.Date;

/**
 * Controlador transacció per la logica de la funcionalitat buscar habitació
 * @author clara
 */
public class TxBuscarHabitacio {
    private String poblacio;
    private Date dataInici;
    private Date dataFi;
    private int numOc;
    private ArrayList<DadesHotel> result;
    
    /**
     * Creadora per defecte, requereix les dades necessàries per a la transacció
     * @param poblacio
     * @param dataInici
     * @param dataFi
     * @param numOc 
     */
    public TxBuscarHabitacio(String poblacio, Date dataInici, Date dataFi, int numOc){
        this.poblacio = poblacio;
        this.dataInici = dataInici;
        this.dataFi = dataFi;
        this.numOc = numOc;
        this.result = new ArrayList<DadesHotel>();
    }
    
    /**
     * Executa la lògica de la transacció
     */
    public void executar() {
        CtrlDataFactory cdf = CtrlDataFactory.getInstance();
        ICtrlPoblacio cp = cdf.getCtrlPoblacio();
        Poblacio p = cp.get(poblacio);
        //TODO: la funció necessària encara no existeix.
        //result = p.getDisponibles(dataInici,dataFi,numOc);
    }
    
    /**
     * Obté el resultat de la transacció.
     * @return 
     */
    public ArrayList<DadesHotel> obteResultat(){
        return this.result;
    }
}
