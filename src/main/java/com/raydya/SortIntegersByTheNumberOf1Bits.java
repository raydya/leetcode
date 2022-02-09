package com.raydya;

import java.util.Arrays;
import java.util.Comparator;

public class SortIntegersByTheNumberOf1Bits {
    public int[] sortByBits(int[] arr) {
        return Arrays.stream(arr).boxed().sorted(Comparator.comparingInt(Integer::bitCount).thenComparingInt(a -> a))
                     .mapToInt(Integer::intValue).toArray();
    }
}
