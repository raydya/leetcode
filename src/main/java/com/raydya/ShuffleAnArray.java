package com.raydya;

import java.util.Random;

public class ShuffleAnArray {

    Random rand = new Random();
    private int[] array;
    private int[] original;

    public ShuffleAnArray(int[] nums) {
        array = nums;
        original = nums.clone();
    }

    private int randRange(int min, int max) {
        return rand.nextInt(max - min) + min;
    }

    private void swapAt(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public int[] reset() {
        array = original;
        original = original.clone();
        return original;
    }

    public int[] shuffle() {
        for (int i = 0; i < array.length; i++) {
            swapAt(i, randRange(i, array.length));
        }
        return array;
    }
}
