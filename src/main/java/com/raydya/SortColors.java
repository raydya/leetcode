package com.raydya;

public class SortColors {

    public void sortColors(int[] nums) {
        final int[] holder = new int[3];
        for (final int v : nums) {
            holder[v]++;
        }

        int c = 0;
        for (int i = 0; i < holder.length; i++) {
            final int i1 = holder[i];
            for (int j = 0; j < i1; j++) {
                nums[c] = i;
                c++;
            }
        }
    }
}
