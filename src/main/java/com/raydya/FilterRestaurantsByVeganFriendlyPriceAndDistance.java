package com.raydya;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterRestaurantsByVeganFriendlyPriceAndDistance {

    public List<Integer> filterRestaurants(int[][] restaurants, int veganFriendly, int maxPrice, int maxDistance) {
        Arrays.sort(restaurants, (o1, o2) -> {
            final int c1 = Integer.compare(o2[1], o1[1]);
            if (c1 == 0) {
                return Integer.compare(o2[0], o1[0]);
            }
            return c1;
        });

        final List<Integer> ret = new ArrayList<>();
        for (final int[] restaurant : restaurants) {
            if (veganFriendly == 1 && restaurant[2] == 0) {
                continue;
            }
            if (restaurant[3] > maxPrice) {
                continue;
            }
            if (restaurant[4] > maxDistance) {
                continue;
            }
            ret.add(restaurant[0]);
        }

        return ret;
    }

}
