package com.raydya;

public class PerfectNumber {

    public boolean checkPerfectNumber(int num) {
        if (num == 1) {
            return false;
        }
        int s = 2;
        int e = num / 2;
        int sum = 1;

        while (s <= e) {
            if (num % s == 0) {
                final int f = num / s;
                sum += f + s;
                e = f - 1;
            }
            s++;
        }

        return num == sum;
    }
}
