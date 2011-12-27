/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainModel;

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
     * Assigna un tipus al preutipushabitacio
     * @param tipus 
     */
    public void setTipus(TipusHabitacio tipus) {
        this.tipus = tipus;
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
}
