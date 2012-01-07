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
        String[] noms = {"Palace","Hilton","Metropolitan","Arts","Catalunya","Pensión Pepe","Bonjour","Oulala"};
        String[] poblacions = {"Nova York","Barcelona","Paris"};
        String[] descripcions = {"Luxe absolut!","Petit i acollidor hotel al centre de la ciutat","Lloc petitet i rústic"};
        CategoriaHotel categoria1 = (CategoriaHotel)session.get(CategoriaHotel.class, "Primera");
        CategoriaHotel categoria2 = (CategoriaHotel)session.get(CategoriaHotel.class, "Segona");
        CategoriaHotel categoria3 = (CategoriaHotel)session.get(CategoriaHotel.class, "Tercera");
        CategoriaHotel[] categories = {categoria1,categoria2,categoria3};
        for(int i = 0; i < noms.length; ++i) {
            Hotel hotel = new Hotel(noms[i],descripcions[i%3],poblacions[i%3],categories[i%3]);
            session.persist(hotel);
        }
    }
    
    private void carregaTipusHabitacions() {
        String[] noms = {"Individual","Doble","Matrimoni"};
        String[] descripcions = {"Habitació amb un llit", "Habitació amb dos llits", "Habitació amb llit doble"};
        for(int i = 0; i < noms.length; ++i){
            TipusHabitacio tipus = new TipusHabitacio(noms[i],i+1,descripcions[i]);
            session.persist(tipus);
        }
    }
    
    private void carregaPreuTipusHabitacions() {
        String[] nomsHotels = {"Palace","Hilton","Metropolitan","Arts","Catalunya","Pensión Pepe","Bonjour","Oulala"};
        String[] nomsTipus = {"Individual","Doble","Matrimoni"};
        float[] preus = {100,200,250};
        for(int i = 0; i < nomsHotels.length; ++i){
            for(int j = 0; j < nomsTipus.length; ++j){
                PreuTipusHabitacio pth = new PreuTipusHabitacio();
                pth.setId(new PreuTipusHabitacioId(nomsHotels[i],nomsTipus[j]));
                pth.setPreu(preus[j]);
                if(j == 0){
                    AbsoluteDiscountPreuStrategy adps = new AbsoluteDiscountPreuStrategy();
                    adps.setId(new PreuTipusHabitacioId(nomsHotels[i],nomsTipus[j]));
                    adps.setDescompte(30);
                    pth.setStrategy(adps);
                    session.persist(pth);
                }
                else {
                    PercentDiscountPreuStrategy pdps = new PercentDiscountPreuStrategy();
                    pdps.setId(new PreuTipusHabitacioId(nomsHotels[i],nomsTipus[j]));
                    pdps.setPerc(0.7F);
                    pth.setStrategy(pdps);
                    session.persist(pth);
                }
            }
        }
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
