package com.raydya;

public class SingleNumber {
    /*
    public int singleNumber(int[] nums) {
        if (nums.length == 1) return nums[0];

        final HashMap<Integer, Integer> holder = new HashMap<>(nums.length);

        for (final int num : nums) {
            holder.merge(num, 1, Integer::sum);
        }

        return holder.entrySet().stream()
            .filter(entry -> entry.getValue() == 1)
            .findFirst()
            .map(Map.Entry::getKey)
            .orElse(0);
    }
     */

    public int singleNumber(int[] nums) {
        int a = 0;
        for (int n : nums) {
            a ^= n;
        }
        return a;
    }
}
