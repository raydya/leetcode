package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class LongestSubstringWithoutRepeatingCharactersTest {
    @Test
    public void test1() {
        final String input = "abcabcbb";
        final LongestSubstringWithoutRepeatingCharacters klz = new LongestSubstringWithoutRepeatingCharacters();
        final int length = klz.lengthOfLongestSubstring(input);

        Assert.assertEquals(3, length);
    }

    @Test
    public void test2() {
        final String input = "bbbbb";
        final LongestSubstringWithoutRepeatingCharacters klz = new LongestSubstringWithoutRepeatingCharacters();
        final int length = klz.lengthOfLongestSubstring(input);

        Assert.assertEquals(1, length);
    }

    @Test
    public void test3() {
        final String input = "pwwkew";
        final LongestSubstringWithoutRepeatingCharacters klz = new LongestSubstringWithoutRepeatingCharacters();
        final int length = klz.lengthOfLongestSubstring(input);

        Assert.assertEquals(3, length);
    }

    @Test
    public void test4() {
        final String input = "";
        final LongestSubstringWithoutRepeatingCharacters klz = new LongestSubstringWithoutRepeatingCharacters();
        final int length = klz.lengthOfLongestSubstring(input);

        Assert.assertEquals(0, length);
    }
}
