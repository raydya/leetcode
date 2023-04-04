package com.raydya;

import java.util.Arrays;

public class CheckIfArrayIsSortedAndRotated {

    public boolean check(int[] nums) {
        final int[] target = nums.clone();
        Arrays.sort(target);

        int min = Integer.MAX_VALUE;
        int m = 0;
        for (int i = 0; i < nums.length; i++) {
            final int num = nums[i];
            if (num < min) {
                min = num;
                m = i;
            }
        }

        final int l = target.length;

        for (int i = m; i < l; i++) {
            boolean f = true;
            for (int j = 0; j < l; j++) {
                final int k = (j + i) % l;
                if (target[j] != nums[k]) {
                    f = false;
                    break;
                }
            }
            if (f) {
                return true;
            }
        }

        return false;
    }

}
