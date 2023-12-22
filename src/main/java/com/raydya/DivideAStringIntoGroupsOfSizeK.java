package com.raydya;

public class DivideAStringIntoGroupsOfSizeK {

    public String[] divideString(String s, int k, char fill) {
        final int length = s.length();
        final int mod = length % k;
        final int size = length / k + (mod == 0 ? 0 : 1);

        final String[] ret = new String[size];

        int index = 0;
        int i = 0;
        while (i < length) {
            final int end = i + k;
            final String substring = s.substring(i, Math.min(end, length));
            ret[index] = substring;
            i += k;
            index++;
        }

        if (mod != 0) {
            final int last = size - 1;
            final String lastStr = ret[last];
            final int lastStrLen = lastStr.length();
            final int diff = k - lastStrLen;
            for (int j = 0; j < diff; j++) {
                ret[last] = ret[last].concat(String.valueOf(fill));
            }
        }

        return ret;
    }

}
