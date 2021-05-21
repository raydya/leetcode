package com.raydya;

import java.util.Arrays;

public class JuQingChuFaShiJian {
    public int[] getTriggerTime(int[][] increase, int[][] requirements) {
        final int l = increase.length;
        //1. 累加属性值，形成一个玩家每天属性值的数组
        for (int i = 1; i < l; i++) {
            increase[i][0] += increase[i - 1][0];
            increase[i][1] += increase[i - 1][1];
            increase[i][2] += increase[i - 1][2];
        }

        final int rl = requirements.length;
        final int[] output = new int[rl];
        Arrays.fill(output, -1);

        for (int i = 0; i < rl; i++) {
            final int[] req = requirements[i];
            if (req[0] == 0 && req[1] == 0 && req[2] == 0) {
                output[i] = 0;
            } else {
                //2.2 本题的核心思想，使用二分查找算法来寻找左侧边界，找到触发剧情最小的天数。
                int left = 0;
                int right = l - 1;

                while (left <= right) {
                    int middle = left + (right - left) / 2;
                    if (increase[middle][0] < req[0] || increase[middle][1] < req[1] || increase[middle][2] < req[2]) {
                        left = middle + 1;
                    } else {
                        right = middle - 1;
                    }
                }

                if (left < l && increase[left][0] >= req[0] && increase[left][1] >= req[1] && increase[left][2] >= req[2]) {
                    output[i] = left + 1;
                }
            }
        }

        return output;
    }
}
