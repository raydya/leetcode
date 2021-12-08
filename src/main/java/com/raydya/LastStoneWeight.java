package com.raydya;

import java.util.Arrays;

public class LastStoneWeight {
    public int lastStoneWeight(int[] stones) {
        if (stones.length == 1) return stones[0];

        final int l = stones.length;
        for (int i = 0; i < l; i++) {
            Arrays.sort(stones);

            if (stones[l - 2] == 0) {
                break;
            }

            stones[l - 2] = Math.abs(stones[l - 1] - stones[l - 2]);
            stones[l - 1] = 0;
        }

        return stones[l - 1];
    }
}
