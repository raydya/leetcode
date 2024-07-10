package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class CountTheNumberOfIncremovableSubarraysITest {

    @Test
    public void test1() {
        final CountTheNumberOfIncremovableSubarraysI solution = new CountTheNumberOfIncremovableSubarraysI();
        final int output = solution.incremovableSubarrayCount(new int[]{1, 2, 3, 4});

        Assert.assertEquals(10, output);
    }

    @Test
    public void test2() {
        final CountTheNumberOfIncremovableSubarraysI solution = new CountTheNumberOfIncremovableSubarraysI();
        final int output = solution.incremovableSubarrayCount(new int[]{6, 5, 7, 8});

        Assert.assertEquals(7, output);
    }

    @Test
    public void test3() {
        final CountTheNumberOfIncremovableSubarraysI solution = new CountTheNumberOfIncremovableSubarraysI();
        final int output = solution.incremovableSubarrayCount(new int[]{8, 7, 6, 6});

        Assert.assertEquals(3, output);
    }
}
