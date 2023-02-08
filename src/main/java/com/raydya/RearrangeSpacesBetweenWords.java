package com.raydya;

import java.util.ArrayList;
import java.util.List;

public class RearrangeSpacesBetweenWords {

    public String recordSpaces(String text) {
        List<String> words = new ArrayList<>();

        StringBuilder word = new StringBuilder();
        int sCnt = 0;
        for (int i = 0; i < text.length(); i++) {
            final char c = text.charAt(i);
            if (c == ' ') {
                sCnt++;
                if (word.length() != 0) {
                    words.add(word.toString());
                }
                word = new StringBuilder();
            } else {
                word.append(c);
            }
        }

        if (word.length() != 0) {
            words.add(word.toString());
        }

        final int k = words.size() - 1;
        final int m = k == 0 ? 0 : sCnt / k;
        final int n = k == 0 ? sCnt : sCnt % k;

        StringBuilder r = new StringBuilder();

        for (int i = 0; i < words.size(); i++) {
            r.append(words.get(i));
            if (i == k) {
                continue;
            }
            for (int j = 0; j < m; j++) {
                r.append(' ');
            }
        }
        for (int i = 0; i < n; i++) {
            r.append(' ');
        }
        return r.toString();
    }

}
