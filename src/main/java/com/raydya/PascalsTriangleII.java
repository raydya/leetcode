package com.raydya;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PascalsTriangleII {
    public List<Integer> getRow(Integer rowIndex) {
        if (rowIndex == 0) return Collections.singletonList(1);

        final List<Integer> pre = getRow(rowIndex - 1);

        final List<Integer> n = new ArrayList<>();

        for (int i = 0; i <= pre.size(); i++) {
            final Integer a = i <= 0 ? 0 : pre.get(i - 1);
            final Integer b = i >= pre.size() ? 0 : pre.get(i);
            n.add(a + b);
        }

        return n;
    }
}
