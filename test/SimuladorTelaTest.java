import java.awt.Color;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class SimuladorTelaTest {
    
    public SimuladorTelaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testSetCor() {
        System.out.println("setCor");
        Class animalClass = null;
        Color color = null;
        SimuladorTela instance = null;
        instance.setCor(animalClass, color);
        fail("The test case is a prototype.");
    }

    @Test
    public void testMostraStatus() {
        System.out.println("mostraStatus");
        int etapa = 0;
        Campo campo = null;
        SimuladorTela instance = null;
        instance.mostraStatus(etapa, campo);
        fail("The test case is a prototype.");
    }

    @Test
    public void testEhViavel() {
        System.out.println("ehViavel");
        Campo campo = null;
        SimuladorTela instance = null;
        boolean expResult = false;
        boolean result = instance.ehViavel(campo);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
