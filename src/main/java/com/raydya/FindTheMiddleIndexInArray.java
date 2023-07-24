package com.raydya;

public class FindTheMiddleIndexInArray {

    public int findMiddleIndex(int[] nums) {
        final int l = nums.length;
        final int[] sl = new int[l];
        sl[0] = nums[0];
        final int[] sr = new int[l];
        sr[l - 1] = nums[l - 1];

        for (int i = 1; i < l; i++) {
            final int n = nums[i];
            sl[i] = sl[i - 1] + n;
        }

        for (int i = l - 2; i >= 0; i--) {
            final int n = nums[i];
            sr[i] = sr[i + 1] + n;
        }

        for (int i = 0; i < l; i++) {
            final int nl = i - 1 >= 0 ? sl[i - 1] : 0;
            final int nr = i + 1 < l ? sr[i + 1] : 0;
            if (nl == nr) {
                return i;
            }
        }

        return -1;
    }

}
