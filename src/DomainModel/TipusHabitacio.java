/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainModel;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author lluisgh28
 */
public class TipusHabitacio {
    String nom;
    Integer capacitat;
    String descripcio;
    ArrayList<Habitacio> habitacions;
    
    public TipusHabitacio(String nom, Integer capacitat, String descripcio) {
        this.nom = nom;
        this.capacitat = capacitat;
        this.descripcio = descripcio;
        this.habitacions = new ArrayList<Habitacio>();
    }
    
    public String getNom() {
       return nom;
    }
    
    public Integer getCapacitat() {
        return capacitat;
    }
    
    public Integer numDisp(Date dIni, Date dFi, String nomHotel, Integer numOcup) {
        if (this.capacitat < numOcup) return 0;
        int num = 0;
        
        for (int i = 0; i < habitacions.size(); ++i) {
            if (habitacions.get(i).esDelHotel(nomHotel) 
                    && habitacions.get(i).estaDisp(dIni, dFi)) ++num;
        }
        
        return num;
    }
   
}
