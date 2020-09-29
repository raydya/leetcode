package com.raydya;

public class Sqrt {
    public int sqrt(int x) {
        for (long i = 1; i < Integer.MAX_VALUE; i++) {
            final long i1 = i * i;

            if (i1 == x) {
                return (int) i;
            }

            if (i1 > x) {
                return (int) (i - 1);
            }
        }

        return 1;
    }
}
