package com.raydya;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FindAllAnagramsInAStringTest {
    @Test
    public void test1() {
        final FindAllAnagramsInAString solution = new FindAllAnagramsInAString();
        final List<Integer> output = solution.findAnagrams("cbaebabacd", "abc");

        Assert.assertArrayEquals(new Integer[]{0, 6}, output.toArray());
    }

    @Test
    public void test2() {
        final FindAllAnagramsInAString solution = new FindAllAnagramsInAString();
        final List<Integer> output = solution.findAnagrams("abab", "ab");

        Assert.assertArrayEquals(new Integer[]{0, 1, 2}, output.toArray());
    }
}
