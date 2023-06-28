package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class NumberOfStringsThatAppearAsSubstringsInWordTest {

    @Test
    public void test1() {
        final NumberOfStringsThatAppearAsSubstringsInWord solution = new NumberOfStringsThatAppearAsSubstringsInWord();
        final int output = solution.numOfStrings(new String[]{"a", "abc", "bc", "d"}, "abc");

        Assert.assertEquals(3, output);
    }

    @Test
    public void test2() {
        final NumberOfStringsThatAppearAsSubstringsInWord solution = new NumberOfStringsThatAppearAsSubstringsInWord();
        final int output = solution.numOfStrings(new String[]{"a", "b", "c"}, "aaaaabbbbb");

        Assert.assertEquals(2, output);
    }

    @Test
    public void test3() {
        final NumberOfStringsThatAppearAsSubstringsInWord solution = new NumberOfStringsThatAppearAsSubstringsInWord();
        final int output = solution.numOfStrings(new String[]{"a", "a", "a"}, "ab");

        Assert.assertEquals(3, output);
    }
}
