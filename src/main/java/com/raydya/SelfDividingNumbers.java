package com.raydya;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {
    public List<Integer> selfDividingNumbers(int left, int right) {
        final List<Integer> ret = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (i < 10) {
                ret.add(i);
                continue;
            }
            final char[] chars = String.valueOf(i).toCharArray();
            boolean selfDividing = true;
            for (int j = chars.length - 1; j >= 0; j--) {
                final char aChar = chars[j];
                if (aChar == '0' || i % (aChar - '0') != 0) {
                    selfDividing = false;
                    break;
                }
            }
            if (selfDividing) {
                ret.add(i);
            }
        }
        return ret;
    }
}
