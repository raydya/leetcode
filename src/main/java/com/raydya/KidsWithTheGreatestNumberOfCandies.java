package com.raydya;

import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        final List<Boolean> ret = new ArrayList<>();

        int max = 0;
        for (final int candy : candies) {
            max = Math.max(candy, max);
        }

        for (final int candy : candies) {
            final boolean b = (candy + extraCandies) >= max;
            ret.add(b);
        }

        return ret;
    }

}
