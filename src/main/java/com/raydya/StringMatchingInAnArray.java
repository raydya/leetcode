package com.raydya;

import java.util.ArrayList;
import java.util.List;

public class StringMatchingInAnArray {

    public List<String> stringMatching(String[] words) {
        final List<String> ret = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            String w1 = words[i];
            for (int j = 0; j < words.length; j++) {
                if (i == j) {
                    continue;
                }
                String w2 = words[j];
                if (w2.contains(w1)) {
                    ret.add(w1);
                    break;
                }
            }
        }
        return ret;
    }
}
