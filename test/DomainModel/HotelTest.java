package DomainModel;

import Hibernate.HibernateUtil;
import org.hibernate.Session;
import TupleTypes.DadesHotel;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Classe de proves per la classe Hotel
 * @author clara
 */
public class HotelTest {
    
    static Session session = null;
    
    public HotelTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        try {
            session = HibernateUtil.getSessionFactory().getCurrentSession();
            session.beginTransaction();
            CategoriaHotel c = new CategoriaHotel("categoria de prova");
            session.persist(c);
            Poblacio p = new Poblacio("ciutat de prova");
            session.persist(p);
            Hotel h = new Hotel("Hotel Prova","Hotel de luxe en el centre de Manhattan","Nova York",c);
            session.persist(h);
        } catch (RuntimeException e) {
            session.getTransaction().rollback();
            e.printStackTrace();
        }
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        if(session != null){
            CategoriaHotel c = (CategoriaHotel)session.get(CategoriaHotel.class, "categoria de prova");
            session.delete(c);
            Hotel h = (Hotel)session.get(Hotel.class, "Hotel Prova");
            session.delete(h);
            Poblacio p = (Poblacio)session.get(Poblacio.class, "ciutat de prova");
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

    /**
     * Test of obtePreuTotal method, of class Hotel.
     */
    @Test
    public void testObtePreuTotal() {
        System.out.println("obtePreuTotal");
        String tipushab = "";
        Date datainici = null;
        Date dataFi = null;
        Hotel instance = new Hotel();
        
        float expResult = 0.0F;
        float result = instance.obtePreuTotal(tipushab, datainici, dataFi);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of obteNumeroHabLliure method, of class Hotel.
     */
    @Test
    public void testObteNumeroHabLliure() {
        System.out.println("obteNumeroHabLliure");
        String tipushab = "";
        Date datainici = null;
        Date dataFi = null;
        Hotel instance = new Hotel();
        Integer expResult = null;
        Integer result = instance.obteNumeroHabLliure(tipushab, datainici, dataFi);
        assertEquals(expResult, result);
    }

    /**
     * Test of estaDisp method, of class Hotel.
     */
    @Test
    public void testEstaDisp() {
        System.out.println("estaDisp");
        Date dIni = null;
        Date dFi = null;
        Integer numOc = null;
        DadesHotel dh = null;
        Hotel instance = new Hotel();
        boolean expResult = false;
        boolean result = instance.estaDisp(dIni, dFi, numOc, dh);
        assertEquals(expResult, result);
    }

}
