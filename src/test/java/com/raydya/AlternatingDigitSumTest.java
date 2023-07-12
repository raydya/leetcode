package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class AlternatingDigitSumTest {

    @Test
    public void test1() {
        final AlternatingDigitSum solution = new AlternatingDigitSum();
        final int output = solution.alternateDigitSum(521);

        Assert.assertEquals(4, output);
    }

    @Test
    public void test2() {
        final AlternatingDigitSum solution = new AlternatingDigitSum();
        final int output = solution.alternateDigitSum(111);

        Assert.assertEquals(1, output);
    }

    @Test
    public void test3() {
        final AlternatingDigitSum solution = new AlternatingDigitSum();
        final int output = solution.alternateDigitSum(886996);

        Assert.assertEquals(0, output);
    }
}
