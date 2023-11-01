package com.raydya;

import java.util.Comparator;
import java.util.PriorityQueue;

public class FindSubsequenceOfLengthKWithTheLargestSum {

    public int[] maxSubsequence(int[] nums, int k) {
        final int l = nums.length;
        if (l == k) {
            return nums;
        }

        final int rs = l - k;
        final PriorityQueue<Integer> pQueue = new PriorityQueue<>(Comparator.reverseOrder());

        for (final int num : nums) {
            if (pQueue.size() < rs) {
                pQueue.offer(num);
            } else {
                final Integer peek = pQueue.peek();
                if (num < peek) {
                    pQueue.poll();
                    pQueue.offer(num);
                }
            }
        }

        final int[] ret = new int[k];
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            final int num = nums[i];
            if (pQueue.contains(num)) {
                pQueue.remove(num);
                j++;
            } else {
                ret[i - j] = num;
            }
        }

        return ret;
    }

}
