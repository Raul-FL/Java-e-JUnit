import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({CampoEstatisticaTest.class, ContadorTest.class, SimuladorTest.class, SimuladorTelaTest.class, RandomizadorTest.class, OvelhaTest.class, mainTest.class, LocalizacaoTest.class, CampoTest.class, LoboGuaraTest.class})
public class RootSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
