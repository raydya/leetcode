package com.raydya;

import java.util.Arrays;

public class FindTheIntegerAddedToArrayI {

    public int addedInteger(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
       
        return nums2[0] - nums1[0];
    }

}
