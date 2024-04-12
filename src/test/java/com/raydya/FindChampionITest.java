package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class FindChampionITest {

    @Test
    public void test1() {
        final FindChampionI solution = new FindChampionI();
        final int output = solution.findChampion(new int[][]{{0, 1}, {0, 0}});

        Assert.assertEquals(0, output);
    }

    @Test
    public void test2() {
        final FindChampionI solution = new FindChampionI();
        final int output = solution.findChampion(new int[][]{{0, 0, 1}, {1, 0, 1}, {0, 0, 0}});

        Assert.assertEquals(1, output);
    }
}
