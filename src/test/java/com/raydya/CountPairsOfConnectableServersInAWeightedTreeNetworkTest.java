package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class CountPairsOfConnectableServersInAWeightedTreeNetworkTest {

    @Test
    public void test1() {
        final CountPairsOfConnectableServersInAWeightedTreeNetwork solution = new CountPairsOfConnectableServersInAWeightedTreeNetwork();
        final int[] output = solution.countPairsOfConnectableServers(
            new int[][]{
                new int[]{0, 1, 1},
                new int[]{1, 2, 5},
                new int[]{2, 3, 13},
                new int[]{3, 4, 9},
                new int[]{4, 5, 2}
            },
            1
        );

        Assert.assertArrayEquals(new int[]{0, 4, 6, 6, 4, 0}, output);
    }

    @Test
    public void test2() {
        final CountPairsOfConnectableServersInAWeightedTreeNetwork solution = new CountPairsOfConnectableServersInAWeightedTreeNetwork();
        final int[] output = solution.countPairsOfConnectableServers(
            new int[][]{
                new int[]{0, 6, 3},
                new int[]{6, 5, 3},
                new int[]{0, 3, 1},
                new int[]{3, 2, 7},
                new int[]{3, 1, 6},
                new int[]{3, 4, 2}
            },
            3
        );

        Assert.assertArrayEquals(new int[]{2, 0, 0, 0, 0, 0, 2}, output);
    }
}
