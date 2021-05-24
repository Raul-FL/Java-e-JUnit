import java.util.Random;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class RandomizadorTest {
    
    public RandomizadorTest() {
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
    public void testGetRandom() {
        System.out.println("getRandom");
        Random expResult = null;
        Random result = Randomizador.getRandom();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testReset() {
        System.out.println("reset");
        Randomizador.reset();
        fail("The test case is a prototype.");
    }
    
}
