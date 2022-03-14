package com.raydya;

public class DistributeCandiesToPeople {

    public int[] distributeCandies(int candies, int num_people) {
        final int[] ret = new int[num_people];

        int cnt = 1;
        int i = 0;

        while (candies > 0) {
            final int k = Math.min(cnt, candies);
            ret[i] += k;
            candies -= k;
            cnt++;
            i++;
            if (i > num_people - 1) {
                i = 0;
            }
        }

        return ret;
    }
}
