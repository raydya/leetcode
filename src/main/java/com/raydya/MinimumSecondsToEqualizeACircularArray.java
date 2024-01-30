package com.raydya;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinimumSecondsToEqualizeACircularArray {

    public int minimumSeconds(List<Integer> nums) {
        int n = nums.size(), res = Integer.MAX_VALUE;
        Map<Integer, List<Integer>> pos = new HashMap<>();
        for (int i = 0; i < n; i++) {
            pos.computeIfAbsent(nums.get(i), k -> new ArrayList<>()).add(i);
        }
        for (List<Integer> plist : pos.values()) {
            plist.add(plist.get(0) + n);
            int sec = 0;
            for (int i = 1; i < plist.size(); ++i) {
                sec = Math.max(sec, (plist.get(i) - plist.get(i - 1)) / 2);
            }
            res = Math.min(res, sec);
        }
        return res;
    }

}
