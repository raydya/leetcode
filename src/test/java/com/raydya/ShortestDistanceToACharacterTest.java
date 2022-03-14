package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class ShortestDistanceToACharacterTest {

    @Test
    public void test1() {
        final ShortestDistanceToACharacter solution = new ShortestDistanceToACharacter();
        final int[] output = solution.shortestToChar("loveleetcode", 'e');

        Assert.assertArrayEquals(new int[]{3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0}, output);
    }

    @Test
    public void test2() {
        final ShortestDistanceToACharacter solution = new ShortestDistanceToACharacter();
        final int[] output = solution.shortestToChar("aaab", 'b');

        Assert.assertArrayEquals(new int[]{3, 2, 1, 0}, output);
    }
}
