/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainModel;

/**
 *
 * @author lluisgh28
 */
public class TipusHabitacio {
    String nom;
    Integer capacitat;
    String descripcio;
    
    public TipusHabitacio(String nom, Integer capacitat, String descripcio) {
        this.nom = nom;
        this.capacitat = capacitat;
        this.descripcio = descripcio;
    }
    
    public String getNom() {
       return nom;
    }
    
    public Integer getCapacitat() {
        return capacitat;
    }
}
