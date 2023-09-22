package com.raydya;

import java.util.Arrays;

public class DistributeMoneyToMaximumChildren {

    public int distMoney(int money, int children) {
        if (money < children) {
            return -1;
        }

        final int[] h = new int[children];
        Arrays.fill(h, 1);
        money -= children;

        for (int i = 0; i < h.length; i++) {
            if (money >= 7) {
                h[i] += 7;
                money -= 7;
            }
        }

        if (money > 0) {
            h[h.length - 1] = h[h.length - 1] + money;
            money = 0;
            if (h[h.length - 1] == 4) {
                h[h.length - 1] -= 1;
                h[h.length - 2] += 1;
            }
        }

        int cnt = 0;
        for (final int j : h) {
            if (j == 8) {
                cnt++;
            }
        }

        return cnt;
    }

}
