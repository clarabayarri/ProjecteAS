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
    
    public TipusHabitacio() {
        
    }
    
    public TipusHabitacio(String nom, Integer capacitat, String descripcio) {
        this.nom = nom;
        this.capacitat = capacitat;
        this.descripcio = descripcio;
        this.habitacions = new ArrayList<Habitacio>();
    }
    
    
    public Integer numDisp(Date dIni, Date dFi, String nomHotel, Integer numOcup) {

        int num = 0;
        if (this.capacitat >= numOcup) {
            for (int i = 0; i < habitacions.size(); ++i) {
                if (habitacions.get(i).esDelHotel(nomHotel) &&
                        habitacions.get(i).estaDisp(dIni, dFi)) ++num;
            }
        }
        return num;
    }

    public Integer getCapacitat() {
        return capacitat;
    }

    public void setCapacitat(Integer capacitat) {
        this.capacitat = capacitat;
    }

    public String getDescripcio() {
        return descripcio;
    }

    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }

    public ArrayList<Habitacio> getHabitacions() {
        return habitacions;
    }

    public void setHabitacions(ArrayList<Habitacio> habitacions) {
        this.habitacions = habitacions;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
