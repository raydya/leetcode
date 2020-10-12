package com.raydya;

public class TwoSumII {
//    public int[] twoSum(int[] numbers, int target) {
//        HashMap<Integer, Integer> map = new HashMap<>(numbers.length * 2);
//
//        for (int i = 0; i < numbers.length; i++) {
//            int m = numbers[i];
//            int n = target - m;
//            map.put(n, i);
//        }
//
//        for (int j = 0; j < numbers.length; j++) {
//            int k = numbers[j];
//            final Integer v = map.get(k);
//            if (Objects.nonNull(v)) {
//                return new int[]{j + 1, v + 1};
//            }
//        }
//
//        return new int[]{};
//    }

    public int[] twoSum(int[] numbers, int target) {
        int p1 = 0;
        int p2 = numbers.length - 1;

        while (p1 < p2) {
            final int sum = numbers[p1] + numbers[p2];
            if (sum == target) return new int[]{p1 + 1, p2 + 1};

            if (sum > target) {
                p2--;
            } else {
                p1++;
            }
        }

        return new int[]{};
    }
}
