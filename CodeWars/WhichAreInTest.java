import static org.junit.Assert.*;
import org.junit.Test;

public class WhichAreInTest {
    @Test
    public void test1() {
        String a[] = new String[] { "tarp", "mice", "bull" };
        String b[] = new String[] { "lively", "alive", "harp", "sharp", "armstrong" };
        String r[] = new String[] {};
        assertArrayEquals(r, WhichAreIn.inArray(a, b));
    }
}