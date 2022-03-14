package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class BinarySearchTest {

    @Test
    public void test1() {
        final BinarySearch solution = new BinarySearch();
        final int output = solution.search(new int[]{-1, 0, 3, 5, 9, 12}, 9);

        Assert.assertEquals(4, output);
    }

    @Test
    public void test2() {
        final BinarySearch solution = new BinarySearch();
        final int output = solution.search(new int[]{-1, 0, 3, 5, 9, 12}, 2);

        Assert.assertEquals(-1, output);
    }

    @Test
    public void test3() {
        final BinarySearch solution = new BinarySearch();
        final int output = solution.search(new int[]{5}, 5);

        Assert.assertEquals(0, output);
    }

    @Test
    public void test4() {
        final BinarySearch solution = new BinarySearch();
        final int output = solution.search(new int[]{5}, -5);

        Assert.assertEquals(-1, output);
    }

    @Test
    public void test5() {
        final BinarySearch solution = new BinarySearch();
        final int output = solution.search(new int[]{2, 5}, 5);

        Assert.assertEquals(1, output);
    }
}
