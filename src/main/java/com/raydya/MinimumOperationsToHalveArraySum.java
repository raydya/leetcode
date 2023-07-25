package com.raydya;

import java.util.Collections;
import java.util.PriorityQueue;

public class MinimumOperationsToHalveArraySum {

    public int halveArray(int[] nums) {
        final PriorityQueue<Double> q = new PriorityQueue<>(Collections.reverseOrder());
        long t = 0;
        for (final int num : nums) {
            t += num;
            q.offer((double) num);
        }

        int c = 0;
        double p = 0;
        final double th = t / 2.0;
        while (p < th && !q.isEmpty()) {
            final double v = q.poll();
            final double h = v / 2.0;
            p += h;
            q.offer(h);
            c++;
        }

        return c;
    }

}
