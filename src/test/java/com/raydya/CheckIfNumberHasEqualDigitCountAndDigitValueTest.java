package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class CheckIfNumberHasEqualDigitCountAndDigitValueTest {

    @Test
    public void test1() {
        final CheckIfNumberHasEqualDigitCountAndDigitValue solution = new CheckIfNumberHasEqualDigitCountAndDigitValue();
        final boolean output = solution.digitCount("1210");

        Assert.assertTrue(output);
    }

    @Test
    public void test2() {
        final CheckIfNumberHasEqualDigitCountAndDigitValue solution = new CheckIfNumberHasEqualDigitCountAndDigitValue();
        final boolean output = solution.digitCount("030");

        Assert.assertFalse(output);
    }

}
