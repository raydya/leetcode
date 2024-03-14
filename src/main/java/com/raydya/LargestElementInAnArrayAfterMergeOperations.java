package com.raydya;

import java.util.ArrayList;
import java.util.List;

public class LargestElementInAnArrayAfterMergeOperations {

    public long maxArrayValue(int[] nums) {
        List<Long> list = new ArrayList<>();
        for (int num : nums) {
            list.add((long) num);
        }

        boolean merged;
        do {
            merged = false;
            for (int i = list.size() - 2; i >= 0; --i) {
                if (list.get(i) <= list.get(i + 1)) {
                    long sum = list.get(i) + list.get(i + 1);
                    list.set(i + 1, sum);
                    list.remove(i);
                    merged = true;
                }
            }
        } while (merged);

        long max = 0;
        for (long num : list) {
            max = Math.max(max, num);
        }
        return max;
    }

}
