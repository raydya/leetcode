package com.raydya;

import java.util.Objects;

public class BackspaceStringCompare {
    public boolean backspaceCompare(String s, String t) {
        final String ns = run(s);
        final String nt = run(t);

        return Objects.equals(ns, nt);
    }

    private String run(String s) {
        StringBuilder ns = new StringBuilder();
        int bsCnt = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            final char c = s.charAt(i);
            if (c == '#') {
                bsCnt++;
            } else {
                if (bsCnt > 0) {
                    bsCnt--;
                    continue;
                }
                ns.insert(0, c);
            }
        }

        return ns.toString();
    }
}
