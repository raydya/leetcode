package com.raydya;

import java.util.HashSet;
import java.util.Set;

public class DistributeCandies {

    public int distributeCandies(int[] candyType) {
        final Set<Integer> set = new HashSet<>();

        for (final int t : candyType) {
            set.add(t);
        }

        return Math.min(set.size(), candyType.length / 2);
    }
}
