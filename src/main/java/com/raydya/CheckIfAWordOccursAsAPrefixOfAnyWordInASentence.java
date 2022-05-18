package com.raydya;

import java.util.Objects;

public class CheckIfAWordOccursAsAPrefixOfAnyWordInASentence {

    public int isPrefixOfWord(String sentence, String searchWord) {
        final String[] words = sentence.split(" ");

        int r = -1;
        final int sl = searchWord.length();

        for (int i = 0; i < words.length; i++) {
            final String word = words[i];
            if (word.length() >= sl) {
                final String ss = word.substring(0, sl);
                if (Objects.equals(ss, searchWord)) {
                    return i + 1;
                }
            }
        }

        return r;
    }

}
