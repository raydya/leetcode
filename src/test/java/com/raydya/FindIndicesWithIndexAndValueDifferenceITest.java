package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class FindIndicesWithIndexAndValueDifferenceITest {

    @Test
    public void test1() {
        final FindIndicesWithIndexAndValueDifferenceI solution = new FindIndicesWithIndexAndValueDifferenceI();
        final int[] output = solution.findIndices(
            new int[]{5, 1, 4, 1}, 2, 4
        );

        Assert.assertArrayEquals(new int[]{0, 3}, output);
    }

    @Test
    public void test2() {
        final FindIndicesWithIndexAndValueDifferenceI solution = new FindIndicesWithIndexAndValueDifferenceI();
        final int[] output = solution.findIndices(
            new int[]{2, 1}, 0, 0
        );

        Assert.assertArrayEquals(new int[]{0, 0}, output);
    }

    @Test
    public void test3() {
        final FindIndicesWithIndexAndValueDifferenceI solution = new FindIndicesWithIndexAndValueDifferenceI();
        final int[] output = solution.findIndices(
            new int[]{1, 2, 3}, 2, 4
        );

        Assert.assertArrayEquals(new int[]{-1, -1}, output);
    }
}
