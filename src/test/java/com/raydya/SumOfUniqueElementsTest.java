package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class SumOfUniqueElementsTest {

    @Test
    public void test1() {
        final SumOfUniqueElements solution = new SumOfUniqueElements();
        final int output = solution.sumOfUnique(new int[]{1, 2, 3, 2});

        Assert.assertEquals(4, output);
    }

    @Test
    public void test2() {
        final SumOfUniqueElements solution = new SumOfUniqueElements();
        final int output = solution.sumOfUnique(new int[]{1, 1, 1, 1, 1});

        Assert.assertEquals(0, output);
    }

    @Test
    public void test3() {
        final SumOfUniqueElements solution = new SumOfUniqueElements();
        final int output = solution.sumOfUnique(new int[]{1, 2, 3, 4, 5});

        Assert.assertEquals(15, output);
    }
}
