package com.raydya;

import java.util.LinkedList;

public class DecodeString {
    public String decodeString(String s) {
        String res = "";
        int multi = 0;

        LinkedList<Integer> multiStack = new LinkedList<>();
        LinkedList<String> resStack = new LinkedList<>();

        for (int i = 0; i < s.length(); i++) {
            final char c = s.charAt(i);
            if (c == '[') {
                multiStack.addLast(multi);
                resStack.addLast(res);
                multi = 0;
                res = "";
            } else if (c == ']') {
                String tmp = "";
                final Integer multiCur = multiStack.removeLast();
                for (int j = 0; j < multiCur; j++) {
                    tmp += res;
                }
                res = resStack.removeLast() + tmp;
            } else if (c >= '0' && c <= '9') {
                multi = multi * 10 + Integer.parseInt(c + "");
            } else {
                res += c;
            }
        }

        return res;
    }
}
