package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class SearchInRotatedSortedArrayIITest {

    @Test
    public void test1() {
        final SearchInRotatedSortedArrayII solution = new SearchInRotatedSortedArrayII();
        final boolean output = solution.search(new int[]{2, 5, 6, 0, 0, 1, 2}, 0);

        Assert.assertTrue(output);
    }

    @Test
    public void test2() {
        final SearchInRotatedSortedArrayII solution = new SearchInRotatedSortedArrayII();
        final boolean output = solution.search(new int[]{2, 5, 6, 0, 0, 1, 2}, 3);

        Assert.assertFalse(output);
    }
}
