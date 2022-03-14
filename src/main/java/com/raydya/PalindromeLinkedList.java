package com.raydya;

import com.raydya.data.type.ListNode;

public class PalindromeLinkedList {
//    public boolean isPalindrome(ListNode head) {
//        ListNode holder = head;
//        List<Integer> l = new ArrayList<>();
//
//        while (holder != null) {
//            l.add(holder.val);
//            holder = holder.next;
//        }
//
//        for (int i = 0; i < l.size(); i++) {
//            final Integer a = l.get(i);
//            final int i1 = l.size() - i - 1;
//            final Integer b = l.get(i1);
//
//            if (i >= i1) break;
//
//            if (!a.equals(b)) return false;
//        }
//
//        return true;
//    }

    public boolean isPalindrome(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        if (fast != null) {
            slow = slow.next;
        }

        ListNode right = reverse(slow);
        ListNode left = head;

        while (right != null) {
            if (left.val != right.val) {
                return false;
            }

            right = right.next;
            left = left.next;
        }

        return true;
    }

    private ListNode reverse(ListNode head) {
        ListNode prev = null;

        while (head != null) {
            final ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }

        return prev;
    }
}
