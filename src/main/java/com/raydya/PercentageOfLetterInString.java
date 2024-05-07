package com.raydya;

public class PercentageOfLetterInString {

    public int percentageLetter(String s, char letter) {
        final int l = s.length();
        int count = 0;
        for (int i = 0; i < l; i++) {
            if (s.charAt(i) == letter) {
                count++;
            }
        }

        return count * 100 / l;
    }

}
