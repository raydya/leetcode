package com.raydya;

import java.util.Arrays;
import java.util.List;

public class ArithmeticSubarrays {

    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        Boolean[] ret = new Boolean[l.length];
        for (int i = 0; i < l.length; i++) {
            final int[] c = Arrays.copyOfRange(nums, l[i], r[i] + 1);
            Arrays.sort(c);
            int g = c[1] - c[0];
            ret[i] = true;
            for (int j = 1; j < c.length - 1; j++) {
                if (c[j + 1] - c[j] != g) {
                    ret[i] = false;
                    break;
                }
            }
        }

        return Arrays.asList(ret);
    }

}
