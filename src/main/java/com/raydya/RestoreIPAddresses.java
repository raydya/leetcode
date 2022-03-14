package com.raydya;

import java.util.LinkedList;
import java.util.List;

public class RestoreIPAddresses {

    public List<String> restoreIpAddresses(String s) {
        List<String> ret = new LinkedList<>();
        int[] path = new int[4];
        backtrace(ret, s, 0, path, 0);
        return ret;
    }

    private void backtrace(List<String> acc, String s, int idx, int[] path, int segment) {
        if (segment == 4 && idx == s.length()) {
            acc.add(path[0] + "." + path[1] + "." + path[2] + "." + path[3]);
            return;
        } else if (segment == 4 || idx == s.length()) {
            return;
        }

        for (int len = 1; len <= 3 && idx + len <= s.length(); len++) {
            int val = Integer.parseInt(s.substring(idx, idx + len));
            // range check, no leading 0.
            if (val > 255 || len >= 2 && s.charAt(idx) == '0') {
                break;
            }

            path[segment] = val;
            backtrace(acc, s, idx + len, path, segment + 1);
            path[segment] = -1; // for debug.
        }
    }
}
