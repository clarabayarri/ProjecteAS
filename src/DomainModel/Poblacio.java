/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainModel;

import TupleTypes.DadesHotel;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author elena
 */
public class Poblacio {
    
    String nom;
    ArrayList<Hotel> hotels;
    private DadesHotel result;
    
    
    public Poblacio(){};
    /**
     * creadora
     * @param nom és el nom de la població  
     */
    
    public Poblacio(String nom){
        this.nom = nom;
        this.hotels = new ArrayList<Hotel> ();
    }
    
    /**
     * retorna el nom de la Població
     * @return nom
     */
    public String getNom(){
        return this.nom;
    }
    
    /**
     * retorna una tupla amb la informació de l'hotel disponible entre les dates dIni i dFi, i les seves habitacions disponibles
     * que tinguin capacitat per a NumOcup
     * @param dIni 
     * @param dFi
     * @param NumOcup
     * @return res
     */
    
    public ArrayList<DadesHotel> getDisponibles(Date dIni, Date dFi, Integer NumOcup) throws Exception{
        ArrayList<DadesHotel> res = null;
        for(int i = 0;i < hotels.size();++i){
            if(hotels.get(i).estaDisp(dIni, dFi, NumOcup, this.result)){
                res.add(result);
            }
        }
        if (res.isEmpty()) throw new Exception("hotelsNoDisp");
        return res;
        
    }
    
    /**
     * afegrix l'hotel al ArrayList<Hotel> hotels;
     * @param h 
     */
    
    public void afHotel(Hotel h){
        hotels.add(h);
    }
    
    
    
}
