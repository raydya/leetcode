package com.raydya;

public class TeemoAttacking {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int ret = 0;
        int pe = 0;

        for (final int time : timeSeries) {
            final int i = time + duration;
            final int p = pe >= time ? pe - time : 0;
            ret += duration - p;
            pe = i;
        }

        return ret;
    }
}
