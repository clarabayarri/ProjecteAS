/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainModel;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author elena_gratallops
 */
public class Hotel {
    String nom;
    String categoria;
    ArrayList<PreuTipusHabitacio> preus;
    ArrayList<Comentari> comentaris;
    CategoriaHotel cat;
    public Integer TEMPS = 24*60*60*1000;
    
    
    public Hotel(String nomH, String Cat){
        this.categoria = Cat;
        this.nom = nomH;
    }
    
    public Integer getNumero() { 
        
    }
    
    public String getNom(){
        return this.nom;
    }
    
    public float obtePreuTotal(String tipushab, Date datainici, Date dataFi){
        int suma = 0;
        for(int i = 0;i < preus.size();++i){
            if(preus.get(i).isOfType(tipushab)) {
                    suma = (int) (suma + preus.get(i).calculaPreu());
            }
        }
        //Integer dies = (dataFi.getTime() - datainici.getTime())/TEMPS; 
        return suma;
    }
    
    public Integer obteNumeroHabLliure(String tipushab, Date datainici, Date dataFi){
        
    }
    
    public void estaDisp(Date dIni, Date dFi,Integer numOc, ) {
        for(int i = 0;i < preus.size();++i){
            preus.get(i).numDisp(dIni,dFi)
        }
    }
    
    
    
    
    
    
}


