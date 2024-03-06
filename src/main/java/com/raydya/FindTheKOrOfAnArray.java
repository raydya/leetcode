package com.raydya;

public class FindTheKOrOfAnArray {

    public int findKOr(int[] nums, int k) {
        int kor = 0;
        for (int i = 0; i < 31; i++) {
            int mask = 1 << i;
            int cnt = 0;
            for (int j = 0; j < nums.length; j++) {
                final int num = nums[j];
                final boolean b = (num & mask) == mask;
                if (b) {
                    cnt++;
                }
            }
            if (cnt >= k) {
                kor += mask;
            }
        }

        return kor;
    }

}
