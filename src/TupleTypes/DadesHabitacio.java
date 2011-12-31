/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TupleTypes;

/**
 *
 * @author elena_gratallops
 */
public class DadesHabitacio {
    String tipusHab;
    Integer numeroDisp;
    float preu;
    
    public DadesHabitacio(String tipus, Integer num, float preu){
        this.numeroDisp = num;
        this.tipusHab = tipus;
        this.preu = preu;
    }
    
    public String getTipusHab() {
        return this.tipusHab;
    }
    
    public Integer getNumeroDisp(){
        return this.numeroDisp;
    }
    
    public float getPREU(){
        return this.preu;
    }
    
    public void setTipusHab(String tipus){
        this.tipusHab = tipus;
    }
    
    public void setNumeroDisp(Integer num){
        this.numeroDisp = num;
    }
    
    public void setPreu(float preu){
        this.preu = preu;
    }
}
