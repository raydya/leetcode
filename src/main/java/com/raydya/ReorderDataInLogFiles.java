package com.raydya;

import java.util.ArrayList;
import java.util.List;

public class ReorderDataInLogFiles {
    public String[] reorderLogFiles(String[] logs) {
        List<String> alphabets = new ArrayList<>();
        List<String> numbers = new ArrayList<>();

        for (final String log : logs) {
            final int i = log.indexOf(' ');
            final char c = log.charAt(i + 1);
            final boolean isNumber = Character.isDigit(c);

            if (isNumber) {
                numbers.add(log);
            } else {
                alphabets.add(log);
            }
        }

        alphabets.sort((o1, o2) -> {
            final String[] s1 = split(o1);
            final String[] s2 = split(o2);
            if (s1[1].equals(s2[1])) {
                return s1[0].compareTo(s2[0]);
            }
            return s1[1].compareTo(s2[1]);
        });

        alphabets.addAll(numbers);

        return alphabets.toArray(new String[]{});
    }

    private String[] split(final String s) {
        final String[] ret = new String[2];
        final int i = s.indexOf(' ');

        ret[0] = s.substring(0, i);
        ret[1] = s.substring(i);

        return ret;
    }
}
