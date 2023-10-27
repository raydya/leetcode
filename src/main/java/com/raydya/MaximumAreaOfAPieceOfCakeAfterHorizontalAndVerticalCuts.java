package com.raydya;

import java.util.Arrays;

public class MaximumAreaOfAPieceOfCakeAfterHorizontalAndVerticalCuts {

    private static final int MOD = 1000_000_007;

    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);

        long mh = Math.max(horizontalCuts[0], h - horizontalCuts[horizontalCuts.length - 1]);
        for (int i = 1; i < horizontalCuts.length; i++) {
            mh = Math.max(mh, horizontalCuts[i] - horizontalCuts[i - 1]);
        }

        long mv = Math.max(verticalCuts[0], w - verticalCuts[verticalCuts.length - 1]);
        for (int i = 1; i < verticalCuts.length; i++) {
            mv = Math.max(mv, verticalCuts[i] - verticalCuts[i - 1]);
        }

        return (int) (mh * mv % MOD);
    }

}
