package com.raydya;

public class DeleteCharactersToMakeFancyString {

    public String makeFancyString(String s) {
        int pc = 1;
        char p = s.charAt(0);
        final StringBuilder sb = new StringBuilder();
        sb.append(p);
        for (int i = 1; i < s.length(); i++) {
            final char c = s.charAt(i);
            if (p == c) {
                pc++;
                if (pc < 3) {
                    sb.append(c);
                }
            } else {
                p = c;
                pc = 1;
                sb.append(c);
            }
        }

        return sb.toString();
    }

}
