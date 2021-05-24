import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CampoEstatisticaTest {
    
    public CampoEstatisticaTest() {
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
    public void testGetPopulationDetails() {
        System.out.println("getPopulationDetails");
        Campo campo = null;
        CampoEstatistica instance = new CampoEstatistica();
        String expResult = "";
        String result = instance.getPopulationDetails(campo);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testRedefine() {
        System.out.println("redefine");
        CampoEstatistica instance = new CampoEstatistica();
        instance.redefine();
        fail("The test case is a prototype.");
    }

    @Test
    public void testIncrementaContador() {
        System.out.println("incrementaContador");
        Class animalClass = null;
        CampoEstatistica instance = new CampoEstatistica();
        instance.incrementaContador(animalClass);
        fail("The test case is a prototype.");
    }

    @Test
    public void testContadorFinalizado() {
        System.out.println("contadorFinalizado");
        CampoEstatistica instance = new CampoEstatistica();
        instance.contadorFinalizado();
        fail("The test case is a prototype.");
    }

    @Test
    public void testEhViavel() {
        System.out.println("ehViavel");
        Campo campo = null;
        CampoEstatistica instance = new CampoEstatistica();
        boolean expResult = false;
        boolean result = instance.ehViavel(campo);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
