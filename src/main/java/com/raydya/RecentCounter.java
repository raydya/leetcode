package com.raydya;

import java.util.LinkedList;

public class RecentCounter {
    private final LinkedList<Integer> requests;

    public RecentCounter() {
        this.requests = new LinkedList<>();
    }

    public int ping(int t) {
        int s = t - 3000;
        requests.addLast(t);

        while (!requests.isEmpty()) {
            final Integer v = requests.peekFirst();
            if (v >= s && v <= t) {
                return requests.size();
            } else {
                requests.poll();
            }
        }

        return 0;
    }
}
