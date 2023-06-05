package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class ApplyOperationsToAnArrayTest {

    @Test
    public void test1() {
        final ApplyOperationsToAnArray solution = new ApplyOperationsToAnArray();
        final int[] output = solution.applyOperations(new int[]{1, 2, 2, 1, 1, 0});

        Assert.assertArrayEquals(new int[]{1, 4, 2, 0, 0, 0}, output);
    }


    @Test
    public void test2() {
        final ApplyOperationsToAnArray solution = new ApplyOperationsToAnArray();
        final int[] output = solution.applyOperations(new int[]{0, 1});

        Assert.assertArrayEquals(new int[]{1, 0}, output);
    }
}
