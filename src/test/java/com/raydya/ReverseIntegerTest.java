package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class ReverseIntegerTest {

    @Test
    public void test1() {
        int input = 123;

        final ReverseInteger reverseInteger = new ReverseInteger();
        final int output = reverseInteger.reverse(input);

        Assert.assertEquals(321, output);
    }

    @Test
    public void test2() {
        int input = -123;

        final ReverseInteger reverseInteger = new ReverseInteger();
        final int output = reverseInteger.reverse(input);

        Assert.assertEquals(-321, output);
    }

    @Test
    public void test3() {
        int input = 120;

        final ReverseInteger reverseInteger = new ReverseInteger();
        final int output = reverseInteger.reverse(input);

        Assert.assertEquals(21, output);
    }

    @Test
    public void test4() {
        int input = 1534236469;

        final ReverseInteger reverseInteger = new ReverseInteger();
        final int output = reverseInteger.reverse(input);

        Assert.assertEquals(0, output);
    }

    @Test
    public void test5() {
        int input = -2147483648;

        final ReverseInteger reverseInteger = new ReverseInteger();
        final int output = reverseInteger.reverse(input);

        Assert.assertEquals(0, output);
    }
}
