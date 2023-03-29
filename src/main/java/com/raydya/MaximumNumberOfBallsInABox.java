package com.raydya;

public class MaximumNumberOfBallsInABox {

    public int countBalls(int lowLimit, int highLimit) {
        final int[] h = new int[highLimit + 1];
        int m = 0;

        for (int i = lowLimit; i <= highLimit; i++) {
            int x = i;
            int t = 0;
            while (x > 0) {
                t += x % 10;
                x = x / 10;
            }
            h[t]++;
            m = Math.max(h[t], m);
        }

        return m;
    }

}
