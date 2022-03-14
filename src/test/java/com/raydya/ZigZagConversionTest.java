package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class ZigZagConversionTest {

    @Test
    public void test1() {
        final ZigZagConversion solution = new ZigZagConversion();
        final String s = solution.convert("PAYPALISHIRING", 3);

        Assert.assertEquals("PAHNAPLSIIGYIR", s);
    }

    @Test
    public void test2() {
        final ZigZagConversion solution = new ZigZagConversion();
        final String s = solution.convert("PAYPALISHIRING", 4);

        Assert.assertEquals("PINALSIGYAHRPI", s);
    }

    @Test
    public void test3() {
        final ZigZagConversion solution = new ZigZagConversion();
        final String s = solution.convert("A", 1);

        Assert.assertEquals("A", s);
    }
}
