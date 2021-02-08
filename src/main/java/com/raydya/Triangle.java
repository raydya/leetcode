package com.raydya;

import java.util.List;

public class Triangle {
    public int minimumTotal(List<List<Integer>> triangle) {
        for (int i = triangle.size() - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                final List<Integer> r1 = triangle.get(i);
                final List<Integer> r2 = triangle.get(i + 1);
                final Integer a = r2.get(j);
                final Integer b = r2.get(j + 1);
                final Integer c = r1.get(j);
                r1.set(j, c + Math.min(a, b));
            }
        }
        return triangle.get(0).get(0);
    }

}
