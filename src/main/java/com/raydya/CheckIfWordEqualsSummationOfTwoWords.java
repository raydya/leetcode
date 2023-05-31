package com.raydya;

public class CheckIfWordEqualsSummationOfTwoWords {

    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        final int fs = getSum(firstWord);
        final int ss = getSum(secondWord);
        final int ts = getSum(targetWord);
        return fs + ss == ts;
    }

    private int getSum(String word) {
        final StringBuilder fb = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            final char c = word.charAt(i);
            fb.append(c - 'a');
        }
        return Integer.parseInt(fb.toString());
    }

}
