package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class BuddyStringsTest {

    @Test
    public void test1() {
        final BuddyStrings solution = new BuddyStrings();
        final boolean output = solution.buddyStrings("ab", "ba");

        Assert.assertTrue(output);
    }

    @Test
    public void test2() {
        final BuddyStrings solution = new BuddyStrings();
        final boolean output = solution.buddyStrings("ab", "ab");

        Assert.assertFalse(output);
    }

    @Test
    public void test3() {
        final BuddyStrings solution = new BuddyStrings();
        final boolean output = solution.buddyStrings("aa", "aa");

        Assert.assertTrue(output);
    }

    @Test
    public void test4() {
        final BuddyStrings solution = new BuddyStrings();
        final boolean output = solution.buddyStrings("aaaaaaabc", "aaaaaaacb");

        Assert.assertTrue(output);
    }

    @Test
    public void test5() {
        final BuddyStrings solution = new BuddyStrings();
        final boolean output = solution.buddyStrings("", "aa");

        Assert.assertFalse(output);
    }

    @Test
    public void test6() {
        final BuddyStrings solution = new BuddyStrings();
        final boolean output = solution.buddyStrings("abcaa", "abcbb");

        Assert.assertFalse(output);
    }
}
