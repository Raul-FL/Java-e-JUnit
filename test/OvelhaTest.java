import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class OvelhaTest {
    
    public OvelhaTest() {
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
    public void testCorre() {
        System.out.println("corre");
        List<Ovelha> novasOvelhas = null;
        Ovelha instance = null;
        instance.corre(novasOvelhas);
        fail("The test case is a prototype.");
    }

    @Test
    public void testEstaViva() {
        System.out.println("estaViva");
        Ovelha instance = null;
        boolean expResult = false;
        boolean result = instance.estaViva();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetMorte() {
        System.out.println("setMorte");
        Ovelha instance = null;
        instance.setMorte();
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetLocalizacao() {
        System.out.println("getLocalizacao");
        Ovelha instance = null;
        Localizacao expResult = null;
        Localizacao result = instance.getLocalizacao();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
