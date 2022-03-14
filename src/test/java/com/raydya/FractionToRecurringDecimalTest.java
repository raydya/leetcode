package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class FractionToRecurringDecimalTest {

    @Test
    public void test1() {
        final FractionToRecurringDecimal solution = new FractionToRecurringDecimal();
        final String output = solution.fractionToDecimal(1, 2);

        Assert.assertEquals("0.5", output);
    }

    @Test
    public void test2() {
        final FractionToRecurringDecimal solution = new FractionToRecurringDecimal();
        final String output = solution.fractionToDecimal(2, 1);

        Assert.assertEquals("2", output);
    }

    @Test
    public void test3() {
        final FractionToRecurringDecimal solution = new FractionToRecurringDecimal();
        final String output = solution.fractionToDecimal(2, 3);

        Assert.assertEquals("0.(6)", output);
    }

    @Test
    public void test4() {
        final FractionToRecurringDecimal solution = new FractionToRecurringDecimal();
        final String output = solution.fractionToDecimal(4, 333);

        Assert.assertEquals("0.(012)", output);
    }

    @Test
    public void test5() {
        final FractionToRecurringDecimal solution = new FractionToRecurringDecimal();
        final String output = solution.fractionToDecimal(1, 5);

        Assert.assertEquals("0.2", output);
    }
}
