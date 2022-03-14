package com.raydya;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PositionsOfLargeGroups {

    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> ret = new ArrayList<>();
        char p = s.charAt(0);
        int cnt = 1;
        for (int i = 1; i < s.length(); i++) {
            final char c = s.charAt(i);
            if (c == p) {
                cnt++;
                if (i == s.length() - 1 && cnt >= 3) {
                    final List<Integer> t = Arrays.asList(i - cnt + 1, i);
                    ret.add(t);
                }
            } else {
                if (cnt >= 3) {
                    final List<Integer> t = Arrays.asList(i - cnt, i - 1);
                    ret.add(t);
                }
                p = c;
                cnt = 1;
            }
        }

        return ret;
    }
}
