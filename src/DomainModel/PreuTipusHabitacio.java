/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainModel;

import java.util.Date;

/**
 *
 * @author clara
 */
public class PreuTipusHabitacio {
    
    private float preu;
    private TipusHabitacio tipus;
    private IPreuStrategy strategy;
    
    /**
     * Creadora per defecte
     */
    public PreuTipusHabitacio(){
        this.preu = 0;
    }
    
    /**
     * Assigna un preu base
     * @param preu 
     */
    public void setPreu(float preu) {
        this.preu = preu;
    }

    /**
     * Recupera el preu base d'aquest preutipushabitacio.<br />
     * En el lliurament 1, hi ha una errata que diu que el tipus del retorn és 
     * integer, quan ha de ser float.
     * @return preu base
     */
    public float getPreu() {
        return this.preu;
    }
    
    /**
     * Assigna un tipus al preutipushabitacio
     * @param tipus 
     */
    public void setTipus(TipusHabitacio tipus) {
        this.tipus = tipus;
    }
    
    /**
     * Getter del tipus d'habitació corresponent
     * @return 
     */
    public TipusHabitacio getTipus() {
        return this.tipus;
    }
    
    
    /**
     * Calcula el preu a partir de lestrategia associada
     * @return 
     */
    public float calculaPreu() {
        return this.strategy.calculaPreu(this);
    }
    
    /**
     * Compara si el tipus és el que es passa per paràmetre
     * @param tipus
     * @return Cert si el tipus del paràmetre coincideix amb el tipus de la 
     * instància.
     */
    public boolean isOfType(String tipus) {
        //TODO: arreglar amb el tipus correcte
        return this.tipus.getNom().equals(tipus);
    }
    
    /**
     * Calcula el nombre d'habitacions disponibles del tipus d'habitació de 
     * l'hotel per unes dates i un nombre d'ocupants.
     * @param dIni
     * @param dFi
     * @param nomHotel
     * @param numOcup
     * @return 
     */
    public Integer numDisp(Date dIni, Date dFi, String nomHotel, Integer numOcup) {
        return this.tipus.numDisp(dIni, dFi, nomHotel, numOcup);
    }
    
    /**
     * Retorna el nom del tipus d'aquest PreuTipusHabitació.
     * @return 
     */
    public String getNomTipus() {
        return this.tipus.getNom();
    }

}
