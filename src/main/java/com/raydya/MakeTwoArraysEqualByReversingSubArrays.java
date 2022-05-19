package com.raydya;

public class MakeTwoArraysEqualByReversingSubArrays {

    public boolean canBeEqual(int[] target, int[] arr) {
        final int[] h = new int[1001];
        for (final int i : target) {
            h[i]++;
        }

        for (final int i : arr) {
            h[i]--;
        }

        for (final int i : h) {
            if (i != 0) {
                return false;
            }
        }

        return true;
    }

}
