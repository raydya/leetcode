package com.raydya;

import java.util.ArrayList;
import java.util.List;

public class BinaryPrefixDivisibleBy5 {

    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> output = new ArrayList<>();

        int p = 0;
        for (final int num : nums) {
            p = 2 * p + num;
            output.add(p % 5 == 0);
            p = p % 5;
        }

        return output;
    }
}
