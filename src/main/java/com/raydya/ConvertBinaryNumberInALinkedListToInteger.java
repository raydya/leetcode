package com.raydya;

import com.raydya.data.type.ListNode;

public class ConvertBinaryNumberInALinkedListToInteger {
    public int getDecimalValue(ListNode head) {
        StringBuilder b = new StringBuilder();
        ListNode t = head;
        while (t != null) {
            b.append(t.val);
            t = t.next;
        }
        final String s = b.toString();
        return Integer.valueOf(s, 2);
    }
}
