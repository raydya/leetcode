package com.raydya;

import java.util.HashMap;
import java.util.Objects;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            int m = nums[i];
            int n = target - m;
            map.put(n, i);
        }

        for (int j = 0; j < nums.length; j++) {
            int k = nums[j];
            Integer indexOne = map.get(k);
            if (Objects.nonNull(indexOne) && j != indexOne) {
                if (indexOne > j) {
                    return new int[]{j, indexOne};
                }
                return new int[]{indexOne, j};
            }
        }

        throw new RuntimeException();
    }
}
