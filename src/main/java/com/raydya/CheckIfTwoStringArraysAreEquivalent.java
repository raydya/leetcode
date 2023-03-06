package com.raydya;

import java.util.Objects;

public class CheckIfTwoStringArraysAreEquivalent {

    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        final StringBuilder b1 = new StringBuilder();
        for (final String s : word1) {
            b1.append(s);
        }
        final String s1 = b1.toString();

        final StringBuilder b2 = new StringBuilder();
        for (final String s : word2) {
            b2.append(s);
        }
        final String s2 = b2.toString();

        return Objects.equals(s1, s2);
    }

}
