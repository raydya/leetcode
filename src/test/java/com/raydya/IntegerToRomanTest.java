package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class IntegerToRomanTest {
    @Test
    public void test1() {
        final IntegerToRoman solution = new IntegerToRoman();
        final String roman = solution.intToRoman(3);

        Assert.assertEquals("III", roman);
    }

    @Test
    public void test2() {
        final IntegerToRoman solution = new IntegerToRoman();
        final String roman = solution.intToRoman(4);

        Assert.assertEquals("IV", roman);
    }

    @Test
    public void test3() {
        final IntegerToRoman solution = new IntegerToRoman();
        final String roman = solution.intToRoman(9);

        Assert.assertEquals("IX", roman);
    }

    @Test
    public void test4() {
        final IntegerToRoman solution = new IntegerToRoman();
        final String roman = solution.intToRoman(58);

        Assert.assertEquals("LVIII", roman);
    }

    @Test
    public void test5() {
        final IntegerToRoman solution = new IntegerToRoman();
        final String roman = solution.intToRoman(1994);

        Assert.assertEquals("MCMXCIV", roman);
    }
}
