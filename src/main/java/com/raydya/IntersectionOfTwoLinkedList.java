package com.raydya;

import com.raydya.data.type.ListNode;

public class IntersectionOfTwoLinkedList {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == headB) return headA;

        ListNode tmpA = headA;
        ListNode tmpB = headB;

        while (tmpA != null) {
            while (tmpB != null) {
                if (tmpA.next == tmpB.next || tmpA.next == tmpB) {
                    return tmpA.next;
                }
                if (tmpA == tmpB.next) {
                    return tmpA;
                }
                tmpB = tmpB.next;
            }
            tmpA = tmpA.next;
            tmpB = headB;
        }

        return null;
    }
}
