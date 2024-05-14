package com.raydya;

import java.util.HashMap;
import java.util.Map;

public class MinimumRoundsToCompleteAllTasks {

    public int minimumRounds(int[] tasks) {
        Map<Integer, Integer> taskCounts = new HashMap<>();

        // 统计每个难度级别的任务数量
        for (int task : tasks) {
            taskCounts.put(task, taskCounts.getOrDefault(task, 0) + 1);
        }

        int rounds = 0;

        for (int count : taskCounts.values()) {
            if (count == 1) {
                // 如果某个难度级别的任务只有1个，则无法完成所有任务
                return -1;
            }

            // 通过判断任务数量来决定完成的轮数
            rounds += (count + 2) / 3;
        }

        return rounds;
    }

}
