package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class TupleWithSameProductTest {

    @Test
    public void test1() {
        final TupleWithSameProduct solution = new TupleWithSameProduct();
        final int output = solution.tupleSameProduct(new int[]{2, 3, 4, 6});

        Assert.assertEquals(8, output);
    }

    @Test
    public void test2() {
        final TupleWithSameProduct solution = new TupleWithSameProduct();
        final int output = solution.tupleSameProduct(new int[]{1, 2, 4, 5, 10});

        Assert.assertEquals(16, output);
    }

    @Test
    public void test3() {
        final TupleWithSameProduct solution = new TupleWithSameProduct();
        final int output = solution.tupleSameProduct(new int[]{2, 3, 4, 6, 8, 12});

        Assert.assertEquals(40, output);
    }
}
