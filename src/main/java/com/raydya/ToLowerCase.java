package com.raydya;

public class ToLowerCase {

    private final char[] holder = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
        'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    public String toLowerCase(String s) {
        final char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            final char aChar = chars[i];
            final int offset = aChar - 'A';
            if (offset >= 0 && offset <= 25) {
                chars[i] = holder[offset];
            }
        }

        return String.valueOf(chars);
    }
}
