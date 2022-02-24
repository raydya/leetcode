package com.raydya;

public class IncreasingDecreasingString {

  public String sortString(String s) {
    final int[] h = new int[26];
    for (int i = 0; i < s.length(); i++) {
      final char c = s.charAt(i);
      final int k = c - 'a';
      h[k]++;
    }

    boolean left = true;
    final StringBuilder b = new StringBuilder();
    while (left) {
      left = false;

      for (int i = 0; i < 26; i++) {
        final int k = h[i];
        if (k > 0) {
          h[i]--;
          b.append((char) (i + 'a'));
        }
        if (h[i] > 0) {
          left = true;
        }
      }

      for (int i = 25; i >= 0; i--) {
        final int k = h[i];
        if (k > 0) {
          h[i]--;
          b.append((char) (i + 'a'));
        }

        if (h[i] > 0) {
          left = true;
        }
      }
    }

    return b.toString();
  }

}
