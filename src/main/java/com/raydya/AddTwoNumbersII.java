package com.raydya;

import com.raydya.data.type.ListNode;

public class AddTwoNumbersII {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        final String n1 = getNumberString(l1);
        final String n2 = getNumberString(l2);

        final int lt1 = n1.length();
        final int lt2 = n2.length();
        final int k = Math.max(lt1, lt2);

        final StringBuilder sb = new StringBuilder();
        int p = 0;
        for (int i = k - 1; i >= 0; i--) {
            final int k1 = i - (k - lt1);
            final int k2 = i - (k - lt2);

            final int v1 = k1 >= 0 ? n1.charAt(k1) - '0' : 0;
            final int v2 = k2 >= 0 ? n2.charAt(k2) - '0' : 0;

            int v = v1 + v2 + p;
            p = 0;
            if (v >= 10) {
                v -= 10;
                p++;
            }
            sb.insert(0, v);
        }

        if (p != 0) {
            sb.insert(0, p);
        }

        final ListNode f = new ListNode();
        ListNode t = f;
        final String s = sb.toString();
        for (int i = 0; i < s.length(); i++) {
            final char c = s.charAt(i);
            final int v = c - '0';
            t.val = v;
            if (i != s.length() - 1) {
                t.next = new ListNode();
                t = t.next;
            }
        }

        return f;
    }

    private String getNumberString(ListNode node) {
        final StringBuilder sb = new StringBuilder();
        ListNode t1 = node;
        while (t1 != null) {
            sb.append(t1.val);
            t1 = t1.next;
        }
        return sb.toString();
    }

}
