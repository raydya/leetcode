package com.raydya;

import java.util.Collections;
import java.util.PriorityQueue;

public class MaximalScoreAfterApplyingKOperations {

    public long maxKelements(int[] nums, int k) {
        final PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        for (final int num : nums) {
            q.offer(num);
        }
        long p = 0;
        for (int i = 0; i < k; i++) {
            if (q.isEmpty()) {
                break;
            }
            final Integer poll = q.poll();
            p += poll;
            final int ceil = (int) Math.ceil(poll / 3.0);
            q.offer(ceil);
        }

        return p;
    }

}
