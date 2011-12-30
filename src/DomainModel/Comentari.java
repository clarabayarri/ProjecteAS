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
public class Comentari {
    Integer avaluacio;
    String descripcio;
    Date data;
    
    public Comentari(Integer aval, String desc, Date data){
        this.avaluacio = aval;
        this.descripcio = desc;
        this.data = data;
    }
    
    public Integer getAvaluacio(){
        return this.avaluacio;
    }
   
}
