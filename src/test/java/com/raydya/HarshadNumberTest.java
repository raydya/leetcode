package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class HarshadNumberTest {

    @Test
    public void test1() {
        final HarshadNumber solution = new HarshadNumber();
        final int output = solution.sumOfTheDigitsOfHarshadNumber(18);

        Assert.assertEquals(9, output);
    }

    @Test
    public void test2() {
        final HarshadNumber solution = new HarshadNumber();
        final int output = solution.sumOfTheDigitsOfHarshadNumber(23);

        Assert.assertEquals(-1, output);
    }
}
