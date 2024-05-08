package com.raydya;

public class WateringPlants {

    public int wateringPlants(int[] plants, int capacity) {
        int steps = 0;
        int currentCapacity = capacity;

        for (int i = 0; i < plants.length; i++) {
            // 如果当前水量不足以浇当前植物，需要回到河边重新装水
            if (currentCapacity < plants[i]) {
                // 返回河边，步数是当前位置的两倍（往返）
                steps += i * 2;
                // 重新装满水罐
                currentCapacity = capacity;
            }

            // 浇水给当前植物
            currentCapacity -= plants[i];
            // 移动到下一株植物或完成最后一株后离开
            steps++;
        }

        return steps;
    }

}
