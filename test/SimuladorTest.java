import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class SimuladorTest {
    
    public SimuladorTest() {
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
    public void testExecutaLongaSimulacao() {
        System.out.println("executaLongaSimulacao");
        Simulador instance = new Simulador();
        instance.executaLongaSimulacao();
        fail("The test case is a prototype.");
    }

    @Test
    public void testSimulacao() {
        System.out.println("simulacao");
        int numEtapas = 0;
        Simulador instance = new Simulador();
        instance.simulacao(numEtapas);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSimulacaoUmaEtapa() {
        System.out.println("simulacaoUmaEtapa");
        Simulador instance = new Simulador();
        instance.simulacaoUmaEtapa();
        fail("The test case is a prototype.");
    }

    @Test
    public void testRedefine() {
        System.out.println("redefine");
        Simulador instance = new Simulador();
        instance.redefine();
        fail("The test case is a prototype.");
    }
    
}
