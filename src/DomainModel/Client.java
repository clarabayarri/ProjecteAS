/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainModel;

/**
 *
 * @author lluisgh28
 */
public class Client {
    String dni;
    String nom;
    String cognoms;
    String email;

    
    public Client(String dni, String nom, String cognoms, String email) {
        this.dni = dni;
        this.nom = nom;
        this.cognoms = cognoms;
        this.email = email;
    }
    
    public String getNom() {
        return nom;
    }
    
    public String getCognoms() {
        return cognoms;
    }
    
    public String getEmail() {
        return email;
    }
}
