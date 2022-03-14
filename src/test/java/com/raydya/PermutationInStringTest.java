package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class PermutationInStringTest {

    @Test
    public void test1() {
        final PermutationInString solution = new PermutationInString();
        final boolean output = solution.checkInclusion("ab", "eidbaooo");

        Assert.assertTrue(output);
    }

    @Test
    public void test2() {
        final PermutationInString solution = new PermutationInString();
        final boolean output = solution.checkInclusion("ab", "eidboaoo");

        Assert.assertFalse(output);
    }

    @Test
    public void test3() {
        final PermutationInString solution = new PermutationInString();
        final boolean output = solution.checkInclusion("adc", "dcda");

        Assert.assertTrue(output);
    }
}
