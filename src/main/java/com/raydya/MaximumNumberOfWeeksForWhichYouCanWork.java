package com.raydya;

public class MaximumNumberOfWeeksForWhichYouCanWork {

    public long numberOfWeeks(int[] milestones) {
        long max = 0;
        long sum = 0;
        for (int milestone : milestones) {
            sum += milestone;
            max = Math.max(max, milestone);
        }
        long rest = sum - max;
        if (max > rest) {
            return rest * 2 + 1;
        }
        return sum;
    }

}
