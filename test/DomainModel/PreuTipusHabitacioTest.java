/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainModel;

import java.util.Date;
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
public class PreuTipusHabitacioTest {
    
    public PreuTipusHabitacioTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getId method, of class PreuTipusHabitacio.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        PreuTipusHabitacio instance = new PreuTipusHabitacio();
        PreuTipusHabitacioId expResult = null;
        PreuTipusHabitacioId result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class PreuTipusHabitacio.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        PreuTipusHabitacioId id = null;
        PreuTipusHabitacio instance = new PreuTipusHabitacio();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPreu method, of class PreuTipusHabitacio.
     */
    @Test
    public void testGetPreu() {
        System.out.println("getPreu");
        PreuTipusHabitacio instance = new PreuTipusHabitacio();
        float expResult = 0.0F;
        float result = instance.getPreu();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPreu method, of class PreuTipusHabitacio.
     */
    @Test
    public void testSetPreu() {
        System.out.println("setPreu");
        float preu = 0.0F;
        PreuTipusHabitacio instance = new PreuTipusHabitacio();
        instance.setPreu(preu);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTipus method, of class PreuTipusHabitacio.
     */
    @Test
    public void testGetTipus() {
        System.out.println("getTipus");
        PreuTipusHabitacio instance = new PreuTipusHabitacio();
        TipusHabitacio expResult = null;
        TipusHabitacio result = instance.getTipus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTipus method, of class PreuTipusHabitacio.
     */
    @Test
    public void testSetTipus() {
        System.out.println("setTipus");
        TipusHabitacio tipus = null;
        PreuTipusHabitacio instance = new PreuTipusHabitacio();
        instance.setTipus(tipus);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStrategy method, of class PreuTipusHabitacio.
     */
    @Test
    public void testGetStrategy() {
        System.out.println("getStrategy");
        PreuTipusHabitacio instance = new PreuTipusHabitacio();
        IPreuStrategy expResult = null;
        IPreuStrategy result = instance.getStrategy();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStrategy method, of class PreuTipusHabitacio.
     */
    @Test
    public void testSetStrategy() {
        System.out.println("setStrategy");
        IPreuStrategy strategy = null;
        PreuTipusHabitacio instance = new PreuTipusHabitacio();
        instance.setStrategy(strategy);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculaPreu method, of class PreuTipusHabitacio.
     */
    @Test
    public void testCalculaPreu() {
        System.out.println("calculaPreu");
        PreuTipusHabitacio instance = new PreuTipusHabitacio();
        float expResult = 0.0F;
        float result = instance.calculaPreu();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isOfType method, of class PreuTipusHabitacio.
     */
    @Test
    public void testIsOfType() {
        System.out.println("isOfType");
        String tipus = "";
        PreuTipusHabitacio instance = new PreuTipusHabitacio();
        boolean expResult = false;
        boolean result = instance.isOfType(tipus);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNomTipus method, of class PreuTipusHabitacio.
     */
    @Test
    public void testGetNomTipus() {
        System.out.println("getNomTipus");
        PreuTipusHabitacio instance = new PreuTipusHabitacio();
        String expResult = "";
        String result = instance.getNomTipus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of numDisp method, of class PreuTipusHabitacio.
     */
    @Test
    public void testNumDisp() {
        System.out.println("numDisp");
        Date dIni = null;
        Date dFi = null;
        String nomHotel = "";
        Integer numOcup = null;
        PreuTipusHabitacio instance = new PreuTipusHabitacio();
        Integer expResult = null;
        Integer result = instance.numDisp(dIni, dFi, nomHotel, numOcup);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obteNumeroHabLliure method, of class PreuTipusHabitacio.
     */
    @Test
    public void testObteNumeroHabLliure() {
        System.out.println("obteNumeroHabLliure");
        String nomHotel = "";
        Date dIni = null;
        Date dFi = null;
        PreuTipusHabitacio instance = new PreuTipusHabitacio();
        Integer expResult = null;
        Integer result = instance.obteNumeroHabLliure(nomHotel, dIni, dFi);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
