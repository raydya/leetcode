package com.raydya;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class BeautifulTowersII {

    public long maximumSumOfHeights(List<Integer> maxHeights) {
        final int n = maxHeights.size();
        long res = 0;
        final long[] prefix = new long[n];
        final long[] suffix = new long[n];
        final Deque<Integer> stack1 = new ArrayDeque<>();
        final Deque<Integer> stack2 = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            while (!stack1.isEmpty() && maxHeights.get(i) < maxHeights.get(stack1.peek())) {
                stack1.pop();
            }
            if (stack1.isEmpty()) {
                prefix[i] = (long) (i + 1) * maxHeights.get(i);
            } else {
                prefix[i] = prefix[stack1.peek()] + (long) (i - stack1.peek()) * maxHeights.get(i);
            }
            stack1.push(i);
        }
        for (int i = n - 1; i >= 0; i--) {
            while (!stack2.isEmpty() && maxHeights.get(i) < maxHeights.get(stack2.peek())) {
                stack2.pop();
            }
            if (stack2.isEmpty()) {
                suffix[i] = (long) (n - i) * maxHeights.get(i);
            } else {
                suffix[i] = suffix[stack2.peek()] + (long) (stack2.peek() - i) * maxHeights.get(i);
            }
            stack2.push(i);
            res = Math.max(res, prefix[i] + suffix[i] - maxHeights.get(i));
        }
        return res;
    }

}
