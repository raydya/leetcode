package com.raydya;

public class CanPlaceFlowers {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int plant = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            final int f = flowerbed[i];
            if (f == 0) {
                if ((i - 1 < 0 || flowerbed[i - 1] == 0)
                    && (i + 1 > flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                    flowerbed[i] = 1;
                    plant++;
                }
            }
        }

        return plant >= n;
    }
}
