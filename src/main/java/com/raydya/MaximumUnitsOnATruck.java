package com.raydya;

import java.util.Arrays;
import java.util.Comparator;

public class MaximumUnitsOnATruck {

    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Comparator<int[]> comp = Comparator.comparingInt(a -> a[1]);
        Arrays.sort(boxTypes, comp);

        int r = 0;
        for (int i = boxTypes.length - 1; i >= 0; i--) {
            if (truckSize <= 0) {
                break;
            }
            final int[] boxType = boxTypes[i];
            final int n = boxType[0];
            final int v = boxType[1];
            if (truckSize >= n) {
                truckSize -= n;
                r += n * v;
            } else {
                r += truckSize * v;
                truckSize = 0;
            }
        }

        return r;
    }

}
