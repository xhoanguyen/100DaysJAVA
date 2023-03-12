import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MultiplesOf3Or5Test {

    @Test
    public void test() {
        assertEquals(98, new MultiplesOf3Or5().solution(21));
    }

}
