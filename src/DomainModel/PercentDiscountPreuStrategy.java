/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainModel;

/**
 *
 * @author clara
 */
public class PercentDiscountPreuStrategy implements IPreuStrategy {

    private float perc;
    
    /**
     * Creadora per defecte
     */
    public PercentDiscountPreuStrategy(){
        this.perc = 1;
    }
    
    /**
     * Creadora amb parametre de descompte
     * @param perc 
     */
    public PercentDiscountPreuStrategy(float perc){
        this.perc = perc;
    }
    
    /**
     * Implementacio propia del calculaPreu, on es multiplica el descompte 
     * percentual pel preu base
     * @param p
     * @return 
     */
    @Override
    public float calculaPreu(PreuTipusHabitacio p) {
        return p.getPreu() * this.perc;
    }
    
}
