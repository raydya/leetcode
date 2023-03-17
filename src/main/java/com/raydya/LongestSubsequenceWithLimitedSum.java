package com.raydya;

import java.util.Arrays;

public class LongestSubsequenceWithLimitedSum {

    public int[] answerQueries(int[] nums, int[] queries) {
        final int m = queries.length;

        final int[] answer = new int[m];

        Arrays.sort(nums);

        for (int i = 0; i < m; i++) {
            final int q = queries[i];
            int t = 0;
            int c = 0;
            for (final int num : nums) {
                t += num;
                if (num > q || t > q) {
                    break;
                }
                c++;
            }
            answer[i] = c;
        }

        return answer;
    }

}
