package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class RemoveDuplicatesFromSortedArrayIITest {

    @Test
    public void test1() {
        final RemoveDuplicatesFromSortedArrayII solution = new RemoveDuplicatesFromSortedArrayII();
        final int output = solution.removeDuplicates(new int[]{1, 1, 1, 2, 2, 3});

        Assert.assertEquals(5, output);
    }

    @Test
    public void test2() {
        final RemoveDuplicatesFromSortedArrayII solution = new RemoveDuplicatesFromSortedArrayII();
        final int output = solution.removeDuplicates(new int[]{0, 0, 1, 1, 1, 1, 2, 3, 3});

        Assert.assertEquals(7, output);
    }

    @Test
    public void test3() {
        final RemoveDuplicatesFromSortedArrayII solution = new RemoveDuplicatesFromSortedArrayII();
        final int output = solution.removeDuplicates(new int[]{1, 1, 1});

        Assert.assertEquals(2, output);
    }

    @Test
    public void test4() {
        final int[] input = {0, 0, 1, 1, 1, 1, 2, 3, 3};
        final RemoveDuplicatesFromSortedArrayII solution = new RemoveDuplicatesFromSortedArrayII();
        final int output = solution.removeDuplicates(input);

        Assert.assertEquals(7, output);
    }
}
