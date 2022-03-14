package com.raydya;

public class XiaoZhangShuaTiJiHua {

    public int minTime(int[] time, int m) {
        int len = time.length, lt = Integer.MAX_VALUE, rt = 0, mid, res = 0;
        if (m >= len) {
            return 0;
        }
        for (int i = 0; i < len; i++) {
            lt = Math.min(lt, time[i]);
            rt += time[i];
        }
        while (lt <= rt) {
            mid = (lt + rt) >> 1;
            if (check(time, len, mid, m)) { // 切割得多了，调大下界
                lt = mid + 1;
            } else { // 切割得可能少了，调小上界
                rt = mid - 1;
                res = mid; // 同时记录夹逼值
            }
        }
        return res;
    }

    private boolean check(int[] time, int len, int limit, int m) {
        int cnt = 1, sum = time[0], maxVal = time[0]; // 初始化为1，且当前子数组最大值初始化为第一个元素
        for (int i = 1; i < len; i++) { // 从第二个元素开始遍历
            sum += time[i];
            maxVal = Math.max(maxVal, time[i]);
            if (sum - maxVal > limit) { // 划分 第 cnt + 1 个子数组（新的子数组的第一个元素）
                cnt++;
                maxVal = sum = time[i];
            }
            if (cnt > m) // 当划分的子数组个数超过m时，直接返回true
            {
                return true;
            }
        }
        return false; // 找到一种可能的分割方案
    }
}
