package com.raydya;

import java.util.List;

public class BeautifulTowersI {

    public long maximumSumOfHeights(List<Integer> maxHeights) {
        final int n = maxHeights.size();

        long max = 0;
        for (int i = 0; i < n; i++) {
            final Integer peak = maxHeights.get(i);
            long tm = peak;

            int lp = peak;
            for (int j = i - 1; j >= 0; j--) {
                final Integer t = maxHeights.get(j);
                final int pk = Math.min(lp, t);
                tm += pk;
                lp = pk;
            }

            int rp = peak;
            for (int j = i + 1; j < n; j++) {
                final Integer t = maxHeights.get(j);
                final int pk = Math.min(rp, t);
                tm += pk;
                rp = pk;
            }
            max = Math.max(max, tm);
        }

        return max;
    }

}
