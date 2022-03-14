package com.raydya;

import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class SubsetsIITest {

    @Test
    public void test1() {
        final SubsetsII solution = new SubsetsII();
        final List<List<Integer>> output = solution.subsetsWithDup(new int[]{1, 2, 2});

        Assert.assertEquals(6, output.size());
    }

    @Test
    public void test2() {
        final SubsetsII solution = new SubsetsII();
        final List<List<Integer>> output = solution.subsetsWithDup(new int[]{0});

        Assert.assertEquals(2, output.size());
    }
}
