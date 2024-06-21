package com.raydya;

public class TemperatureTrend {

    public int temperatureTrend(int[] temperatureA, int[] temperatureB) {
        final int length = temperatureA.length;
        int[][] trend = new int[length][3];

        int k = 0;
        for (int i = 1; i < length; i++) {
            int v1 = temperatureA[i] - temperatureA[i - 1];
            int v2 = temperatureB[i] - temperatureB[i - 1];
            int f1, f2;
            if (v1 > 0) {
                f1 = 1;
            } else if (v1 == 0) {
                f1 = 0;
            } else {
                f1 = -1;
            }
            if (v2 > 0) {
                f2 = 1;
            } else if (v2 == 0) {
                f2 = 0;
            } else {
                f2 = -1;
            }
            trend[i][0] = f1;
            trend[i][1] = f2;
            trend[i][2] = f1 == f2 ? trend[i - 1][2] + 1 : 0;
            k = Math.max(k, trend[i][2]);
        }

        return k;
    }

}
