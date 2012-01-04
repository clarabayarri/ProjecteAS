package DomainModel;

/**
 *
 * @author clara
 */
public class AbsoluteDiscountPreuStrategy implements IPreuStrategy {

    private float descompte;
    
    /**
     * Creadora per defecte
     */
    public AbsoluteDiscountPreuStrategy() {
        this.descompte = 0;
    }
    
    /**
     * Creadora amb parametre de descompte
     * @param descompte 
     */
    public AbsoluteDiscountPreuStrategy(float descompte){
        this.descompte = descompte;
    }
    
    /**
     * Getter de l'atribut descompte
     * @return 
     */
    public float getDescompte() {
        return this.descompte;
    }
    
    /**
     * Setter de l'atribut descompte
     * @param descompte 
     */
    public void setDescompte(float descompte){
        this.descompte = descompte;
    }
    
    /**
     * Implementacio propia del calculaPreu, on es resta el descompte absolut 
     * al preu base
     * @param p
     * @return 
     */
    @Override
    public float calculaPreu(PreuTipusHabitacio p) {
        return p.getPreu() - this.descompte;
    }
    
}
