package com.raydya;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class SmallestInfiniteSet {

    private final PriorityQueue<Integer> pq;
    private final Set<Integer> set;

    public SmallestInfiniteSet() {
        this.pq = new PriorityQueue<>();
        this.set = new HashSet<>();
        for (int i = 1; i <= 1000; i++) {
            this.pq.offer(i);
            set.add(i);
        }
    }

    public int popSmallest() {
        if (pq.isEmpty()) {
            return -1;
        }
        final Integer k = pq.poll();
        set.remove(k);
        return k;
    }

    public void addBack(int num) {
        if (set.contains(num)) {
            return;
        }
        pq.offer(num);
        set.add(num);
    }
}
