package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class ValidAnagramTest {

    @Test
    public void test1() {
        final ValidAnagram solution = new ValidAnagram();
        final boolean anagram = solution.isAnagram("anagram", "nagaram");

        Assert.assertTrue(anagram);
    }

    @Test
    public void test2() {
        final ValidAnagram solution = new ValidAnagram();
        final boolean anagram = solution.isAnagram("rat", "car");

        Assert.assertFalse(anagram);
    }
}
