package com.raydya;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class SubsetsTest {
    @Test
    public void test1() {
        final Subsets solution = new Subsets();
        final List<List<Integer>> subsets = solution.subsets(new int[]{1, 2, 3});

        Assert.assertEquals(8, subsets.size());
    }

    @Test
    public void test2() {
        final Subsets solution = new Subsets();
        final List<List<Integer>> subsets = solution.subsets(new int[]{0});

        Assert.assertEquals(2, subsets.size());
    }
}
