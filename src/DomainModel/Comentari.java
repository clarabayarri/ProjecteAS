/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainModel;

import java.util.Date;

/**
 *
 * @author elena
 */
public class Comentari {
    Integer avaluacio;
    String descripcio;
    Date data;
    
    public Comentari(){};
    
    /**
     * creadora
     * @param aval és el valor de l'avaluació
     * @param desc és el valor que pren la descripció del comentari 
     * @param data és el valor de la data en que es crea el comentari
     * @param h és le nom de l'hotel del qual s'ha fet el comentari
     */
    
    public Comentari(Integer aval, String desc, Date data,Hotel h){
        this.avaluacio = aval;
        this.descripcio = desc;
        this.data = data;
        h.afComentari(this);
    }
    
    
    /**
     * 
     * @return el valor de l'avalució que té l'hotel en aquest comentari
     */
    
    public Integer getAvaluacio(){
        return this.avaluacio;
    }
   
}
