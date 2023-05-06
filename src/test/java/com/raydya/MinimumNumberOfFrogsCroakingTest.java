package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class MinimumNumberOfFrogsCroakingTest {

    @Test
    public void test1() {
        final MinimumNumberOfFrogsCroaking solution = new MinimumNumberOfFrogsCroaking();
        final int output = solution.minNumberOfFrogs("croakcroak");

        Assert.assertEquals(1, output);
    }

    @Test
    public void test2() {
        final MinimumNumberOfFrogsCroaking solution = new MinimumNumberOfFrogsCroaking();
        final int output = solution.minNumberOfFrogs("crcoakroak");

        Assert.assertEquals(2, output);
    }

    @Test
    public void test3() {
        final MinimumNumberOfFrogsCroaking solution = new MinimumNumberOfFrogsCroaking();
        final int output = solution.minNumberOfFrogs("croakcrook");

        Assert.assertEquals(-1, output);
    }

    @Test
    public void test4() {
        final MinimumNumberOfFrogsCroaking solution = new MinimumNumberOfFrogsCroaking();
        final int output = solution.minNumberOfFrogs("aoocrrackk");

        Assert.assertEquals(-1, output);
    }

    @Test
    public void test5() {
        final MinimumNumberOfFrogsCroaking solution = new MinimumNumberOfFrogsCroaking();
        final int output = solution.minNumberOfFrogs("croakcroa");

        Assert.assertEquals(-1, output);
    }

    @Test
    public void test6() {
        final MinimumNumberOfFrogsCroaking solution = new MinimumNumberOfFrogsCroaking();
        final int output = solution.minNumberOfFrogs("crocakcroraoakk");

        Assert.assertEquals(2, output);
    }
}
