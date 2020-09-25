package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class RemoveDuplicatesFromSortedArrayTest {

    @Test
    public void test1() {
        int[] input = new int[]{1, 1, 2};

        final RemoveDuplicatesFromSortedArray solution = new RemoveDuplicatesFromSortedArray();
        final int length = solution.removeDuplicates(input);

        Assert.assertEquals(2, length);
    }

    @Test
    public void test2() {
        int[] input = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        final RemoveDuplicatesFromSortedArray solution = new RemoveDuplicatesFromSortedArray();
        final int length = solution.removeDuplicates(input);

        Assert.assertEquals(5, length);
    }
}
