package com.raydya;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindTheLongestEqualSubarray {

    public int longestEqualSubarray(List<Integer> nums, int k) {
        int n = nums.size();
        int ans = 0;
        Map<Integer, Integer> cnt = new HashMap<>();
        for (int i = 0, j = 0; j < n; j++) {
            cnt.put(nums.get(j), cnt.getOrDefault(nums.get(j), 0) + 1);
            /*当前区间中，无法以 nums[i] 为等值元素构成合法等值数组*/
            while (j - i + 1 - cnt.get(nums.get(i)) > k) {
                cnt.put(nums.get(i), cnt.get(nums.get(i)) - 1);
                i++;
            }
            ans = Math.max(ans, cnt.get(nums.get(j)));
        }
        return ans;
    }
}
