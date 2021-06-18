package com.raydya;

public class DetectCapital {
    public boolean detectCapitalUse(String word) {
        if (Character.isUpperCase(word.charAt(0))) {
            if (word.equals(word.toUpperCase())) return true;
            final String substring = word.substring(1);
            return substring.equals(substring.toLowerCase());
        }
        return word.equals(word.toLowerCase());
    }
}
