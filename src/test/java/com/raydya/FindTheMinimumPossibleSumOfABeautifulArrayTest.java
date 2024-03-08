package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class FindTheMinimumPossibleSumOfABeautifulArrayTest {

    @Test
    public void test1() {
        final FindTheMinimumPossibleSumOfABeautifulArray solution = new FindTheMinimumPossibleSumOfABeautifulArray();
        final int output = solution.minimumPossibleSum(2, 3);

        Assert.assertEquals(4, output);
    }

    @Test
    public void test2() {
        final FindTheMinimumPossibleSumOfABeautifulArray solution = new FindTheMinimumPossibleSumOfABeautifulArray();
        final int output = solution.minimumPossibleSum(3, 3);

        Assert.assertEquals(8, output);
    }

    @Test
    public void test3() {
        final FindTheMinimumPossibleSumOfABeautifulArray solution = new FindTheMinimumPossibleSumOfABeautifulArray();
        final int output = solution.minimumPossibleSum(1, 1);

        Assert.assertEquals(1, output);
    }

    @Test
    public void test4() {
        final FindTheMinimumPossibleSumOfABeautifulArray solution = new FindTheMinimumPossibleSumOfABeautifulArray();
        final int output = solution.minimumPossibleSum(39636, 49035);

        Assert.assertEquals(156198582, output);
    }

    @Test
    public void test5() {
        final FindTheMinimumPossibleSumOfABeautifulArray solution = new FindTheMinimumPossibleSumOfABeautifulArray();
        final int output = solution.minimumPossibleSum(1000000000, 1000000000);

        Assert.assertEquals(750000042, output);
    }

    @Test
    public void test6() {
        final FindTheMinimumPossibleSumOfABeautifulArray solution = new FindTheMinimumPossibleSumOfABeautifulArray();
        final int output = solution.minimumPossibleSum(13, 50);

        Assert.assertEquals(91, output);
    }
}
