import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class LoboGuaraTest {
    
    public LoboGuaraTest() {
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
    public void testCaca() {
        System.out.println("caca");
        List<LoboGuara> novosLobos = null;
        LoboGuara instance = null;
        instance.caca(novosLobos);
        fail("The test case is a prototype.");
    }

    @Test
    public void testEstaVivo() {
        System.out.println("estaVivo");
        LoboGuara instance = null;
        boolean expResult = false;
        boolean result = instance.estaVivo();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetLocalizacao() {
        System.out.println("getLocalizacao");
        LoboGuara instance = null;
        Localizacao expResult = null;
        Localizacao result = instance.getLocalizacao();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
