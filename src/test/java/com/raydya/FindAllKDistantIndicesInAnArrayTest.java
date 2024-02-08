package com.raydya;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FindAllKDistantIndicesInAnArrayTest {

    @Test
    public void test1() {
        final FindAllKDistantIndicesInAnArray solution = new FindAllKDistantIndicesInAnArray();
        final List<Integer> output = solution.findKDistantIndices(new int[]{3, 4, 9, 1, 3, 9, 5}, 9, 1);

        Assert.assertArrayEquals(new Integer[]{1, 2, 3, 4, 5, 6}, output.toArray());
    }

    @Test
    public void test2() {
        final FindAllKDistantIndicesInAnArray solution = new FindAllKDistantIndicesInAnArray();
        final List<Integer> output = solution.findKDistantIndices(new int[]{2, 2, 2, 2, 2}, 2, 2);

        Assert.assertArrayEquals(new Integer[]{0, 1, 2, 3, 4}, output.toArray());
    }
}
