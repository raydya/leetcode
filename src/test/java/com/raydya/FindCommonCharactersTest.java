package com.raydya;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FindCommonCharactersTest {
    @Test
    public void test1() {
        final FindCommonCharacters solution = new FindCommonCharacters();
        final List<String> output = solution.commonChars(new String[]{"bella", "label", "roller"});

        Assert.assertArrayEquals(new String[]{"e", "l", "l"}, output.toArray(new String[]{}));
    }

    @Test
    public void test2() {
        final FindCommonCharacters solution = new FindCommonCharacters();
        final List<String> output = solution.commonChars(new String[]{"cool", "lock", "cook"});

        Assert.assertArrayEquals(new String[]{"c", "o"}, output.toArray(new String[]{}));
    }

    @Test
    public void test3() {
        final FindCommonCharacters solution = new FindCommonCharacters();
        final List<String> output = solution.commonChars(new String[]{"acabcddd", "bcbdbcbd", "baddbadb", "cbdddcac", "aacbcccd", "ccccddda", "cababaab", "addcaccd"});

        Assert.assertArrayEquals(new String[]{}, output.toArray(new String[]{}));
    }
}
