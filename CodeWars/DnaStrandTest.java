import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DnaStrandTest {
    @Test
    public void test01() {
        assertEquals("TTTT", DnaStrand.makeComplement("AAAA"));
    }

    @Test
    public void test02() {
        assertEquals("TAACG", DnaStrand.makeComplement("ATTGC"));
    }
}