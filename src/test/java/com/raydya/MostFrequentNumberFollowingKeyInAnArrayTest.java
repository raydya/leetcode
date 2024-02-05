package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class MostFrequentNumberFollowingKeyInAnArrayTest {

    @Test
    public void test1() {
        final MostFrequentNumberFollowingKeyInAnArray solution = new MostFrequentNumberFollowingKeyInAnArray();
        final int output = solution.mostFrequent(new int[]{1, 100, 200, 1, 100}, 1);

        Assert.assertEquals(100, output);
    }

    @Test
    public void test2() {
        final MostFrequentNumberFollowingKeyInAnArray solution = new MostFrequentNumberFollowingKeyInAnArray();
        final int output = solution.mostFrequent(new int[]{2, 2, 2, 2, 3}, 2);

        Assert.assertEquals(2, output);
    }
}
