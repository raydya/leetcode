package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class ClumsyFactorialTest {
    @Test
    public void test1() {
        final ClumsyFactorial solution = new ClumsyFactorial();
        final int output = solution.clumsy(4);

        Assert.assertEquals(7, output);
    }

    @Test
    public void test2() {
        final ClumsyFactorial solution = new ClumsyFactorial();
        final int output = solution.clumsy(10);

        Assert.assertEquals(12, output);
    }
}
