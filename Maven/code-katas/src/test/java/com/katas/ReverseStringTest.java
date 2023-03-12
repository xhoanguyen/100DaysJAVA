package com.katas;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReverseStringTest {
    @Test
    public void testSomething() {
        doTest("g)iw{utwc%t_aujt{a}smv_u8x|v@t6iwxclh_z rw/f+gzcc)zy", "yzcczgfwrzhlcxwitvxuvmsatjuatcwtuwig");
        doTest("krishan krishan", "nahsirk nahsirk");
        doTest("Love LOVE", "evol evol");
        doTest("ab23c", "cba");
        doTest("krish21an", "nahsirk");
        doTest("ultr53o?n", "nortlu");


    }
    private void doTest(final String str, final String expected) {
        assertEquals(expected, ReverseString.reverseLetter(str));
    }
    
}
