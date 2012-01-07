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
import static org.junit.Assert.*;

/**
 *
 * @author clara
 */
public class AbsoluteDiscountPreuStrategyTest {
    
    private static Session session = null;
    
    public AbsoluteDiscountPreuStrategyTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        /*try {
            session = HibernateUtil.getSessionFactory().getCurrentSession();
            session.beginTransaction();
        } catch (RuntimeException e) {
            session.getTransaction().rollback();
            e.printStackTrace();
        }

        AbsoluteDiscountPreuStrategy adps = new AbsoluteDiscountPreuStrategy(50);
        session.persist(adps);*/
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        /*AbsoluteDiscountPreuStrategy adps = (AbsoluteDiscountPreuStrategy) 
                session.get(AbsoluteDiscountPreuStrategy.class, 
                new PreuTipusHabitacioId());
        
        if (session != null) {
            session.delete(adps);
            session.getTransaction().commit();
        }*/
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calculaPreu method, of class AbsoluteDiscountPreuStrategy.
     */
    @Test
    public void testCalculaPreu() {
        System.out.println("calculaPreu");
        PreuTipusHabitacio p = new PreuTipusHabitacio();
        p.setPreu(100);
        AbsoluteDiscountPreuStrategy instance = new AbsoluteDiscountPreuStrategy();
        instance.setDescompte(50);
        float expResult = 50;
        float result = instance.calculaPreu(p);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testHibernateFetch() {
        /*Client c = (Client) session.get(Client.class, "5");
        String prova  = c.getCognoms();
        assertEquals(prova, "cognoms");*/
    }
}
