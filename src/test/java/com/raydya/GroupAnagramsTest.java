package com.raydya;

import org.junit.Assert;
import org.junit.Test;

import java.util.Comparator;
import java.util.List;

public class GroupAnagramsTest {
    @Test
    public void test1() {
        final GroupAnagrams solution = new GroupAnagrams();
        final List<List<String>> anagrams = solution.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});

        anagrams.forEach(anagram -> anagram.sort(Comparator.naturalOrder()));
        anagrams.sort(Comparator.comparingInt(List::size));

        Assert.assertArrayEquals(new String[]{"bat"}, anagrams.get(0).toArray());
        Assert.assertArrayEquals(new String[]{"nat", "tan"}, anagrams.get(1).toArray());
        Assert.assertArrayEquals(new String[]{"ate", "eat", "tea"}, anagrams.get(2).toArray());
    }

    @Test
    public void test2() {
        final GroupAnagrams solution = new GroupAnagrams();
        final List<List<String>> anagrams = solution.groupAnagrams(new String[]{""});

        Assert.assertArrayEquals(new String[]{""}, anagrams.get(0).toArray());
    }

    @Test
    public void test3() {
        final GroupAnagrams solution = new GroupAnagrams();
        final List<List<String>> anagrams = solution.groupAnagrams(new String[]{"a"});

        Assert.assertArrayEquals(new String[]{"a"}, anagrams.get(0).toArray());
    }
}
