package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class AddTwoIntegersTest {

    @Test
    public void test1() {
        final AddTwoIntegers solution = new AddTwoIntegers();
        final int output = solution.sum(12, 5);

        Assert.assertEquals(17, output);
    }

    @Test
    public void test2() {
        final AddTwoIntegers solution = new AddTwoIntegers();
        final int output = solution.sum(-10, 4);

        Assert.assertEquals(-6, output);
    }
}
