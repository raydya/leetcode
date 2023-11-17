package com.raydya;

public class ANumberAfterADoubleReversal {

    public boolean isSameAfterReversals(int num) {
        final String s = String.valueOf(num);
        final String reverse = new StringBuilder(s).reverse().toString();
        final int i = Integer.parseInt(reverse);
        final String reverse2 = new StringBuilder(String.valueOf(i)).reverse().toString();
        final int i1 = Integer.parseInt(reverse2);
        return i1 == num;
    }

}
