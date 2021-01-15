package com.raydya;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class PermutationsIITest {
    @Test
    public void test1() {
        final PermutationsII solution = new PermutationsII();
        final List<List<Integer>> output = solution.permuteUnique(new int[]{1, 1, 2});

        Assert.assertEquals(3, output.size());
    }

    @Test
    public void test2() {
        final PermutationsII solution = new PermutationsII();
        final List<List<Integer>> output = solution.permuteUnique(new int[]{1, 2, 3});

        Assert.assertEquals(6, output.size());
    }
}
