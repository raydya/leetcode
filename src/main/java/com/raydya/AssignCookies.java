package com.raydya;

import java.util.Arrays;

public class AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        int a = 0, b = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        while (a < g.length && b < s.length) {
            if (g[a] <= s[b]) a++;
            b++;
        }
        return a;
    }
}
