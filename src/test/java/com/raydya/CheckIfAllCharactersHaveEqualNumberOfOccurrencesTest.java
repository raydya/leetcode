package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class CheckIfAllCharactersHaveEqualNumberOfOccurrencesTest {

    @Test
    public void test1() {
        final CheckIfAllCharactersHaveEqualNumberOfOccurrences solution = new CheckIfAllCharactersHaveEqualNumberOfOccurrences();
        final boolean output = solution.areOccurrencesEqual("abacbc");

        Assert.assertTrue(output);
    }

    @Test
    public void test2() {
        final CheckIfAllCharactersHaveEqualNumberOfOccurrences solution = new CheckIfAllCharactersHaveEqualNumberOfOccurrences();
        final boolean output = solution.areOccurrencesEqual("aaabb");

        Assert.assertFalse(output);
    }
}
