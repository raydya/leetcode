package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class AddBinaryTest {

    @Test
    public void test1() {
        final String a = "11";
        final String b = "1";

        final AddBinary solution = new AddBinary();
        final String output = solution.addBinary(a, b);

        Assert.assertEquals("100", output);
    }

    @Test
    public void test2() {
        final String a = "1010";
        final String b = "1011";

        final AddBinary solution = new AddBinary();
        final String output = solution.addBinary(a, b);

        Assert.assertEquals("10101", output);
    }

    @Test
    public void test3() {
        final String a = "0";
        final String b = "0";

        final AddBinary solution = new AddBinary();
        final String output = solution.addBinary(a, b);

        Assert.assertEquals("0", output);
    }

    @Test
    public void test4() {
        final String a = "0";
        final String b = "1";

        final AddBinary solution = new AddBinary();
        final String output = solution.addBinary(a, b);

        Assert.assertEquals("1", output);
    }
}
