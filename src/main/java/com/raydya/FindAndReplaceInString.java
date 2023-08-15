package com.raydya;

public class FindAndReplaceInString {

    public String findReplaceString(String s, int[] indices, String[] sources, String[] targets) {
        final String[] strs = new String[s.length()];
        for (int i = 0; i < s.length(); i++) {
            strs[i] = String.valueOf(s.charAt(i));
        }

        for (int i = 0; i < indices.length; i++) {
            final int index = indices[i];
            final String source = sources[i];
            final String target = targets[i];

            final int tl = index + source.length();
            final int l = Math.min(tl, s.length());
            final String substring = s.substring(index, l);
            if (substring.equals(source)) {
                strs[index] = target;
                for (int j = 1; j < source.length(); j++) {
                    strs[index + j] = null;
                }
            } else {
                strs[index] = String.valueOf(s.charAt(index));
            }
        }

        final StringBuilder sb = new StringBuilder();

        for (final String str : strs) {
            if (str != null) {
                sb.append(str);
            }
        }

        return sb.toString();
    }
}
