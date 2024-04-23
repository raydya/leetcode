package com.raydya;

public class GrumpyBookstoreOwner {

    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int satisfied = 0;
        int maxSatisfied = 0;
        int total = 0;

        for (int i = 0; i < customers.length; i++) {
            if (grumpy[i] == 0) {
                satisfied += customers[i];
            }
        }

        for (int i = 0; i < minutes; i++) {
            if (grumpy[i] == 1) {
                total += customers[i];
            }
        }

        maxSatisfied = satisfied + total;

        for (int i = minutes; i < customers.length; i++) {
            if (grumpy[i] == 1) {
                total += customers[i];
            }

            if (grumpy[i - minutes] == 1) {
                total -= customers[i - minutes];
            }

            maxSatisfied = Math.max(maxSatisfied, satisfied + total);
        }

        return maxSatisfied;
    }

}
