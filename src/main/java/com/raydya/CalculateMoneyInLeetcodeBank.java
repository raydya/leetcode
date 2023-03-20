package com.raydya;

public class CalculateMoneyInLeetcodeBank {

    public int totalMoney(int n) {
        int t = 0;
        for (int i = 0; i < n; i++) {
            final int w = i / 7;
            final int d = i % 7 + 1;
            t += w + d;
        }

        return t;
    }
}
