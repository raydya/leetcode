package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class RomanToIntegerTest {

    @Test
    public void test1() {
        String input = "III";

        final RomanToInteger romanToInteger = new RomanToInteger();
        final int output = romanToInteger.romanToInt(input);

        Assert.assertEquals(3, output);
    }

    @Test
    public void test2() {
        String input = "IV";

        final RomanToInteger romanToInteger = new RomanToInteger();
        final int output = romanToInteger.romanToInt(input);

        Assert.assertEquals(4, output);
    }

    @Test
    public void test3() {
        String input = "IX";

        final RomanToInteger romanToInteger = new RomanToInteger();
        final int output = romanToInteger.romanToInt(input);

        Assert.assertEquals(9, output);
    }

    @Test
    public void test4() {
        String input = "LVIII";

        final RomanToInteger romanToInteger = new RomanToInteger();
        final int output = romanToInteger.romanToInt(input);

        Assert.assertEquals(58, output);
    }

    @Test
    public void test5() {
        String input = "MCMXCIV";

        final RomanToInteger romanToInteger = new RomanToInteger();
        final int output = romanToInteger.romanToInt(input);

        Assert.assertEquals(1994, output);
    }
}
