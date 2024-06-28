package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class CheckDistancesBetweenSameLettersTest {

    @Test
    public void test1() {
        final CheckDistancesBetweenSameLetters solution = new CheckDistancesBetweenSameLetters();
        final boolean output = solution.checkDistances(
            "abaccb",
            new int[]{1, 3, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
        );

        Assert.assertTrue(output);
    }

    @Test
    public void test2() {
        final CheckDistancesBetweenSameLetters solution = new CheckDistancesBetweenSameLetters();
        final boolean output = solution.checkDistances(
            "aa",
            new int[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
        );

        Assert.assertFalse(output);
    }
}
