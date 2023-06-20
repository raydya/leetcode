package com.raydya;

public class CheckIfStringIsAPrefixOfArray {

    public boolean isPrefixString(String s, String[] words) {
        final StringBuilder sb = new StringBuilder();
        for (final String word : words) {
            sb.append(word);
            final String s1 = sb.toString();
            if (s.equals(s1)) {
                return true;
            }
        }
        return false;
    }

}
