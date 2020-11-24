package com.raydya;

import com.raydya.data.type.ListNode;

public class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) return null;

        final ListNode reversedHead = reverseList(head);

        if (n == 1) {
            return reverseList(reversedHead.next);
        } else {
            ListNode tmp = reversedHead;
            int cnt = 1;
            while (tmp != null) {
                if (cnt == n - 1) {
                    final ListNode tobeDeleted = tmp.next;
                    tmp.next = tobeDeleted.next;
                    break;
                } else {
                    cnt++;
                    tmp = tmp.next;
                }
            }
        }

        return reverseList(reversedHead);
    }

    private ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cursor = head;
        ListNode holder = null;

        while (cursor != null) {
            holder = cursor.next;
            cursor.next = pre;
            pre = cursor;
            cursor = holder;
        }

        return pre;
    }
}
