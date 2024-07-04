package com.raydya;

public class MinimumSumOfMountainTripletsI {

    public int minimumSum(int[] nums) {
        int n = nums.length;
        if (n < 3) {
            return -1;  // 数组长度小于3时无法形成山形
        }

        int minSum = Integer.MAX_VALUE;  // 初始化最小和为最大整数值
        boolean found = false;  // 用来标记是否找到至少一个有效的三元组

        // 遍历每个可能的中间点 j
        for (int j = 1; j < n - 1; j++) {
            int leftMin = Integer.MAX_VALUE;  // 存储 j 左侧的最小值
            int rightMin = Integer.MAX_VALUE;  // 存储 j 右侧的最小值

            // 找左侧的最小值
            for (int i = 0; i < j; i++) {
                if (nums[i] < nums[j]) {
                    leftMin = Math.min(leftMin, nums[i]);
                }
            }

            // 找右侧的最小值
            for (int k = j + 1; k < n; k++) {
                if (nums[k] < nums[j]) {
                    rightMin = Math.min(rightMin, nums[k]);
                }
            }

            // 如果左右两侧都找到了符合条件的值，则计算和并尝试更新最小和
            if (leftMin != Integer.MAX_VALUE && rightMin != Integer.MAX_VALUE) {
                int currentSum = leftMin + nums[j] + rightMin;
                if (currentSum < minSum) {
                    minSum = currentSum;
                    found = true;  // 标记找到了有效的三元组
                }
            }
        }

        // 根据是否找到有效的三元组返回结果
        return found ? minSum : -1;
    }

}
