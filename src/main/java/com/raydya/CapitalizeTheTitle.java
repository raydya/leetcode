package com.raydya;

public class CapitalizeTheTitle {

    public String capitalizeTitle(String title) {
        final String[] words = title.split(" ");
        final StringBuilder b = new StringBuilder();
        for (final String word : words) {
            final int l = word.length();
            String lowerCase = word.toLowerCase();
            if (l > 2) {
                lowerCase = lowerCase.substring(0, 1).toUpperCase() + lowerCase.substring(1);
            }
            b.append(lowerCase);
            b.append(" ");
        }

        return b.toString().trim();
    }

}
