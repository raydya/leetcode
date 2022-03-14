package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class FindComplementTest {

    @Test
    public void test1() {
        final FindComplement solution = new FindComplement();
        final int output = solution.findComplement(5);

        Assert.assertEquals(2, output);
    }

    @Test
    public void test2() {
        final FindComplement solution = new FindComplement();
        final int output = solution.findComplement(1);

        Assert.assertEquals(0, output);
    }

    @Test
    public void test3() {
        final FindComplement solution = new FindComplement();
        final int output = solution.findComplement(3);

        Assert.assertEquals(0, output);
    }
}
