package com.raydya;

public class ComplementOfBase10Integer {

    public int bitwiseComplement(int n) {
        int _n = n, mask = 1;
        while (_n != 0) {
            mask = _n & (~_n + 1);
            _n ^= mask;
        }
        return ~n & ((mask << 1) - 1);
    }
}
