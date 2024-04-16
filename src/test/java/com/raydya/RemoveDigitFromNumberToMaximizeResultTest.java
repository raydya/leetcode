package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class RemoveDigitFromNumberToMaximizeResultTest {

    @Test
    public void test1() {
        final RemoveDigitFromNumberToMaximizeResult solution = new RemoveDigitFromNumberToMaximizeResult();
        final String output = solution.removeDigit("123", '3');

        Assert.assertEquals("12", output);
    }

    @Test
    public void test2() {
        final RemoveDigitFromNumberToMaximizeResult solution = new RemoveDigitFromNumberToMaximizeResult();
        final String output = solution.removeDigit("1231", '1');

        Assert.assertEquals("231", output);
    }

    @Test
    public void test3() {
        final RemoveDigitFromNumberToMaximizeResult solution = new RemoveDigitFromNumberToMaximizeResult();
        final String output = solution.removeDigit("551", '5');

        Assert.assertEquals("51", output);
    }

    @Test
    public void test4() {
        final RemoveDigitFromNumberToMaximizeResult solution = new RemoveDigitFromNumberToMaximizeResult();
        final String output = solution.removeDigit("133235", '3');

        Assert.assertEquals("13325", output);
    }
}
