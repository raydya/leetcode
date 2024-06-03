package com.raydya;

import java.util.Collections;
import java.util.PriorityQueue;

public class MinimumAmountOfTimeToFillCups {

    public int fillCups(int[] amount) {
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());

        for (final int k : amount) {
            if (k > 0) {
                q.add(k);
            }
        }

        int cnt = 0;
        while (q.size() > 1) {
            Integer k1 = q.poll();
            Integer k2 = q.poll();
            k1--;
            k2--;
            if (k1 > 0) {
                q.add(k1);
            }
            if (k2 > 0) {
                q.add(k2);
            }
            cnt++;
        }

        if (!q.isEmpty()) {
            cnt += q.poll();
            return cnt;
        }

        return cnt;
    }

}
