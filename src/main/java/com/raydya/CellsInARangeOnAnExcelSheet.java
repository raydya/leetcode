package com.raydya;

import java.util.ArrayList;
import java.util.List;

public class CellsInARangeOnAnExcelSheet {

    public List<String> cellsInRange(String s) {
        final String[] h = new String[]{
            "A", "B", "C", "D", "E", "F", "G", "H", "I", "J",
            "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T",
            "U", "V", "W", "X", "Y", "Z"
        };

        final String[] crs = s.split(":");
        final List<String> ret = new ArrayList<>();
        final int c1 = crs[0].charAt(0) - 'A';
        final int c2 = crs[1].charAt(0) - 'A';
        final int r1 = crs[0].charAt(1) - '0';
        final int r2 = crs[1].charAt(1) - '0';
        for (int i = c1; i <= c2; i++) {
            for (int j = r1; j <= r2; j++) {
                ret.add(h[i] + j);
            }
        }

        return ret;
    }

}
