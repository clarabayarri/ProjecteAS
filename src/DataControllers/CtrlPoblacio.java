package DataControllers;

import DataInterfaces.ICtrlPoblacio;
import DomainModel.Poblacio;
import java.util.ArrayList;

/**
 * Contrlador de cada de gestió de dades encarregat de recuperar 
 * instancies de poblacions.
 * @author clara
 */
public class CtrlPoblacio implements ICtrlPoblacio{

    @Override
    public Poblacio get(String nom) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public ArrayList<Poblacio> tots() {
        //TODO: this is a stub.
        
        ArrayList<Poblacio> resultat = new ArrayList<Poblacio>();
        Poblacio p = new Poblacio("Barcelona");
        resultat.add(p);
        
        return resultat;
    }
    
}
