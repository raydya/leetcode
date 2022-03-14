package com.raydya;

import java.util.HashMap;
import java.util.Map;

public class GoatLatin {

    public String toGoatLatin(String sentence) {
        final String[] strs = sentence.split(" ");

        Map<Integer, String> ruleThree = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            ruleThree.put(i, ruleThree.getOrDefault(i - 1, "") + "a");
        }

        for (int i = 0; i < strs.length; i++) {
            final String str = strs[i];
            if (isVowel(str)) {
                strs[i] = str + "ma";
            } else {
                strs[i] = str.substring(1) + str.charAt(0) + "ma";
            }

            strs[i] += ruleThree.get(i);
        }

        return String.join(" ", strs);
    }

    private boolean isVowel(String str) {
        final char c = str.charAt(0);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
            || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}
