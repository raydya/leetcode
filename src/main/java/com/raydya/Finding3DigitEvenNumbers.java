package com.raydya;

import java.util.HashSet;
import java.util.Set;

public class Finding3DigitEvenNumbers {

    public int[] findEvenNumbers(int[] digits) {
        Set<Integer> h = new HashSet<>();
        final int length = digits.length;
        for (int i = 0; i < length; i++) {
            final int a = digits[i];
            if (a == 0) {
                continue;
            }
            for (int j = 0; j < length; j++) {
                if (i == j) {
                    continue;
                }
                final int b = digits[j];
                for (int k = 0; k < length; k++) {
                    if (i == k || j == k) {
                        continue;
                    }
                    final int c = digits[k];
                    if (c % 2 > 0) {
                        continue;
                    }
                    h.add(a * 100 + b * 10 + c);
                    if (b > 0) {
                        h.add(b * 100 + a * 10 + c);
                    }
                }
            }
        }

        return h.stream().mapToInt(i -> i).sorted().toArray();
    }

}
