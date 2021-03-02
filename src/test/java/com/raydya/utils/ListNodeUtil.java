package com.raydya.utils;

import com.raydya.data.type.ListNode;

public class ListNodeUtil {
    public static ListNode build(int[] nums) {
        final int val = nums[0];
        final ListNode head = new ListNode(val);
        ListNode sentinel = head;

        for (int i = 1; i < nums.length; i++) {
            final int v = nums[i];
            final ListNode node = new ListNode(v);
            sentinel.next = node;
            sentinel = node;
        }

        return head;
    }
}
