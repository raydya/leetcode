package com.raydya;

public class MinimumAdditionsToMakeValidString {

    public int addMinimum(String word) {
        // maintain a pointer on word and another pointer on string "abc"
        // if the two characters that are being pointed to differ, increment the answer and the pointer to the string "abc" by one

        int ans = 0;
        int i = 0;
        int j = 0;
        while (i < word.length()) {
            if (j == 3) {
                j = 0;
            }
            if (word.charAt(i) != "abc".charAt(j)) {
                ans++;
            } else {
                i++;
            }
            j++;
        }
        return ans + 3 - j;
    }

}
