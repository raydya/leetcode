package com.raydya;

public class MinimumDeletionsToMakeArrayBeautiful {

    public int minDeletion(int[] nums) {
        final int l = nums.length;
        int cnt = 0;
        for (int i = 0; i < l; i++) {
            if ((i - cnt) % 2 != 0 || i == l - 1) {
                continue;
            }
            final boolean violated = nums[i] == nums[i + 1];
            if (violated) {
                cnt++;
            }
        }

        final boolean b = (l - cnt) % 2 == 0;
        final int k = b ? 0 : 1;

        return cnt + k;
    }

}
