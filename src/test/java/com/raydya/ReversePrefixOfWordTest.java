package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class ReversePrefixOfWordTest {

    @Test
    public void test1() {
        final ReversePrefixOfWord solution = new ReversePrefixOfWord();
        final String output = solution.reversePrefix("abcdefd", 'd');

        Assert.assertEquals("dcbaefd", output);
    }

    @Test
    public void test2() {
        final ReversePrefixOfWord solution = new ReversePrefixOfWord();
        final String output = solution.reversePrefix("xyxzxe", 'z');

        Assert.assertEquals("zxyxxe", output);
    }

    @Test
    public void test3() {
        final ReversePrefixOfWord solution = new ReversePrefixOfWord();
        final String output = solution.reversePrefix("abcd", 'z');

        Assert.assertEquals("abcd", output);
    }
}
