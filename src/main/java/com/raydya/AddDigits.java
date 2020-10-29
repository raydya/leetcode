package com.raydya;

public class AddDigits {
    // https://en.wikipedia.org/wiki/Digital_root
    public int addDigits(int num) {
        return num == 0 ? 0 : 1 + (num - 1) % 9;
    }
}
