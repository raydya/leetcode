package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class OddStringDifferenceTest {

    @Test
    public void test1() {
        final OddStringDifference solution = new OddStringDifference();
        final String output = solution.oddString(new String[]{"adc", "wzy", "abc"});

        Assert.assertEquals("abc", output);
    }

    @Test
    public void test2() {
        final OddStringDifference solution = new OddStringDifference();
        final String output = solution.oddString(new String[]{"aaa", "bob", "ccc", "ddd"});

        Assert.assertEquals("bob", output);
    }
}
