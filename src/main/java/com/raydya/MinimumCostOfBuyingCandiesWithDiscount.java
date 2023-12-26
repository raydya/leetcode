package com.raydya;

import java.util.Arrays;

public class MinimumCostOfBuyingCandiesWithDiscount {

    public int minimumCost(int[] cost) {
        Arrays.sort(cost);

        int sum = 0;
        int c = 0;
        for (int i = cost.length - 1; i >= 0; i--) {
            if (c == 2) {
                c = 0;
                continue;
            }
            sum += cost[i];
            c++;
        }

        return sum;
    }

}
