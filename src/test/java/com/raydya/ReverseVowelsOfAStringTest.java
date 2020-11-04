package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class ReverseVowelsOfAStringTest {

    @Test
    public void test1() {
        final ReverseVowelsOfAString solution = new ReverseVowelsOfAString();
        final String reverseVowels = solution.reverseVowels("hello");

        Assert.assertEquals("holle", reverseVowels);
    }

    @Test
    public void test2() {
        final ReverseVowelsOfAString solution = new ReverseVowelsOfAString();
        final String reverseVowels = solution.reverseVowels("leetcode");

        Assert.assertEquals("leotcede", reverseVowels);
    }
}
