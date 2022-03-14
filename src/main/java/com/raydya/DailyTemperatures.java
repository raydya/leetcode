package com.raydya;

public class DailyTemperatures {

    public int[] dailyTemperatures(int[] T) {
        final int[] d = new int[T.length];

        for (int i = 0; i < T.length; i++) {
            final int t1 = T[i];

            for (int j = i + 1; j < T.length; j++) {
                final int t2 = T[j];

                if (t2 > t1) {
                    d[i] = j - i;
                    break;
                }
            }
        }

        return d;
    }
}
