package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class SimplifyPathTest {

    @Test
    public void test1() {
        final SimplifyPath solution = new SimplifyPath();
        final String simplifyPath = solution.simplifyPath("/home/");

        Assert.assertEquals("/home", simplifyPath);
    }

    @Test
    public void test2() {
        final SimplifyPath solution = new SimplifyPath();
        final String simplifyPath = solution.simplifyPath("/../");

        Assert.assertEquals("/", simplifyPath);
    }

    @Test
    public void test3() {
        final SimplifyPath solution = new SimplifyPath();
        final String simplifyPath = solution.simplifyPath("/home//foo/");

        Assert.assertEquals("/home/foo", simplifyPath);
    }

    @Test
    public void test4() {
        final SimplifyPath solution = new SimplifyPath();
        final String simplifyPath = solution.simplifyPath("/a/./b/../../c/");

        Assert.assertEquals("/c", simplifyPath);
    }
}
