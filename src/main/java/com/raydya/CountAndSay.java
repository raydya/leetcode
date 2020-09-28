package com.raydya;

public class CountAndSay {
    public String countAndSay(int n) {
        if (n == 1) return "1";

        final String lastTerm = countAndSay(n - 1);

        return say(lastTerm);
    }

    private String say(final String term) {
        if (term.length() == 1) {
            return "1".concat(term);
        }

        char cs = 'C';
        int cnt = 0;
        String newTerm = "";

        for (int i = 0; i < term.length(); i++) {
            final char charAt = term.charAt(i);

            if (cs == 'C') cs = charAt;

            if (charAt == cs) {
                cnt++;
            }

            if (i + 1 < term.length() && term.charAt(i + 1) == charAt) {
                continue;
            }

            final String tmpTerm = Integer.toString(cnt).concat(Character.toString(cs));
            newTerm = newTerm.concat(tmpTerm);
            cs = 'C';
            cnt = 0;
        }

        return newTerm;
    }
}
