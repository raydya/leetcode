package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class ANumberAfterADoubleReversalTest {

    @Test
    public void test1() {
        final ANumberAfterADoubleReversal solution = new ANumberAfterADoubleReversal();
        final boolean output = solution.isSameAfterReversals(526);

        Assert.assertTrue(output);
    }

    @Test
    public void test2() {
        final ANumberAfterADoubleReversal solution = new ANumberAfterADoubleReversal();
        final boolean output = solution.isSameAfterReversals(1800);

        Assert.assertFalse(output);
    }

    @Test
    public void test3() {
        final ANumberAfterADoubleReversal solution = new ANumberAfterADoubleReversal();
        final boolean output = solution.isSameAfterReversals(0);

        Assert.assertTrue(output);
    }
}
