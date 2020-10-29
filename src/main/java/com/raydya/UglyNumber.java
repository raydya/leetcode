package com.raydya;

public class UglyNumber {
//    public boolean isUgly(int num) {
//        if (num == 1) return true;
//        if (num <= 0) return false;
//
//        final List<Integer> primes = resolvePrimes(num);
//
//        primes.removeAll(Arrays.asList(2, 3, 5));
//
//        return primes.isEmpty();
//    }
//
//    private List<Integer> resolvePrimes(int num) {
//        final List<Integer> primes = new ArrayList<>();
//        int i = 2;
//        while (i <= num) {
//            if (num % i == 0) {
//                primes.add(i);
//                num = num / i;
//                i = 2;
//            } else {
//                i++;
//            }
//        }
//
//        return primes;
//    }

    public boolean isUgly(int num) {
        if (num < 1) {
            return false;
        }
        while (num % 2 == 0) {
            num = num / 2;
        }
        while (num % 5 == 0) {
            num = num / 5;
        }
        while (num % 3 == 0) {
            num = num / 3;
        }
        return num == 1;
    }
}
