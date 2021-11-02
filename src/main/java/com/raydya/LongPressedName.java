package com.raydya;

import java.util.Objects;

public class LongPressedName {
    public boolean isLongPressedName(String name, String typed) {
        if (Objects.equals(name, typed)) return true;
        if (name.length() > typed.length()) return false;

        int i = 0;
        char p = '0';

        for (int j = 0; j < typed.length(); j++) {
            final char m = typed.charAt(j);
            if (i > name.length() - 1) {
                if (m == p) continue;
                return false;
            }
            final char n = name.charAt(i);
            if (m == n) {
                i++;
                p = n;
            } else if (m == p) {
                //
            } else {
                return false;
            }
        }

        return i == name.length();
    }
}
