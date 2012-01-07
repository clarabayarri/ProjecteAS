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
    //////////reqerit per l'hibernate
    String nomHotel;
    
    public Comentari(){};
    
    /**
     * creadora
     * @param aval és el valor de l'avaluació
     * @param desc és el valor que pren la descripció del comentari 
     * @param data és el valor de la data en que es crea el comentari
     * @param h és le nom de l'hotel del qual s'ha fet el comentari
     */
    
    public Comentari(Integer aval, String desc, Date data,String h){
        this.avaluacio = aval;
        this.descripcio = desc;
        this.data = data;
        this.nomHotel = h;
    }
    
    /**
     * 
     * @return 
     */
    public Integer getAvaluacio() {
        return avaluacio;
    }
    
    /**
     * 
     * @param avaluacio 
     */

    public void setAvaluacio(Integer avaluacio) {
        this.avaluacio = avaluacio;
    }
    
    /**
     * 
     * @return 
     */

    public Date getData() {
        return data;
    }
    
    /**
     * 
     * @param data 
     */

    public void setData(Date data) {
        this.data = data;
    }
    
    /**
     * 
     * @return 
     */
    
    public String getDescripcio() {
        return descripcio;
    }
    
    /**
     * 
     * @param descripcio 
     */

    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }
    
    /**
     * 
     * @return 
     */

    public String getNomHotel() {
        return nomHotel;
    }
    
    /**
     * 
     * @param nomHotel 
     */

    public void setNomHotel(String nomHotel) {
        this.nomHotel = nomHotel;
    }
    
    
    
    
}
