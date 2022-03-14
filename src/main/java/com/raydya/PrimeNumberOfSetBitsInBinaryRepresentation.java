package com.raydya;

public class PrimeNumberOfSetBitsInBinaryRepresentation {

    public int countPrimeSetBits(int left, int right) {
        int count = 0;
        for (int i = left; i <= right; i++) {
            final int c = numberOfOne(i);
            if (isPrime(c)) {
                count++;
            }
        }

        return count;
    }

    private int numberOfOne(final int i) {
        int c = 0;
        int k = i;
        while (k != 0) {
            ++c;
            k = (k - 1) & k;
        }
        return c;
    }

    private boolean isPrime(int src) {
        double sqrt = Math.sqrt(src);
        if (src < 2) {
            return false;
        }
        if (src == 2 || src == 3) {
            return true;
        }
        if (src % 2 == 0) {// 先判断是否为偶数，若偶数就直接结束程序
            return false;
        }
        for (int i = 3; i <= sqrt; i += 2) {
            if (src % i == 0) {
                return false;
            }
        }
        return true;
    }
}
