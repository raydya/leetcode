package com.raydya.ethan.math;

public class CombinationLottery {

    public long calc(final int t, final int first, final int second, final int third) {
        final Combination combination = new Combination();
        return combination.c(t, first) *
            combination.c(t - first, second) *
            combination.c(t - first - second, third);
    }


}
