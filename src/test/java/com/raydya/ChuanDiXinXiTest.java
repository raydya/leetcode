package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class ChuanDiXinXiTest {
    @Test
    public void test1() {
        final int[][] relation = {
            {0, 2}, {2, 1}, {3, 4}, {2, 3}, {1, 4}, {2, 0}, {0, 4}
        };

        final ChuanDiXinXi solution = new ChuanDiXinXi();
        final int output = solution.numWays(5, relation, 3);

        Assert.assertEquals(3, output);
    }

    @Test
    public void test2() {
        final int[][] relation = {
            {0, 2}, {2, 1}
        };

        final ChuanDiXinXi solution = new ChuanDiXinXi();
        final int output = solution.numWays(3, relation, 2);

        Assert.assertEquals(0, output);
    }
}
