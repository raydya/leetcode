package com.raydya.ethan.math;

import java.util.Objects;

public class BruteForceCracking {

    private final char[] candidates = new char[26];
    private final String pwd;
    private long cnt;

    public BruteForceCracking(final String pwd) {
        for (int i = 0; i < candidates.length; i++) {
            candidates[i] = (char) (i + 'a');
        }
        this.pwd = pwd;
        this.cnt = 0;
    }

    public String crack() {
        return p(new char[pwd.length()], 0);
    }

    private String p(final char[] chars, final int l) {
        if (l >= chars.length) {
            return String.valueOf(chars);
        }

        cnt++;

        for (char c : candidates) {
            final char[] clone = chars.clone();
            clone[l] = c;
            final String t = p(clone, l + 1);
            if (Objects.equals(t, pwd)) {
                return t;
            }
        }

        return null;
    }

}
