import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ContadorTest {
    
    public ContadorTest() {
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
    public void testGetName() {
        System.out.println("getName");
        Contador instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetCount() {
        System.out.println("getCount");
        Contador instance = null;
        int expResult = 0;
        int result = instance.getCount();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testIncrement() {
        System.out.println("increment");
        Contador instance = null;
        instance.increment();
        fail("The test case is a prototype.");
    }

    @Test
    public void testReset() {
        System.out.println("reset");
        Contador instance = null;
        instance.reset();
        fail("The test case is a prototype.");
    }
    
}
