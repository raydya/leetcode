package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class PercentageOfLetterInStringTest {

    @Test
    public void test1() {
        final PercentageOfLetterInString solution = new PercentageOfLetterInString();
        final int output = solution.percentageLetter("foobar", 'o');

        Assert.assertEquals(33, output);
    }

    @Test
    public void test2() {
        final PercentageOfLetterInString solution = new PercentageOfLetterInString();
        final int output = solution.percentageLetter("jjjj", 'k');

        Assert.assertEquals(0, output);
    }
}
