package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class IsomorphicStringsTest {

    @Test
    public void test1() {
        final IsomorphicStrings solution = new IsomorphicStrings();
        final boolean isomorphic = solution.isIsomorphic("egg", "add");

        Assert.assertTrue(isomorphic);
    }

    @Test
    public void test2() {
        final IsomorphicStrings solution = new IsomorphicStrings();
        final boolean isomorphic = solution.isIsomorphic("foo", "bar");

        Assert.assertFalse(isomorphic);
    }

    @Test
    public void test3() {
        final IsomorphicStrings solution = new IsomorphicStrings();
        final boolean isomorphic = solution.isIsomorphic("paper", "title");

        Assert.assertTrue(isomorphic);
    }

    @Test
    public void test4() {
        final IsomorphicStrings solution = new IsomorphicStrings();
        final boolean isomorphic = solution.isIsomorphic("ab", "aa");

        Assert.assertFalse(isomorphic);
    }
}
