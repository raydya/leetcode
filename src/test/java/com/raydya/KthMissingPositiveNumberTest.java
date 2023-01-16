package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class KthMissingPositiveNumberTest {

    @Test
    public void test1() {
        final KthMissingPositiveNumber solution = new KthMissingPositiveNumber();
        final int output = solution.findKthPositive(new int[]{2, 3, 4, 7, 11}, 5);

        Assert.assertEquals(9, output);
    }

    @Test
    public void test2() {
        final KthMissingPositiveNumber solution = new KthMissingPositiveNumber();
        final int output = solution.findKthPositive(new int[]{1, 2, 3, 4}, 2);

        Assert.assertEquals(6, output);
    }
}
