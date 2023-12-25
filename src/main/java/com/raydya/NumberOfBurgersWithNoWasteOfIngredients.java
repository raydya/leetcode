package com.raydya;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberOfBurgersWithNoWasteOfIngredients {

    public List<Integer> numOfBurgers(int tomatoSlices, int cheeseSlices) {
        final int x = tomatoSlices - 2 * cheeseSlices;
        if (x < 0 || x % 2 != 0) {
            return new ArrayList<>();
        }

        final int y = x / 2;
        final int z = cheeseSlices - y;

        if (z < 0) {
            return new ArrayList<>();
        }

        return Arrays.asList(y, z);
    }

}
