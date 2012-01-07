/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainModel;

import Hibernate.HibernateUtil;
import org.hibernate.Session;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author elena_gratallops
 */
public class CategoriaHotelTest {
   static Session session = null;
    
    public CategoriaHotelTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {        
        try {
            session = HibernateUtil.getSessionFactory().getCurrentSession();
            session.beginTransaction();
        } catch (RuntimeException e) {
            session.getTransaction().rollback();
            e.printStackTrace();
        }

        CategoriaHotel cat = new CategoriaHotel("tres estrelles");
        session.persist(cat);
        
        

    }

    @AfterClass
    public static void tearDownClass() throws Exception {        
        if (session != null) {
            CategoriaHotel cat = (CategoriaHotel) session.get(CategoriaHotel.class, "tres estrelles");
            session.delete(cat);
            session.getTransaction().commit();
        }
        
        
        //session.flush();
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
        
    }

    @Test
    public void testHibernateFetch() {
        CategoriaHotel cat = (CategoriaHotel) session.get(CategoriaHotel.class, "tres estrelles");
        String prova  = cat.nom;
        //assertEquals(prova, "tres estrelles");
    }

  
}

