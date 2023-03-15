package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class DetermineIfStringHalvesAreAlikeTest {

    @Test
    public void test1() {
        final DetermineIfStringHalvesAreAlike solution = new DetermineIfStringHalvesAreAlike();
        final boolean output = solution.halvesAreAlike("book");

        Assert.assertTrue(output);
    }

    @Test
    public void test2() {
        final DetermineIfStringHalvesAreAlike solution = new DetermineIfStringHalvesAreAlike();
        final boolean output = solution.halvesAreAlike("textbook");

        Assert.assertFalse(output);
    }
}
