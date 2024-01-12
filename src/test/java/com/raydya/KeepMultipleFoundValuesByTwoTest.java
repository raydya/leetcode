package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class KeepMultipleFoundValuesByTwoTest {

    @Test
    public void test1() {
        final KeepMultipleFoundValuesByTwo solution = new KeepMultipleFoundValuesByTwo();
        final int output = solution.findFinalValue(new int[]{5, 3, 6, 1, 12}, 3);

        Assert.assertEquals(24, output);
    }

    @Test
    public void test2() {
        final KeepMultipleFoundValuesByTwo solution = new KeepMultipleFoundValuesByTwo();
        final int output = solution.findFinalValue(new int[]{2, 7, 9}, 4);

        Assert.assertEquals(4, output);
    }

    @Test
    public void test3() {
        final KeepMultipleFoundValuesByTwo solution = new KeepMultipleFoundValuesByTwo();
        final int output = solution.findFinalValue(new int[]{8, 19, 4, 2, 15, 3}, 2);

        Assert.assertEquals(16, output);
    }
}
