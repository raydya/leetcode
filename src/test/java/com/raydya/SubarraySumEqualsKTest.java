package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class SubarraySumEqualsKTest {

    @Test
    public void test1() {
        final SubarraySumEqualsK solution = new SubarraySumEqualsK();
        final int output = solution.subarraySum(new int[]{1, 1, 1}, 2);

        Assert.assertEquals(2, output);
    }

    @Test
    public void test2() {
        final SubarraySumEqualsK solution = new SubarraySumEqualsK();
        final int output = solution.subarraySum(new int[]{1, 2, 3}, 3);

        Assert.assertEquals(2, output);
    }
}
