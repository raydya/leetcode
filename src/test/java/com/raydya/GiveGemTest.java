package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class GiveGemTest {

    @Test
    public void test1() {
        final GiveGem solution = new GiveGem();
        final int output = solution.giveGem(new int[]{3, 1, 2}, new int[][]{{0, 2}, {2, 1}, {2, 0}});

        Assert.assertEquals(2, output);
    }

    @Test
    public void test2() {
        final GiveGem solution = new GiveGem();
        final int output = solution.giveGem(new int[]{100, 0, 50, 100}, new int[][]{{0, 2}, {0, 1}, {3, 0}, {3, 0}});

        Assert.assertEquals(75, output);
    }

    @Test
    public void test3() {
        final GiveGem solution = new GiveGem();
        final int output = solution.giveGem(new int[]{0, 0, 0, 0}, new int[][]{{1, 2}, {3, 1}, {1, 2}});

        Assert.assertEquals(0, output);
    }

    @Test
    public void test4() {
        final GiveGem solution = new GiveGem();
        final int output = solution.giveGem(new int[]{0, 2, 5, 4},
            new int[][]{{3, 2}, {3, 2}, {1, 3}, {0, 2}, {3, 0}, {3, 1}, {0, 3}, {2, 1}, {3, 0}}
        );

        Assert.assertEquals(4, output);
    }
}
