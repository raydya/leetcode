package com.raydya;

public class ReverseString {
//    public void reverseString(char[] s) {
//        int i = 0;
//        while (i < s.length / 2) {
//            final char l = s[i];
//            final char r = s[s.length - 1 - i];
//            s[i] = r;
//            s[s.length - 1 - i] = l;
//            i++;
//        }
//    }

    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            final char c = s[left];
            s[left++] = s[right];
            s[right--] = c;
        }
    }
}
