package com.raydya;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {
    public List<Integer> selfDividingNumbers(int left, int right) {
        final List<Integer> ret = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            final char[] chars = String.valueOf(i).toCharArray();
            if (i < 10) {
                ret.add(i);
            } else {
                boolean selfDividing = true;
                for (final char aChar : chars) {
                    if (aChar == '0' || i % (aChar - '0') != 0) {
                        selfDividing = false;
                        break;
                    }
                }
                if (selfDividing) {
                    ret.add(i);
                }
            }
        }
        return ret;
    }
}
