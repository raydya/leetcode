package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class NumberOfBeautifulPairsTest {

    @Test
    public void test1() {
        final NumberOfBeautifulPairs solution = new NumberOfBeautifulPairs();
        final int output = solution.countBeautifulPairs(new int[]{2, 5, 1, 4});

        Assert.assertEquals(5, output);
    }

    @Test
    public void test2() {
        final NumberOfBeautifulPairs solution = new NumberOfBeautifulPairs();
        final int output = solution.countBeautifulPairs(new int[]{11, 21, 12});

        Assert.assertEquals(2, output);
    }

    @Test
    public void test3() {
        final NumberOfBeautifulPairs solution = new NumberOfBeautifulPairs();
        final int output = solution.countBeautifulPairs(new int[]{1799, 259, 1453, 374, 1854, 2212, 2104, 2221});

        Assert.assertEquals(23, output);
    }
}
