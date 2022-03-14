package com.raydya;

public class BottleCost {

    public int consume(int dollar) {
        final int initBottle = dollar / 2;
        int total = initBottle;
        int bottleLeft = initBottle;
        int capLeft = initBottle;

        while (bottleLeft >= 2 || capLeft >= 4) {
            final int k = bottleLeft / 2;
            total += k;
            bottleLeft = bottleLeft % 2 + k;
            capLeft += k;

            final int j = capLeft / 4;
            total += j;
            capLeft = capLeft % 4 + j;
            bottleLeft += j;
        }

        return total;
    }

}
