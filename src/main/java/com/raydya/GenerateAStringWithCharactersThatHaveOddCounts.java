package com.raydya;

public class GenerateAStringWithCharactersThatHaveOddCounts {

    public String generateTheString(int n) {
        final StringBuilder b = new StringBuilder();
        for (int i = 0; i < n - 1; i++) {
            b.append('a');
        }
        if (n % 2 == 0) {
            b.append('b');
            return b.toString();
        }
        b.append('a');
        return b.toString();
    }

}
