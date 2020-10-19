package com.raydya;

public class HappyNumber {
    public boolean isHappy(int n) {
        int res = n;
        while (res != 1 && res != 4) {
            res = isHappyHelper(res);
        }
        return res == 1;
    }

    public int isHappyHelper(int n) {
        int rem = 0, sum = 0;
        while (n > 0) {
            rem = n % 10;
            sum += (rem * rem);
            n /= 10;
        }
        return sum;
    }
}
