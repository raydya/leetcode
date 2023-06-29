package com.raydya;

import java.util.ArrayList;
import java.util.List;

public class ReconstructA2RowBinaryMatrix {

    public List<List<Integer>> reconstructMatrix(int upper, int lower, int[] colsum) {
        final int colLen = colsum.length;
        final List<List<Integer>> h = new ArrayList<>();
        h.add(0, initList(colLen));
        h.add(1, initList(colLen));

        for (int i = 0; i < colLen; i++) {
            final int k = colsum[i];
            if (k != 2) {
                continue;
            }
            h.get(0).set(i, 1);
            upper--;
            h.get(1).set(i, 1);
            lower--;
            colsum[i] -= 2;
        }

        if (upper < 0 || lower < 0) {
            return new ArrayList<>();
        }

        for (int i = 0; i < colLen; i++) {
            final int k = colsum[i];
            if (k == 1) {
                if (upper > 0) {
                    h.get(0).set(i, 1);
                    upper--;
                    colsum[i]--;
                } else if (lower > 0) {
                    h.get(1).set(i, 1);
                    lower--;
                    colsum[i]--;
                }
            }
        }

        if (upper != 0 || lower != 0) {
            return new ArrayList<>();
        }

        for (final int k : colsum) {
            if (k > 0) {
                return new ArrayList<>();
            }
        }

        return h;
    }

    private List<Integer> initList(int len) {
        final List<Integer> r = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            r.add(i, 0);
        }
        return r;
    }

}
