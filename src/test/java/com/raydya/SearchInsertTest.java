package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class SearchInsertTest {

    @Test
    public void test1() {
        final SearchInsert solution = new SearchInsert();
        final int index = solution.searchInsert(new int[]{1, 3, 5, 6}, 5);

        Assert.assertEquals(2, index);
    }

    @Test
    public void test2() {
        final SearchInsert solution = new SearchInsert();
        final int index = solution.searchInsert(new int[]{1, 3, 5, 6}, 2);

        Assert.assertEquals(1, index);
    }

    @Test
    public void test3() {
        final SearchInsert solution = new SearchInsert();
        final int index = solution.searchInsert(new int[]{1, 3, 5, 6}, 7);

        Assert.assertEquals(4, index);
    }

    @Test
    public void test4() {
        final SearchInsert solution = new SearchInsert();
        final int index = solution.searchInsert(new int[]{1, 3, 5, 6}, 0);

        Assert.assertEquals(0, index);
    }
}
