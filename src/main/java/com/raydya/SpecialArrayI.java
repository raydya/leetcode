package com.raydya;

public class SpecialArrayI {

    public boolean isArraySpecial(int[] nums) {
        boolean m = nums[0] % 2 == 0;
        for (int i = 1; i < nums.length; i++) {
            final boolean n = nums[i] % 2 == 0;
            if (m == n) {
                return false;
            }
            m = n;
        }

        return true;
    }

}
