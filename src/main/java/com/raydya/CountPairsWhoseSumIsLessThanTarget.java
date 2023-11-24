package com.raydya;

import java.util.List;

public class CountPairsWhoseSumIsLessThanTarget {

    public int countPairs(List<Integer> nums, int target) {
        int cnt = 0;
        for (int i = 0; i < nums.size(); i++) {
            final Integer m = nums.get(i);
            for (int j = i + 1; j < nums.size(); j++) {
                final Integer n = nums.get(j);
                if (m + n < target) {
                    cnt++;
                }
            }
        }

        return cnt;
    }

}
