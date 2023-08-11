package com.raydya;

public class NumberOfValidWordsInASentence {

    public int countValidWords(String sentence) {
        int c = 0;
        final String[] words = sentence.split(" ");
        for (final String word : words) {
            if (isValid(word)) {
                c++;
            }
        }
        return c;
    }

    private boolean isValid(String word) {
        if (word.isEmpty()) {
            return false;
        }
        final char[] chars = word.toCharArray();
        final char fChar = chars[0];
        if (word.length() == 1) {
            return Character.isAlphabetic(fChar) || fChar == '.' || fChar == '!' || fChar == '?' || fChar == ',';
        }
        if (!Character.isAlphabetic(fChar)) {
            return false;
        }
        int dashCount = 0;
        for (int i = 1; i < chars.length - 1; i++) {
            final char aChar = chars[i];
            if (Character.isDigit(aChar)) {
                return false;
            }
            if (aChar == '-') {
                dashCount++;
                if (!Character.isAlphabetic(chars[i + 1]) || !Character.isAlphabetic(chars[i - 1])) {
                    return false;
                }
            }

            if (aChar == '.' || aChar == '!' || aChar == '?' || aChar == ',') {
                return false;
            }
        }
        if (dashCount > 1) {
            return false;
        }
        final char lChar = chars[word.length() - 1];
        return Character.isAlphabetic(lChar) || lChar == '.' || lChar == '!' || lChar == '?' || lChar == ',';
    }

}
