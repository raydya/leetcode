package com.raydya;

public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = nums1.length - 1;

        int mIndex = m - 1;
        int nIndex = n - 1;

        while (nIndex >= 0) {
            if (mIndex >= 0 && nums1[mIndex] > nums2[nIndex]) {
                nums1[index] = nums1[mIndex];
                mIndex--;
            } else {
                nums1[index] = nums2[nIndex];
                nIndex--;
            }
            index--;
        }
    }
}
