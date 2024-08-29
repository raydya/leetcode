package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class CheckIfGridSatisfiesConditionsTest {

    @Test
    public void test1() {
        final CheckIfGridSatisfiesConditions solution = new CheckIfGridSatisfiesConditions();
        final boolean output = solution.satisfiesConditions(new int[][]{
            {1, 0, 2},
            {1, 0, 2}
        });

        Assert.assertTrue(output);
    }

    @Test
    public void test2() {
        final CheckIfGridSatisfiesConditions solution = new CheckIfGridSatisfiesConditions();
        final boolean output = solution.satisfiesConditions(new int[][]{
            {1, 1, 1},
            {0, 0, 0}
        });

        Assert.assertFalse(output);
    }

    @Test
    public void test3() {
        final CheckIfGridSatisfiesConditions solution = new CheckIfGridSatisfiesConditions();
        final boolean output = solution.satisfiesConditions(new int[][]{
            {1},
            {2},
            {3}
        });

        Assert.assertFalse(output);
    }
}
