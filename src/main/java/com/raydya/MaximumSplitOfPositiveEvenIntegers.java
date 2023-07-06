package com.raydya;

import java.util.ArrayList;
import java.util.List;

public class MaximumSplitOfPositiveEvenIntegers {

    public List<Long> maximumEvenSplit(long finalSum) {
        final long r = finalSum % 2;
        if (r != 0) {
            return new ArrayList<>();
        }

        long k = 0;
        int i = 1;
        final List<Long> h = new ArrayList<>();
        while (k < finalSum) {
            final long n = i * 2L;
            if (k + n > finalSum) {
                break;
            }
            h.add(n);
            k += n;
            i++;
        }

        final long d = finalSum - k;
        h.set(h.size() - 1, h.get(h.size() - 1) + d);

        return h;
    }

}
