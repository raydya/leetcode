package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class DivideArrayIntoEqualPairsTest {

    @Test
    public void test1() {
        final DivideArrayIntoEqualPairs solution = new DivideArrayIntoEqualPairs();
        final boolean output = solution.divideArray(new int[]{3, 2, 3, 2, 2, 2});

        Assert.assertTrue(output);
    }

    @Test
    public void test2() {
        final DivideArrayIntoEqualPairs solution = new DivideArrayIntoEqualPairs();
        final boolean output = solution.divideArray(new int[]{1, 2, 3, 4});

        Assert.assertFalse(output);
    }
}
