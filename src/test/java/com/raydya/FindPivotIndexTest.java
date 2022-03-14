package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class FindPivotIndexTest {

    @Test
    public void test1() {
        final FindPivotIndex solution = new FindPivotIndex();
        final int output = solution.pivotIndex(new int[]{1, 7, 3, 6, 5, 6});

        Assert.assertEquals(3, output);
    }

    @Test
    public void test2() {
        final FindPivotIndex solution = new FindPivotIndex();
        final int output = solution.pivotIndex(new int[]{1, 2, 3});

        Assert.assertEquals(-1, output);
    }

    @Test
    public void test3() {
        final FindPivotIndex solution = new FindPivotIndex();
        final int output = solution.pivotIndex(new int[]{2, 1, -1});

        Assert.assertEquals(0, output);
    }
}
