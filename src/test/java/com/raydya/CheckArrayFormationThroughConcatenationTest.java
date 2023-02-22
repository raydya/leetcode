package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class CheckArrayFormationThroughConcatenationTest {

    @Test
    public void test1() {
        final CheckArrayFormationThroughConcatenation solution = new CheckArrayFormationThroughConcatenation();
        final boolean output = solution.canFormArray(new int[]{15, 88}, new int[][]{{88}, {15}});

        Assert.assertTrue(output);
    }

    @Test
    public void test2() {
        final CheckArrayFormationThroughConcatenation solution = new CheckArrayFormationThroughConcatenation();
        final boolean output = solution.canFormArray(new int[]{49, 18, 16}, new int[][]{{16, 18, 49}});

        Assert.assertFalse(output);
    }

    @Test
    public void test3() {
        final CheckArrayFormationThroughConcatenation solution = new CheckArrayFormationThroughConcatenation();
        final boolean output = solution.canFormArray(new int[]{91, 4, 64, 78}, new int[][]{{78}, {4, 64}, {91}});

        Assert.assertTrue(output);
    }

    @Test
    public void test4() {
        final CheckArrayFormationThroughConcatenation solution = new CheckArrayFormationThroughConcatenation();
        final boolean output = solution.canFormArray(new int[]{1, 3, 5, 7}, new int[][]{{2, 4, 6, 8}});

        Assert.assertFalse(output);
    }
}
