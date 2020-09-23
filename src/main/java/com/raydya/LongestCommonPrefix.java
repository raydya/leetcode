package com.raydya;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        String tmp = null;

        for (final String str : strs) {
            if (tmp == null) {
                tmp = str;
            } else {
                int index = -1;
                String substr = str;

                do {
                    index = tmp.indexOf(substr);
                    if (index != 0) {
                        substr = substr.substring(0, substr.length() - 1);
                    }
                } while (index == -1 && !"".equals(substr));

                tmp = substr;
            }
        }

        return tmp == null ? "" : tmp;
    }
}
