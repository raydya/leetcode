package com.raydya;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class BeautifulTowersIITest {

    @Test
    public void test1() {
        final BeautifulTowersII solution = new BeautifulTowersII();
        final long output = solution.maximumSumOfHeights(Arrays.asList(5, 3, 4, 1, 1));

        Assert.assertEquals(13, output);
    }

    @Test
    public void test2() {
        final BeautifulTowersII solution = new BeautifulTowersII();
        final long output = solution.maximumSumOfHeights(Arrays.asList(6, 5, 3, 9, 2, 7));

        Assert.assertEquals(22, output);
    }

    @Test
    public void test3() {
        final BeautifulTowersII solution = new BeautifulTowersII();
        final long output = solution.maximumSumOfHeights(Arrays.asList(3, 2, 5, 5, 2, 3));

        Assert.assertEquals(18, output);
    }

    @Test
    public void test4() {
        final BeautifulTowersII solution = new BeautifulTowersII();
        final long output = solution.maximumSumOfHeights(Arrays.asList(1000000000, 1000000000, 1000000000));

        Assert.assertEquals(3000000000l, output);
    }

    @Test
    public void test5() {
        final BeautifulTowersII solution = new BeautifulTowersII();
        final long output = solution.maximumSumOfHeights(Arrays.asList(3, 5, 3, 5, 1, 5, 4, 4, 4));

        Assert.assertEquals(22, output);
    }

    @Test
    public void test6() {
        final BeautifulTowersII solution = new BeautifulTowersII();
        final long output = solution.maximumSumOfHeights(Arrays.asList(6, 5, 2, 1, 5, 4, 4, 2));

        Assert.assertEquals(19, output);
    }
}
