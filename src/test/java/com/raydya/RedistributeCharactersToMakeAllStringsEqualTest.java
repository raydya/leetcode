package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class RedistributeCharactersToMakeAllStringsEqualTest {

    @Test
    public void test1() {
        final RedistributeCharactersToMakeAllStringsEqual solution = new RedistributeCharactersToMakeAllStringsEqual();
        final boolean output = solution.makeEqual(new String[]{"abc", "aabc", "bc"});

        Assert.assertTrue(output);
    }

    @Test
    public void test2() {
        final RedistributeCharactersToMakeAllStringsEqual solution = new RedistributeCharactersToMakeAllStringsEqual();
        final boolean output = solution.makeEqual(new String[]{"ab", "a"});

        Assert.assertFalse(output);
    }

    @Test
    public void test3() {
        final RedistributeCharactersToMakeAllStringsEqual solution = new RedistributeCharactersToMakeAllStringsEqual();
        final boolean output = solution.makeEqual(new String[]{"a", "b"});

        Assert.assertFalse(output);
    }

    @Test
    public void test4() {
        final RedistributeCharactersToMakeAllStringsEqual solution = new RedistributeCharactersToMakeAllStringsEqual();
        final boolean output = solution.makeEqual(new String[]{
            "caaaaa", "aaaaaaaaa", "a", "bbb", "bbbbbbbbb", "bbb", "cc", "cccccccccccc", "ccccccc", "ccccccc", "cc",
            "cccc", "c", "cccccccc", "c"
        });

        Assert.assertTrue(output);
    }
}
