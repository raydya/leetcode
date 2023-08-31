package com.raydya;

public class CountVowelSubstringsOfAString {

    public int countVowelSubstrings(String word) {
        int count = 0;
        final int l = word.length();
        for (int i = 0; i < l; i++) {
            final char c = word.charAt(i);
            if (isVowel(c)) {
                int k = 0;
                int t = 0;
                for (int j = i; j < l; j++) {
                    final char c1 = word.charAt(j);
                    if (!isVowel(c1)) {
                        break;
                    }
                    switch (c1) {
                        case 'a':
                            k = k | 1;
                            break;
                        case 'e':
                            k = k | 2;
                            break;
                        case 'i':
                            k = k | 4;
                            break;
                        case 'o':
                            k = k | 8;
                            break;
                        case 'u':
                            k = k | 16;
                            break;
                        default:
                            break;
                    }
                    if (k == 31) {
                        t++;
                    }
                }
                count += t;
            }
        }

        return count;
    }

    private boolean isVowel(char c) {
        char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u'};
        for (final char vowel : vowels) {
            if (c == vowel) {
                return true;
            }
        }

        return false;
    }

}
