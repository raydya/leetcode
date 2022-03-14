package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class LongestSubstringWithAtLeastKRepeatingCharactersTest {

    @Test
    public void test1() {
        final LongestSubstringWithAtLeastKRepeatingCharacters solution = new LongestSubstringWithAtLeastKRepeatingCharacters();
        final int output = solution.longestSubstring("aaabb", 3);

        Assert.assertEquals(3, output);
    }

    @Test
    public void test2() {
        final LongestSubstringWithAtLeastKRepeatingCharacters solution = new LongestSubstringWithAtLeastKRepeatingCharacters();
        final int output = solution.longestSubstring("ababbc", 2);

        Assert.assertEquals(5, output);
    }

    @Test
    public void test3() {
        final LongestSubstringWithAtLeastKRepeatingCharacters solution = new LongestSubstringWithAtLeastKRepeatingCharacters();
        final int output = solution.longestSubstring("weitong", 2);

        Assert.assertEquals(0, output);
    }

    @Test
    public void test4() {
        final LongestSubstringWithAtLeastKRepeatingCharacters solution = new LongestSubstringWithAtLeastKRepeatingCharacters();
        final int output = solution.longestSubstring("a", 1);

        Assert.assertEquals(1, output);
    }

    @Test
    public void test5() {
        final LongestSubstringWithAtLeastKRepeatingCharacters solution = new LongestSubstringWithAtLeastKRepeatingCharacters();
        final int output = solution.longestSubstring("ababacb", 3);

        Assert.assertEquals(0, output);
    }
}
