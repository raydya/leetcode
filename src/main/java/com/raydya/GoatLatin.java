package com.raydya;

public class GoatLatin {
    public String toGoatLatin(String sentence) {
        final String[] strs = sentence.split(" ");
        for (int i = 0; i < strs.length; i++) {
            final String str = strs[i];
            if (isVowel(str)) {
                strs[i] = str + "ma";
            } else {
                strs[i] = str.substring(1) + str.charAt(0) + "ma";
            }

            String iStr = "";
            for (int j = 0; j < i + 1; j++) {
                iStr += "a";
            }
            strs[i] += iStr;
        }

        return String.join(" ", strs);
    }

    private boolean isVowel(String str) {
        final char c = str.charAt(0);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
            || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}
