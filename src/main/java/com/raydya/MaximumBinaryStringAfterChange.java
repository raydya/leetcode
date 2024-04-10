package com.raydya;

public class MaximumBinaryStringAfterChange {

    public String maximumBinaryString(String binary) {
        int len = binary.length();
        StringBuilder sb = new StringBuilder();
        int index = 0;
        while (index < len && binary.charAt(index) == '1') {
            sb.append(1);
            index++;
        }
        int cntZero = 0, cntOne = 0;
        for (int i = index; i < len; i++) {
            if (binary.charAt(i) == '0') {
                cntZero++;
            } else {
                cntOne++;
            }
        }
        for (int i = 0; i < cntZero; i++) {
            if (i == cntZero - 1) {
                sb.append(0);
            } else {
                sb.append(1);
            }
        }
        for (int i = 0; i < cntOne; i++) {
            sb.append(1);
        }
        return sb.toString();
    }

}
