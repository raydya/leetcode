package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class LargestNumberAtLeastTwiceOfOthersTest {

    @Test
    public void test1() {
        final LargestNumberAtLeastTwiceOfOthers solution = new LargestNumberAtLeastTwiceOfOthers();
        final int output = solution.dominantIndex(new int[]{3, 6, 1, 0});

        Assert.assertEquals(1, output);
    }

    @Test
    public void test2() {
        final LargestNumberAtLeastTwiceOfOthers solution = new LargestNumberAtLeastTwiceOfOthers();
        final int output = solution.dominantIndex(new int[]{1, 2, 3, 4});

        Assert.assertEquals(-1, output);
    }

    @Test
    public void test3() {
        final LargestNumberAtLeastTwiceOfOthers solution = new LargestNumberAtLeastTwiceOfOthers();
        final int output = solution.dominantIndex(new int[]{1});

        Assert.assertEquals(0, output);
    }
}
