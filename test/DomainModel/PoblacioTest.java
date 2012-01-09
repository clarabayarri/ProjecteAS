/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainModel;

import org.hibernate.Session;
import Hibernate.HibernateUtil;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author elena_gratallops
 */
public class PoblacioTest {
    private static Session session;
 
    public PoblacioTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception { 
        //ComentariId id = new ComentariId(nomH, dniC,d);
        try {
            session = HibernateUtil.getSessionFactory().getCurrentSession();
            session.beginTransaction();
            Poblacio pob = new Poblacio("Gratallops");
            
        } catch (RuntimeException e) {
            session.getTransaction().rollback();
            e.printStackTrace();
        }

        
        
        

    }

    @AfterClass
    public static void tearDownClass() throws Exception {        
        if (session != null) {
            Poblacio p = (Poblacio) session.get(Poblacio.class, "Gratallops");
            session.delete(p);
            session.getTransaction().commit();
        }
       
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
        
    }

    @Test
    public void testHibernateFetch() {
        
    }
    
    
    
    @Test
    public void testgetDisponibles() {
        System.out.println("getDisponibles");
        
    
    }
}