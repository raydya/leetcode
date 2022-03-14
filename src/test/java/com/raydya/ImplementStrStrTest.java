package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class ImplementStrStrTest {

    @Test
    public void test1() {
        final String haystack = "hello";
        final String needle = "ll";

        final ImplementStrStr solution = new ImplementStrStr();
        final int index = solution.strStr(haystack, needle);

        Assert.assertEquals(2, index);
    }

    @Test
    public void test2() {
        final String haystack = "aaaaa";
        final String needle = "bba";

        final ImplementStrStr solution = new ImplementStrStr();
        final int index = solution.strStr(haystack, needle);

        Assert.assertEquals(-1, index);
    }

    @Test
    public void test3() {
        final String haystack = "a";
        final String needle = "a";

        final ImplementStrStr solution = new ImplementStrStr();
        final int index = solution.strStr(haystack, needle);

        Assert.assertEquals(0, index);
    }

    @Test
    public void test4() {
        final String haystack = "aaa";
        final String needle = "a";

        final ImplementStrStr solution = new ImplementStrStr();
        final int index = solution.strStr(haystack, needle);

        Assert.assertEquals(0, index);
    }

    @Test
    public void test5() {
        final String haystack = "aaa";
        final String needle = "aaa";

        final ImplementStrStr solution = new ImplementStrStr();
        final int index = solution.strStr(haystack, needle);

        Assert.assertEquals(0, index);
    }

    @Test
    public void test6() {
        final String haystack = "aaa";
        final String needle = "aaaa";

        final ImplementStrStr solution = new ImplementStrStr();
        final int index = solution.strStr(haystack, needle);

        Assert.assertEquals(-1, index);
    }

    @Test
    public void test7() {
        final String haystack = "mississippi";
        final String needle = "issip";

        final ImplementStrStr solution = new ImplementStrStr();
        final int index = solution.strStr(haystack, needle);

        Assert.assertEquals(4, index);
    }

    @Test
    public void test8() {
        final String haystack = "mississippi";
        final String needle = "issipi";

        final ImplementStrStr solution = new ImplementStrStr();
        final int index = solution.strStr(haystack, needle);

        Assert.assertEquals(-1, index);
    }

    @Test
    public void test9() {
        final String haystack = "babbbbbabb";
        final String needle = "bbab";

        final ImplementStrStr solution = new ImplementStrStr();
        final int index = solution.strStr(haystack, needle);

        Assert.assertEquals(5, index);
    }
}
