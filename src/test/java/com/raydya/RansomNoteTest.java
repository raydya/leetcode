package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class RansomNoteTest {
    @Test
    public void test1() {
        final RansomNote solution = new RansomNote();
        final boolean canConstruct = solution.canConstruct("a", "b");

        Assert.assertFalse(canConstruct);
    }

    @Test
    public void test2() {
        final RansomNote solution = new RansomNote();
        final boolean canConstruct = solution.canConstruct("aa", "ab");

        Assert.assertFalse(canConstruct);
    }

    @Test
    public void test3() {
        final RansomNote solution = new RansomNote();
        final boolean canConstruct = solution.canConstruct("aa", "aab");

        Assert.assertTrue(canConstruct);
    }

    @Test
    public void test4() {
        final RansomNote solution = new RansomNote();
        final boolean canConstruct = solution.canConstruct("aab", "baa");

        Assert.assertTrue(canConstruct);
    }
}
