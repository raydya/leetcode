package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class CountDistinctNumbersOnBoardTest {

    @Test
    public void test1() {
        final CountDistinctNumbersOnBoard solution = new CountDistinctNumbersOnBoard();
        final int output = solution.distinctIntegers(5);

        Assert.assertEquals(4, output);
    }

    @Test
    public void test2() {
        final CountDistinctNumbersOnBoard solution = new CountDistinctNumbersOnBoard();
        final int output = solution.distinctIntegers(3);

        Assert.assertEquals(2, output);
    }
}
