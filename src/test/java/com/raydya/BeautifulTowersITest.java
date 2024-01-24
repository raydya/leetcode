package com.raydya;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class BeautifulTowersITest {

    @Test
    public void test1() {
        final BeautifulTowersI solution = new BeautifulTowersI();
        final long output = solution.maximumSumOfHeights(Arrays.asList(5, 3, 4, 1, 1));

        Assert.assertEquals(13, output);
    }

    @Test
    public void test2() {
        final BeautifulTowersI solution = new BeautifulTowersI();
        final long output = solution.maximumSumOfHeights(Arrays.asList(6, 5, 3, 9, 2, 7));

        Assert.assertEquals(22, output);
    }

    @Test
    public void test3() {
        final BeautifulTowersI solution = new BeautifulTowersI();
        final long output = solution.maximumSumOfHeights(Arrays.asList(3, 2, 5, 5, 2, 3));

        Assert.assertEquals(18, output);
    }
}
