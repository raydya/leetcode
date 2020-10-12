package com.raydya;

import com.raydya.data.type.ListNode;

public class IntersectionOfTwoLinkedList {
//    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//        if (headA == headB) return headA;
//
//        ListNode tmpA = headA;
//        ListNode tmpB = headB;
//
//        while (tmpA != null) {
//            while (tmpB != null) {
//                if (tmpA.next == tmpB.next || tmpA.next == tmpB) {
//                    return tmpA.next;
//                }
//                if (tmpA == tmpB.next) {
//                    return tmpA;
//                }
//                tmpB = tmpB.next;
//            }
//            tmpA = tmpA.next;
//            tmpB = headB;
//        }
//
//        return null;
//    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == headB) return headA;

        if (headA == null || headB == null) return null;

        ListNode tmpA = headA;
        ListNode tmpB = headB;
        ListNode lA = null;
        ListNode lB = null;

        do {
            if (tmpA == tmpB) return tmpA;

            if (tmpA.next == null) {
                if (lA == null) lA = tmpA;
                tmpA = headB;
            } else {
                tmpA = tmpA.next;
            }

            if (tmpB.next == null) {
                if (lB == null) lB = tmpB;
                tmpB = headA;
            } else {
                tmpB = tmpB.next;
            }

        } while (lA == null || lB == null || lA == lB);

        return null;
    }
}
