package com.raydya;

public class WateringPlantsII {

    public int minimumRefill(int[] plants, int capacityA, int capacityB) {
        int refills = 0;
        int currentCapacityA = capacityA;
        int currentCapacityB = capacityB;

        int left = 0;
        int right = plants.length - 1;

        while (left <= right) {
            if (left == right) {
                final int plant = plants[left];
                if (currentCapacityA > currentCapacityB || currentCapacityA == currentCapacityB) {
                    if (currentCapacityA >= plant) {
                        currentCapacityA -= plant;
                    } else {
                        refills++;
                        currentCapacityA = capacityA - plant;
                    }
                } else {
                    if (currentCapacityB >= plant) {
                        currentCapacityB -= plant;
                    } else {
                        refills++;
                        currentCapacityB = capacityB - plant;
                    }
                }
            } else {
                final int plantA = plants[left];
                final int plantB = plants[right];

                if (currentCapacityA >= plantA) {
                    currentCapacityA -= plantA;
                } else {
                    refills++;
                    currentCapacityA = capacityA - plantA;
                }

                if (currentCapacityB >= plantB) {
                    currentCapacityB -= plantB;
                } else {
                    refills++;
                    currentCapacityB = capacityB - plantB;
                }
            }
            left++;
            right--;
        }

        return refills;
    }

}
