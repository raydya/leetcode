package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class NumberOfEquivalentDominoPairsTest {
    @Test
    public void test1() {
        final NumberOfEquivalentDominoPairs solution = new NumberOfEquivalentDominoPairs();
        final int output = solution.numEquivDominoPairs(new int[][]{{1, 2}, {2, 1}, {3, 4}, {5, 6}});

        Assert.assertEquals(1, output);
    }

    @Test
    public void test2() {
        final NumberOfEquivalentDominoPairs solution = new NumberOfEquivalentDominoPairs();
        final int output = solution.numEquivDominoPairs(new int[][]{{1, 2}, {1, 2}, {1, 1}, {1, 2}, {2, 2}});

        Assert.assertEquals(3, output);
    }

    @Test
    public void test3() {
        final NumberOfEquivalentDominoPairs solution = new NumberOfEquivalentDominoPairs();
        final int output = solution.numEquivDominoPairs(new int[][]{{1, 1}, {2, 2}, {1, 1}, {1, 2}, {1, 2}, {1, 1}});

        Assert.assertEquals(4, output);
    }

    @Test
    public void test4() {
        final NumberOfEquivalentDominoPairs solution = new NumberOfEquivalentDominoPairs();
        final int output = solution.numEquivDominoPairs(new int[][]{{2, 1}, {1, 2}, {1, 2}, {1, 2}, {2, 1}, {1, 1}, {1, 2}, {2, 2}});

        Assert.assertEquals(15, output);
    }
}
