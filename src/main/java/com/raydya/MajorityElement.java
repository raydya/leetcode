package com.raydya;

public class MajorityElement {
//    public int majorityElement(int[] nums) {
//        HashMap<Integer, Integer> elementMap = new HashMap<>();
//
//        for (final int num : nums) {
//            elementMap.put(num, elementMap.getOrDefault(num, 0) + 1);
//            if (elementMap.get(num) > nums.length / 2) {
//                return num;
//            }
//        }
//
//
//        return -1;
//    }

    public int majorityElement(int[] nums) {
        int candidate = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == candidate) {
                count += 1;
            } else {
                count -= 1;
                if (count == 0) {
                    candidate = nums[i];
                    count = 1;
                }
            }

        }
        return candidate;
    }
}
