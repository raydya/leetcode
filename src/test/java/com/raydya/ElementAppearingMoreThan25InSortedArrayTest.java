package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class ElementAppearingMoreThan25InSortedArrayTest {
    @Test
    public void test1() {
        final ElementAppearingMoreThan25InSortedArray solution = new ElementAppearingMoreThan25InSortedArray();
        final int output = solution.findSpecialInteger(new int[]{1, 2, 2, 6, 6, 6, 6, 7, 10});

        Assert.assertEquals(6, output);
    }

    @Test
    public void test2() {
        final ElementAppearingMoreThan25InSortedArray solution = new ElementAppearingMoreThan25InSortedArray();
        final int output = solution.findSpecialInteger(new int[]{1, 1});

        Assert.assertEquals(1, output);
    }

    @Test
    public void test3() {
        final ElementAppearingMoreThan25InSortedArray solution = new ElementAppearingMoreThan25InSortedArray();
        final int output = solution.findSpecialInteger(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 12, 12, 12});

        Assert.assertEquals(12, output);
    }

    @Test
    public void test4() {
        final ElementAppearingMoreThan25InSortedArray solution = new ElementAppearingMoreThan25InSortedArray();
        final int output = solution.findSpecialInteger(new int[]{1, 2, 3, 3});

        Assert.assertEquals(3, output);
    }
}
