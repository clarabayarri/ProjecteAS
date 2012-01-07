/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainControllers;

import DomainModel.*;
import Hibernate.HibernateUtil;
import java.util.HashSet;
import java.util.Set;
import org.hibernate.Session;

/**
 * Transacció que insereix dades de prova a l'aplicació
 * @author clara
 */
public class TxInserirDades {
    
    private Session session = null;
    /**
     * Creadora
     */
    public TxInserirDades() {
        
    }
    
    /**
     * Execuxió de la transacció, inserta dades a la BD
     */
    public void executar() {
        try {
            session = HibernateUtil.getSessionFactory().getCurrentSession();
            session.beginTransaction();
            
        } catch (RuntimeException e) {
            session.getTransaction().rollback();
            e.printStackTrace();
        }
        
        if(session != null){
            //insercions
            carregaDades();

            session.getTransaction().commit();
        }
    }
    
    private void carregaDades() {
        carregaBonsHotels();
        carregaPoblacions();
        carregaCategories();
        carregaHotels();
        carregaTipusHabitacions();
        carregaPreuTipusHabitacions();
        carregaHabitacions();
        carregaClients();
        carregaReserves();
        carregaComentaris();
    }
    
    private void carregaBonsHotels() {
        BonsHotels bh = new BonsHotels();
        bh.setId(1);
        bh.setQuotaFixa(0.05F);
        bh.setQuotaVariable(0.07F);
        session.persist(bh);
    }
    
    private void carregaPoblacions() {
        String[] noms = {"Barcelona","Paris","Nova York","Londres"};
        for(String nom : noms){
            Poblacio poblacio = new Poblacio(nom);
            session.persist(poblacio);
        }
    }
    
    private void carregaCategories() {
        String[] noms = {"Primera","Segona","Tercera"};
        for(String nom : noms){
            CategoriaHotel categoria = new CategoriaHotel(nom);
            session.persist(categoria);
        }
    }
    
    private void carregaHotels() {
        String[] nomsNY = {"Palace","Hilton","Metropolitan"};
        String[] nomsBCN = {"Arts","Catalunya","Pensión Pepe"};
        String[] nomsParis = {"Bonjour","Oulala"};
        for(String nom : nomsNY){
            CategoriaHotel categoria = (CategoriaHotel)session.get(CategoriaHotel.class, "Primera");
            Hotel hotel = new Hotel(nom,"Luxe absolut!","Nova York", categoria);
            session.persist(hotel);
        }
        for(String nom : nomsBCN){
            CategoriaHotel categoria = (CategoriaHotel)session.get(CategoriaHotel.class, "Segona");
            Hotel hotel = new Hotel(nom,"Petit i acollidor hotel al centre de la ciutat","Barcelona", categoria);
            session.persist(hotel);
        }
        for(String nom : nomsParis){
            CategoriaHotel categoria = (CategoriaHotel)session.get(CategoriaHotel.class, "Tercera");
            Hotel hotel = new Hotel(nom,"Lloc petitet i rústic","Paris", categoria);
            session.persist(hotel);
        }
    }
    
    private void carregaTipusHabitacions() {
        
    }
    
    private void carregaPreuTipusHabitacions() {
        
    }
    
    private void carregaHabitacions() {
        
    }
    
    private void carregaClients() {
        
    }
    
    private void carregaReserves() {
        
    }
    
    private void carregaComentaris() {
        
    }
}
