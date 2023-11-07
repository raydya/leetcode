package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class CountTheNumberOfVowelStringsInRangeTest {

    @Test
    public void test1() {
        final CountTheNumberOfVowelStringsInRange solution = new CountTheNumberOfVowelStringsInRange();
        final int output = solution.vowelStrings(new String[]{"are", "amy", "u"}, 0, 2);

        Assert.assertEquals(2, output);
    }

    @Test
    public void test2() {
        final CountTheNumberOfVowelStringsInRange solution = new CountTheNumberOfVowelStringsInRange();
        final int output = solution.vowelStrings(new String[]{"hey", "aeo", "mu", "ooo", "artro"}, 1, 4);

        Assert.assertEquals(3, output);
    }
}
