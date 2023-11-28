package com.raydya;

import java.util.ArrayList;
import java.util.List;

public class FrontMiddleBackQueue {

    private final List<Integer> q;

    public FrontMiddleBackQueue() {
        this.q = new ArrayList<>();
    }

    public void pushFront(int val) {
        q.add(0, val);
    }

    public void pushMiddle(int val) {
        final int size = q.size();
        q.add(size / 2, val);
    }

    public void pushBack(int val) {
        q.add(val);
    }

    public int popFront() {
        if (q.isEmpty()) {
            return -1;
        }
        return q.remove(0);
    }

    public int popMiddle() {
        if (q.isEmpty()) {
            return -1;
        }
        final int remain = q.size() % 2;
        final int k = q.size() / 2;
        final int middle = remain == 0 ? k - 1 : k;
        return q.remove(middle);
    }

    public int popBack() {
        if (q.isEmpty()) {
            return -1;
        }
        return q.remove(q.size() - 1);
    }
}
