package com.raydya;

import java.util.ArrayList;
import java.util.List;

public class RemoveComments {

    public List<String> removeComments(String[] source) {
        final List<String> ret = new ArrayList<>();
        boolean isComment = false;
        final StringBuilder b = new StringBuilder();
        for (String s : source) {
            b.append(s);
            b.append("\n");
        }

        final String s = b.toString();
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            final char c = s.charAt(i);
            if (c == '/' && i + 1 < s.length() && s.charAt(i + 1) == '/' && !isComment) {
                while (true) {
                    i++;
                    if (i >= s.length()) {
                        break;
                    }
                    final char c1 = s.charAt(i);
                    if (c1 == '\n') {
                        sb.append("\n");
                        break;
                    }
                }
            } else if (c == '/' && i + 1 < s.length() && s.charAt(i + 1) == '*' && !isComment) {
                isComment = true;
                i++;
            } else if (c == '*' && i + 1 < s.length() && s.charAt(i + 1) == '/' && isComment) {
                isComment = false;
                i++;
            } else if (!isComment) {
                sb.append(c);
            }
        }

        final String k = sb.toString();
        final String[] split = k.split("\n");

        for (final String s1 : split) {
            if (!s1.isEmpty()) {
                ret.add(s1);
            }
        }

        return ret;
    }

}
