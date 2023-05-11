package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class BinaryStringWithSubstringsRepresenting1ToNTest {

    @Test
    public void test1() {
        final BinaryStringWithSubstringsRepresenting1ToN solution = new BinaryStringWithSubstringsRepresenting1ToN();
        final boolean output = solution.queryString("0110", 3);

        Assert.assertTrue(output);
    }

    @Test
    public void test2() {
        final BinaryStringWithSubstringsRepresenting1ToN solution = new BinaryStringWithSubstringsRepresenting1ToN();
        final boolean output = solution.queryString("0110", 4);

        Assert.assertFalse(output);
    }

    @Test
    public void test3() {
        final BinaryStringWithSubstringsRepresenting1ToN solution = new BinaryStringWithSubstringsRepresenting1ToN();
        final boolean output = solution.queryString("1111000101", 5);

        Assert.assertTrue(output);
    }
}
