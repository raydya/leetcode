package com.raydya;

public class FairCandySwap {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int at = 0;
        int bt = 0;

        for (final int aliceSize : aliceSizes) {
            at += aliceSize;
        }

        for (final int bobSize : bobSizes) {
            bt += bobSize;
        }

        final int m = (at + bt) / 2;

        for (final int aliceSize : aliceSizes) {
            for (final int bobSize : bobSizes) {
                if (at - aliceSize + bobSize == m) {
                    return new int[]{aliceSize, bobSize};
                }
            }
        }

        return new int[]{};
    }
}
