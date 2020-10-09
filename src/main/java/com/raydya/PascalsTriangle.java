package com.raydya;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PascalsTriangle {

    public List<List<Integer>> generate(int numRows) {
        List<Integer> tmp = new ArrayList<>();
        final List<List<Integer>> ret = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            if (i == 0) {
                tmp = Collections.singletonList(1);
            } else if (i == 1) {
                tmp = Arrays.asList(1, 1);
            } else {
                final List<Integer> n = new ArrayList<>();
                for (int j = 0; j <= tmp.size(); j++) {
                    final Integer a = j <= 0 ? 0 : tmp.get(j - 1);
                    final Integer b = j >= tmp.size() ? 0 : tmp.get(j);
                    n.add(a + b);
                }
                tmp = n;
            }

            ret.add(tmp);
        }

        return ret;
    }
}
