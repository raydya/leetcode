package com.raydya;

public class XorOperationInAnArray {

    public int xorOperation(int n, int start) {
        int ret = start;
        for (int i = 1; i < n; i++) {
            ret ^= start + 2 * i;
        }

        return ret;
    }

}
