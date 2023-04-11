package com.raydya;

import java.util.ArrayList;
import java.util.List;

public class CheckIfBinaryStringHasAtMostOneSegmentOfOnes {

    public boolean checkOneSegment(String s) {
        final List<String> h = new ArrayList<>();
        StringBuilder t = new StringBuilder();
        t.append(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            final char c = s.charAt(i);
            if (c == '1') {
                t.append(c);
            } else {
                if (!t.toString().equals("")) {
                    h.add(t.toString());
                    t = new StringBuilder();
                }
            }
        }

        if (!t.toString().equals("")) {
            h.add(t.toString());
        }

        return h.isEmpty() || h.size() == 1;
    }

}
