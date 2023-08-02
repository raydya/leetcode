package com.raydya;

import java.util.HashSet;
import java.util.Set;

public class CardFlippingGame {

    public int flipgame(int[] fronts, int[] backs) {
        final Set<Integer> impossibles = new HashSet<>();
        for (int i = 0; i < fronts.length; i++) {
            if (fronts[i] == backs[i]) {
                impossibles.add(fronts[i]);
            }
        }

        int k = Integer.MAX_VALUE;
        for (final int front : fronts) {
            if (!impossibles.contains(front)) {
                k = Math.min(k, front);
            }
        }
        for (final int back : backs) {
            if (!impossibles.contains(back)) {
                k = Math.min(k, back);
            }
        }

        return k == Integer.MAX_VALUE ? 0 : k;
    }

}
