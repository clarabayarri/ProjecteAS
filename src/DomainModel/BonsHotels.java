/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainModel;

/**
 *
 * @author clara
 */
public class BonsHotels {
    
    private static BonsHotels singletonObject = null;
    private float quotaFixa = 0;
    private float quotaVariable = 0;
    
    /**
     * Creadora privada, s'ha d'accedir des de fora a través de getInstance()
     */
    private BonsHotels() {
        
    }
    
    /**
     * Recupera la instància singleton de la classe
     * @return 
     */
    public static BonsHotels getInstance() {
        if(singletonObject == null){
            singletonObject = new BonsHotels();
        }
        return singletonObject;
    }
    
    /**
     * Assigna una quotaFixa
     * @param quotaFixa 
     */
    public void setQuotaFixa(float quotaFixa) {
        this.quotaFixa = quotaFixa;
    }
    
    /**
     * Getter de quota fixa
     * @return 
     */
    public float getQuotaFixa() {
        return this.quotaFixa;
    }
    
    /**
     * Assigna una quotaVariable
     * @param quotaVariable 
     */
    public void setQuotaVariable(float quotaVariable) {
        this.quotaVariable = quotaVariable;
    }
    
    /**
     * Getter de quota variable
     * @return 
     */
    public float getQuotaVariable() {
        return this.quotaVariable;
    }
    
    /**
     * Recupera l'identificador de la reserva actual
     * @return 
     */
    public String getReservationId() {
        //TODO: arreglar aixo
        return "";
    }
}
