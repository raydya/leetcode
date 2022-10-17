package com.raydya.ethan.math;

public class NumberOfWheat {

    // grid < 64
    public long getNumberOfWheat(int grid) {
        long sum = 1;
        long numberOfWheatInGrid = 1;

        for (int i = 1; i < grid; i++) {
            numberOfWheatInGrid *= 2;
            sum += numberOfWheatInGrid;
        }

        return sum;
    }

}
