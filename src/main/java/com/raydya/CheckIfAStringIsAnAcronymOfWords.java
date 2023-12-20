package com.raydya;

import java.util.List;

public class CheckIfAStringIsAnAcronymOfWords {

    public boolean isAcronym(List<String> words, String s) {
        final StringBuilder sb = new StringBuilder();
        for (final String word : words) {
            sb.append(word.charAt(0));
        }

        return sb.toString().equals(s);
    }

}
