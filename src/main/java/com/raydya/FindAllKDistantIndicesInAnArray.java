package com.raydya;

import java.util.ArrayList;
import java.util.List;

public class FindAllKDistantIndicesInAnArray {

    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> ret = new ArrayList<>();
        List<Integer> js = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            final int num = nums[i];
            if (num == key) {
                js.add(i);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < js.size(); j++) {
                final Integer t = js.get(j);
                final int distance = Math.abs(i - t);
                if (distance <= k) {
                    ret.add(i);
                    break;
                }
            }
        }

        return ret;
    }

}
