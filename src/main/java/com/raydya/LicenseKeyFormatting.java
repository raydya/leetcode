package com.raydya;

import java.util.LinkedList;

public class LicenseKeyFormatting {
    public String licenseKeyFormatting(String s, int k) {
        s = s.toUpperCase();
        s = s.replaceAll("-", "");

        final int l = s.length();
        int r = (int) Math.ceil(l / (k + 0.0));
        int i = l;

        LinkedList<String> rets = new LinkedList<>();
        while (r > 0) {
            final String sub = s.substring(Math.max(0, i - k), i);
            rets.push(sub);
            r--;
            i = i - k;
        }

        return String.join("-", rets);
    }

    private String iterator(String s, int k) {
        s = s.toUpperCase();

        int cnt = k - 1;
        String t = "";
        String ret = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            final char c = s.charAt(i);
            if (c == '-') continue;
            t = c + t;
            if (cnt == 0 || i == 0) {
                ret = "-" + t + ret;
                t = "";
            }
            cnt--;
            if (cnt < 0) cnt = k - 1;
        }

        if (!t.isEmpty()) {
            ret = "-" + t + ret;
        }

        if (!ret.isEmpty() && ret.charAt(0) == '-') ret = ret.substring(1);

        return ret;
    }
}
