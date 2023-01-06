package com.raydya;

public class ShuffleString {

    public String restoreString(String s, int[] indices) {
        final char[] chars = new char[s.length()];

        for (int i = 0; i < indices.length; i++) {
            final int j = indices[i];
            final char c = s.charAt(i);
            chars[j] = c;
        }

        return String.valueOf(chars);
    }

}
