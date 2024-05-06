package com.raydya;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FindResultantArrayAfterRemovingAnagramsTest {

    @Test
    public void test1() {
        final FindResultantArrayAfterRemovingAnagrams solution = new FindResultantArrayAfterRemovingAnagrams();
        final List<String> output = solution.removeAnagrams(
            new String[]{"abba", "baba", "bbaa", "cd", "cd"}
        );

        Assert.assertArrayEquals(new String[]{"abba", "cd"}, output.toArray());
    }

    @Test
    public void test2() {
        final FindResultantArrayAfterRemovingAnagrams solution = new FindResultantArrayAfterRemovingAnagrams();
        final List<String> output = solution.removeAnagrams(
            new String[]{"a", "b", "c", "d", "e"}
        );

        Assert.assertArrayEquals(new String[]{"a", "b", "c", "d", "e"}, output.toArray());
    }

    @Test
    public void test3() {
        final FindResultantArrayAfterRemovingAnagrams solution = new FindResultantArrayAfterRemovingAnagrams();
        final List<String> output = solution.removeAnagrams(
            new String[]{"a", "b", "a"}
        );

        Assert.assertArrayEquals(new String[]{"a", "b", "a"}, output.toArray());
    }
}
