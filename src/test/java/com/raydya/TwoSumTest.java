package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class TwoSumTest {
    @Test
    public void test() {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;

        final TwoSum sum = new TwoSum();
        final int[] indices = sum.twoSum(nums, target);

        Assert.assertArrayEquals(new int[]{0, 1}, indices);
    }
}
