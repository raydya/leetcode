package com.raydya;

public class FactorialTrailingZeroes {

    public int trailingZeroes(int n) {
        int numberOfFives = 0;

        while (n >= 5) {
            final int floor = Math.floorDiv(n, 5);
            numberOfFives += floor;
            n = floor;
        }

        return numberOfFives;
    }
}
