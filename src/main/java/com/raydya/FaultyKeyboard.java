package com.raydya;

public class FaultyKeyboard {

    public String finalString(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            final char c = s.charAt(i);
            if (c == 'i') {
                sb.reverse();
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }

}
