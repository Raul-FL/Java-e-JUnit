import java.util.List;
import javax.management.RuntimeErrorException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CampoTest {

    public CampoTest() {

    }

    @Test(expected = NegativeArraySizeException.class)
    public void TestaConstrutorCampo() {
        Campo campo = new Campo(-1, 1);
    }

    @Test(expected = RuntimeException.class)
    public void ConstrutorValorReal() {
        Campo campo = new Campo(1.13, 3);
    }

    @Test
    public void ConstrutorPassa() {
        Campo campo = new Campo(2, 2);
    }

    @Test
    public void Construtor0() {
        Campo campo = new Campo(0, 0);
        System.out.println(campo);
    }

    @Test
    public void ConstrutorMax() {
        Campo campo = new Campo(2147483647, 2147483647);
    }

    @Test(expected = RuntimeException.class)
    public void ConstrutorExcede() {
        Campo campo = new Campo(2147483648, 2147483647);
    }

    @Test
    public void ConstrutorMaxZero() {
        Campo campo = new Campo(2147483647, 0);
    }

    @Test
    public void ConstrutorCaractereEsp() {
        Campo campo = new Campo(13, '$');
    }

    @Test
    public void ConstrutorEspaco() {
        Campo campo = new Campo(20, " ");
    }
    
    @Test
    public void ConstrutorCaractereEsp2() {
        Campo campo = new Campo('+', 40);
    }

    @Test
    public void ConstrutorString() {
        Campo campo = new Campo(300, "testeStr");
    }

}
