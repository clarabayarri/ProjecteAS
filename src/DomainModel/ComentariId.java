/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainModel;

import java.util.Date;

/**
 *
 * @author elena_gratallops
 */
public class ComentariId {
    String nomHotel;
    String dniClient;
    Date data;
    
    public ComentariId(){};
    
    
    public ComentariId(String nom, String dni, Date d){
        this.data = d;
        this.dniClient = dni;
        this.nomHotel = nom;
    
    };

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getDniClient() {
        return dniClient;
    }

    public void setDniClient(String dniClient) {
        this.dniClient = dniClient;
    }

    public String getNomHotel() {
        return nomHotel;
    }

    public void setNomHotel(String nomHotel) {
        this.nomHotel = nomHotel;
    }
    
    
    
    
}
