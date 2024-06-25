package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class FindSubarraysWithEqualSumTest {

    @Test
    public void test1() {
        final FindSubarraysWithEqualSum solution = new FindSubarraysWithEqualSum();
        final boolean output = solution.findSubarrays(new int[]{4, 2, 4});

        Assert.assertTrue(output);
    }

    @Test
    public void test2() {
        final FindSubarraysWithEqualSum solution = new FindSubarraysWithEqualSum();
        final boolean output = solution.findSubarrays(new int[]{1, 2, 3, 4, 5});

        Assert.assertFalse(output);
    }

    @Test
    public void test3() {
        final FindSubarraysWithEqualSum solution = new FindSubarraysWithEqualSum();
        final boolean output = solution.findSubarrays(new int[]{0, 0, 0});

        Assert.assertTrue(output);
    }
}
