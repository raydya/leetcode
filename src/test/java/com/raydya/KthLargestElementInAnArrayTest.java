package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class KthLargestElementInAnArrayTest {
    @Test
    public void test1() {
        final KthLargestElementInAnArray solution = new KthLargestElementInAnArray();
        final int output = solution.findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2);

        Assert.assertEquals(5, output);
    }

    @Test
    public void test2() {
        final KthLargestElementInAnArray solution = new KthLargestElementInAnArray();
        final int output = solution.findKthLargest(new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 4);

        Assert.assertEquals(4, output);
    }
}
