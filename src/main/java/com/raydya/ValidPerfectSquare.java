package com.raydya;

public class ValidPerfectSquare {

    public boolean isPerfectSquare(int num) {
        final double sqrt = Math.sqrt(num);
        return sqrt == Math.floor(sqrt);
    }
}
