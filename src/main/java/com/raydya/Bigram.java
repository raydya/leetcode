package com.raydya;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Bigram {
    public String[] findOcurrences(String text, String first, String second) {
        List<String> ret = new ArrayList<>();
        final String[] s = text.split(" ");

        String s1 = s[0];
        String s2 = s[1];
        for (int i = 2; i < s.length; i++) {
            final String s3 = s[i];
            if (Objects.equals(s1, first) && Objects.equals(s2, second)) {
                ret.add(s3);
            }
            s1 = s2;
            s2 = s3;
        }

        return ret.toArray(new String[]{});
    }
}
