package com.raydya;

import java.util.ArrayList;
import java.util.List;

public class MaximumSplitOfPositiveEvenIntegers {

    public List<Long> maximumEvenSplit(long finalSum) {
        final long r = finalSum % 2;
        if (r != 0) {
            return new ArrayList<>();
        }

        final List<Long> h = new ArrayList<>();
        for (long i = 2L; i <= finalSum; i += 2) {
            h.add(i);
            finalSum -= i;
        }

        h.set(h.size() - 1, h.get(h.size() - 1) + finalSum);

        return h;
    }

}
