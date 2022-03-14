package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class SortIntegersByTheNumberOf1BitsTest {

    @Test
    public void test1() {
        final SortIntegersByTheNumberOf1Bits solution = new SortIntegersByTheNumberOf1Bits();
        final int[] output = solution.sortByBits(new int[]{
            0, 1, 2, 3, 4, 5, 6, 7, 8
        });

        Assert.assertArrayEquals(new int[]{
            0, 1, 2, 4, 8, 3, 5, 6, 7
        }, output);
    }

    @Test
    public void test2() {
        final SortIntegersByTheNumberOf1Bits solution = new SortIntegersByTheNumberOf1Bits();
        final int[] output = solution.sortByBits(new int[]{
            1024, 512, 256, 128, 64, 32, 16, 8, 4, 2, 1
        });

        Assert.assertArrayEquals(new int[]{
            1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024
        }, output);
    }

    @Test
    public void test3() {
        final SortIntegersByTheNumberOf1Bits solution = new SortIntegersByTheNumberOf1Bits();
        final int[] output = solution.sortByBits(new int[]{
            10000, 10000
        });

        Assert.assertArrayEquals(new int[]{
            10000, 10000
        }, output);
    }

    @Test
    public void test4() {
        final SortIntegersByTheNumberOf1Bits solution = new SortIntegersByTheNumberOf1Bits();
        final int[] output = solution.sortByBits(new int[]{
            2, 3, 5, 7, 11, 13, 17, 19
        });

        Assert.assertArrayEquals(new int[]{
            2, 3, 5, 17, 7, 11, 13, 19
        }, output);
    }

    @Test
    public void test5() {
        final SortIntegersByTheNumberOf1Bits solution = new SortIntegersByTheNumberOf1Bits();
        final int[] output = solution.sortByBits(new int[]{
            10, 100, 1000, 10000
        });

        Assert.assertArrayEquals(new int[]{
            10, 100, 10000, 1000
        }, output);
    }
}
