package com.raydya;

public class DecodeXoredArray {

    /**
     * text ^ key = cipherText
     * <p>
     * text ^ key ^ key = cipherText ^ key
     * <p>
     * text ^ 0 = cipherText ^ key
     * <p>
     * text = cipherText ^ key
     */
    public int[] decode(int[] encoded, int first) {
        final int[] arr = new int[encoded.length + 1];
        arr[0] = first;

        for (int i = 0; i < arr.length - 1; i++) {
            arr[i + 1] = encoded[i] ^ arr[i];
        }

        return arr;
    }

}
