package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class CountTheDigitsThatDivideANumberTest {

    @Test
    public void test1() {
        final CountTheDigitsThatDivideANumber solution = new CountTheDigitsThatDivideANumber();
        final int output = solution.countDigits(7);

        Assert.assertEquals(1, output);
    }

    @Test
    public void test2() {
        final CountTheDigitsThatDivideANumber solution = new CountTheDigitsThatDivideANumber();
        final int output = solution.countDigits(121);

        Assert.assertEquals(2, output);
    }

    @Test
    public void test3() {
        final CountTheDigitsThatDivideANumber solution = new CountTheDigitsThatDivideANumber();
        final int output = solution.countDigits(1248);

        Assert.assertEquals(4, output);
    }
}
