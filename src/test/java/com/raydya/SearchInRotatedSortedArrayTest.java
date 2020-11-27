package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class SearchInRotatedSortedArrayTest {
    @Test
    public void test1() {
        final SearchInRotatedSortedArray solution = new SearchInRotatedSortedArray();
        final int index = solution.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0);

        Assert.assertEquals(4, index);
    }

    @Test
    public void test2() {
        final SearchInRotatedSortedArray solution = new SearchInRotatedSortedArray();
        final int index = solution.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 3);

        Assert.assertEquals(-1, index);
    }

    @Test
    public void test3() {
        final SearchInRotatedSortedArray solution = new SearchInRotatedSortedArray();
        final int index = solution.search(new int[]{1}, 0);

        Assert.assertEquals(-1, index);
    }
}
