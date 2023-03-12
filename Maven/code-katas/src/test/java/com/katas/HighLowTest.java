package com.katas;

import org.junit.Test;
import static org.junit.Assert.*;

public class HighLowTest {
    @Test
    public void test1() {
        assertEquals("42 -9", HighLow.highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }

    @Test
    public void test2() {
        assertEquals("3 1", HighLow.highAndLow("1 2 3"));
    }
}