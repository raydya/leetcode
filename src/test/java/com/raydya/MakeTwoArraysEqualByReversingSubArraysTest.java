package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class MakeTwoArraysEqualByReversingSubArraysTest {

    @Test
    public void test1() {
        final MakeTwoArraysEqualByReversingSubArrays solution = new MakeTwoArraysEqualByReversingSubArrays();
        final boolean output = solution.canBeEqual(new int[]{1, 2, 3, 4}, new int[]{2, 4, 1, 3});

        Assert.assertTrue(output);
    }

    @Test
    public void test2() {
        final MakeTwoArraysEqualByReversingSubArrays solution = new MakeTwoArraysEqualByReversingSubArrays();
        final boolean output = solution.canBeEqual(new int[]{7}, new int[]{7});

        Assert.assertTrue(output);
    }

    @Test
    public void test3() {
        final MakeTwoArraysEqualByReversingSubArrays solution = new MakeTwoArraysEqualByReversingSubArrays();
        final boolean output = solution.canBeEqual(new int[]{3, 7, 9}, new int[]{3, 7, 11});

        Assert.assertFalse(output);
    }

}
