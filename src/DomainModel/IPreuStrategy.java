package DomainModel;

/**
 * Interficie comuna per les estrategies de preus
 * @author clara
 */
public interface IPreuStrategy {
    
    /**
     * Funcio que calcula el preu dun preutipushabitacio aplicant l'estrategia 
     * de preus pertinent
     * @param p
     * @return El preu final duna nit per un preutipushabitacio
     */
    public float calculaPreu(PreuTipusHabitacio p);
    
}
