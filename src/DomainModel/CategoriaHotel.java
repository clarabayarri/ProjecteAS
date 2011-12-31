/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainModel;

/**
 *
 * @author elena_gratallops
 */
public class CategoriaHotel {
    
    String nom;
    
    public CategoriaHotel(String cat){
        this.nom = cat;
    }
    
    public String getNom(){
        return this.nom;
    }
    
    
}
