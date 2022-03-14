package com.raydya;

import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class PermutationsTest {

    @Test
    public void test1() {
        final Permutations solution = new Permutations();
        final List<List<Integer>> output = solution.permute(new int[]{1, 2, 3});

        Assert.assertEquals(6, output.size());
    }

    @Test
    public void test2() {
        final Permutations solution = new Permutations();
        final List<List<Integer>> output = solution.permute(new int[]{0, 1});

        Assert.assertEquals(2, output.size());
    }

    @Test
    public void test3() {
        final Permutations solution = new Permutations();
        final List<List<Integer>> output = solution.permute(new int[]{1});

        Assert.assertEquals(1, output.size());
    }
}
