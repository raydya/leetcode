package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class HowManyNumbersAreSmallerThanTheCurrentNumberTest {

    @Test
    public void test1() {
        final HowManyNumbersAreSmallerThanTheCurrentNumber solution = new HowManyNumbersAreSmallerThanTheCurrentNumber();
        final int[] output = solution.smallerNumbersThanCurrent(new int[]{8, 1, 2, 2, 3});

        Assert.assertArrayEquals(new int[]{4, 0, 1, 1, 3}, output);
    }

    @Test
    public void test2() {
        final HowManyNumbersAreSmallerThanTheCurrentNumber solution = new HowManyNumbersAreSmallerThanTheCurrentNumber();
        final int[] output = solution.smallerNumbersThanCurrent(new int[]{6, 5, 4, 8});

        Assert.assertArrayEquals(new int[]{2, 1, 0, 3}, output);
    }

    @Test
    public void test3() {
        final HowManyNumbersAreSmallerThanTheCurrentNumber solution = new HowManyNumbersAreSmallerThanTheCurrentNumber();
        final int[] output = solution.smallerNumbersThanCurrent(new int[]{7, 7, 7, 7});

        Assert.assertArrayEquals(new int[]{0, 0, 0, 0}, output);
    }
}
