package com.raydya;

import java.util.Arrays;

public class MaximumAreaOfAPieceOfCakeAfterHorizontalAndVerticalCuts {

    private static final int MOD = 1000_000_007;

    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);

        final long[] hs = new long[horizontalCuts.length + 1];
        hs[0] = horizontalCuts[0];
        hs[hs.length - 1] = h - horizontalCuts[horizontalCuts.length - 1];
        for (int i = 1; i < horizontalCuts.length; i++) {
            hs[i] = horizontalCuts[i] - horizontalCuts[i - 1];
        }

        final long[] vs = new long[verticalCuts.length + 1];
        vs[0] = verticalCuts[0];
        vs[vs.length - 1] = w - verticalCuts[verticalCuts.length - 1];
        for (int i = 1; i < verticalCuts.length; i++) {
            vs[i] = verticalCuts[i] - verticalCuts[i - 1];
        }

        Arrays.sort(hs);
        Arrays.sort(vs);

        return (int) (hs[hs.length - 1] * vs[vs.length - 1] % MOD);
    }

}
