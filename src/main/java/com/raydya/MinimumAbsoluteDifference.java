package com.raydya;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsoluteDifference {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);

        int diff = Integer.MAX_VALUE;
        int p = arr[0];
        final List<List<Integer>> ans = new ArrayList<>();

        for (int i = 1; i < arr.length; i++) {
            final int j = arr[i];
            final int k = Math.abs(j - p);
            if (k == diff) {
                ans.add(Arrays.asList(p, j));
            } else if (k < diff) {
                diff = k;
                ans.clear();
                ans.add(Arrays.asList(p, j));
            }
            p = j;
        }

        return ans;
    }
}
