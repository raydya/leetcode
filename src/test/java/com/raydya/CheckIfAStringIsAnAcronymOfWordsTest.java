package com.raydya;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class CheckIfAStringIsAnAcronymOfWordsTest {

    @Test
    public void test1() {
        final CheckIfAStringIsAnAcronymOfWords solution = new CheckIfAStringIsAnAcronymOfWords();
        final boolean output = solution.isAcronym(Arrays.asList("alice", "bob", "charlie"), "abc");

        Assert.assertTrue(output);
    }

    @Test
    public void test2() {
        final CheckIfAStringIsAnAcronymOfWords solution = new CheckIfAStringIsAnAcronymOfWords();
        final boolean output = solution.isAcronym(Arrays.asList("an", "apple"), "a");

        Assert.assertFalse(output);
    }

    @Test
    public void test3() {
        final CheckIfAStringIsAnAcronymOfWords solution = new CheckIfAStringIsAnAcronymOfWords();
        final boolean output = solution.isAcronym(Arrays.asList("never", "gonna", "give", "up", "on", "you"), "ngguoy");

        Assert.assertTrue(output);
    }
}
