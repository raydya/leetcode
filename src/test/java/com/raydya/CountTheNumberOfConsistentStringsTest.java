package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class CountTheNumberOfConsistentStringsTest {

    @Test
    public void test1() {
        final CountTheNumberOfConsistentStrings solution = new CountTheNumberOfConsistentStrings();
        final int output = solution.countConsistentStrings(
            "ab",
            new String[]{"ad", "bd", "aaab", "baa", "badab"}
        );

        Assert.assertEquals(2, output);
    }

    @Test
    public void test2() {
        final CountTheNumberOfConsistentStrings solution = new CountTheNumberOfConsistentStrings();
        final int output = solution.countConsistentStrings(
            "abc",
            new String[]{"a", "b", "c", "ab", "ac", "bc", "abc"}
        );

        Assert.assertEquals(7, output);
    }

    @Test
    public void test3() {
        final CountTheNumberOfConsistentStrings solution = new CountTheNumberOfConsistentStrings();
        final int output = solution.countConsistentStrings(
            "cad",
            new String[]{"cc", "acd", "b", "ba", "bac", "bad", "ac", "d"}
        );

        Assert.assertEquals(4, output);
    }
}
