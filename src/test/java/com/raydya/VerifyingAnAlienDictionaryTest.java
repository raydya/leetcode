package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class VerifyingAnAlienDictionaryTest {
    @Test
    public void test1() {
        final VerifyingAnAlienDictionary solution = new VerifyingAnAlienDictionary();
        final boolean output = solution.isAlienSorted(new String[]{"hello", "leetcode"}, "hlabcdefgijkmnopqrstuvwxyz");

        Assert.assertTrue(output);
    }

    @Test
    public void test2() {
        final VerifyingAnAlienDictionary solution = new VerifyingAnAlienDictionary();
        final boolean output = solution.isAlienSorted(new String[]{"word", "world", "row"}, "worldabcefghijkmnpqstuvxyz");

        Assert.assertFalse(output);
    }

    @Test
    public void test3() {
        final VerifyingAnAlienDictionary solution = new VerifyingAnAlienDictionary();
        final boolean output = solution.isAlienSorted(new String[]{"apple", "app"}, "abcdefghijklmnopqrstuvwxyz");

        Assert.assertFalse(output);
    }
}
