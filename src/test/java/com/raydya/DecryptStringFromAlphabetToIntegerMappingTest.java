package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class DecryptStringFromAlphabetToIntegerMappingTest {
    @Test
    public void test1() {
        final DecryptStringFromAlphabetToIntegerMapping solution = new DecryptStringFromAlphabetToIntegerMapping();
        final String output = solution.freqAlphabets("10#11#12");

        Assert.assertEquals("jkab", output);
    }

    @Test
    public void test2() {
        final DecryptStringFromAlphabetToIntegerMapping solution = new DecryptStringFromAlphabetToIntegerMapping();
        final String output = solution.freqAlphabets("1326#");

        Assert.assertEquals("acz", output);
    }

    @Test
    public void test3() {
        final DecryptStringFromAlphabetToIntegerMapping solution = new DecryptStringFromAlphabetToIntegerMapping();
        final String output = solution.freqAlphabets("25#");

        Assert.assertEquals("y", output);
    }

    @Test
    public void test4() {
        final DecryptStringFromAlphabetToIntegerMapping solution = new DecryptStringFromAlphabetToIntegerMapping();
        final String output = solution.freqAlphabets("12345678910#11#12#13#14#15#16#17#18#19#20#21#22#23#24#25#26#");

        Assert.assertEquals("abcdefghijklmnopqrstuvwxyz", output);
    }
}
