package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class FindAndReplaceInStringTest {

    @Test
    public void test1() {
        final FindAndReplaceInString solution = new FindAndReplaceInString();
        final String output = solution.findReplaceString("abcd", new int[]{0, 2}, new String[]{"a", "cd"},
            new String[]{"eee", "ffff"});

        Assert.assertEquals("eeebffff", output);
    }

    @Test
    public void test2() {
        final FindAndReplaceInString solution = new FindAndReplaceInString();
        final String output = solution.findReplaceString("abcd", new int[]{0, 2}, new String[]{"ab", "ec"},
            new String[]{"eee", "ffff"});

        Assert.assertEquals("eeecd", output);
    }

    @Test
    public void test3() {
        final FindAndReplaceInString solution = new FindAndReplaceInString();
        final String output = solution.findReplaceString("abcde", new int[]{2, 2}, new String[]{"cdef", "bc"},
            new String[]{"f", "fe"});

        Assert.assertEquals("abcde", output);
    }
}
