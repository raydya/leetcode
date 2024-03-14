package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class LargestElementInAnArrayAfterMergeOperationsTest {

    @Test
    public void test1() {
        final LargestElementInAnArrayAfterMergeOperations solution = new LargestElementInAnArrayAfterMergeOperations();
        final long output = solution.maxArrayValue(new int[]{2, 3, 7, 9, 3});

        Assert.assertEquals(21, output);
    }

    @Test
    public void test2() {
        final LargestElementInAnArrayAfterMergeOperations solution = new LargestElementInAnArrayAfterMergeOperations();
        final long output = solution.maxArrayValue(new int[]{5, 3, 3});

        Assert.assertEquals(11, output);
    }
}
