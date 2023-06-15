package com.raydya;

public class ThreeDivisors {

    public boolean isThree(int n) {
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            final int remainder = n % i;
            if (remainder == 0) {
                cnt++;
            }
        }

        return cnt == 3;
    }

}
