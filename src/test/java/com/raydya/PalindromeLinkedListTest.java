package com.raydya;

import com.raydya.data.type.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class PalindromeLinkedListTest {
    @Test
    public void test1() {
        final ListNode n1 = new ListNode(2);
        final ListNode head = new ListNode(1, n1);

        final PalindromeLinkedList solution = new PalindromeLinkedList();
        final boolean palindrome = solution.isPalindrome(head);

        Assert.assertFalse(palindrome);
    }

    @Test
    public void test2() {
        final ListNode n3 = new ListNode(1);
        final ListNode n2 = new ListNode(2, n3);
        final ListNode n1 = new ListNode(2, n2);
        final ListNode head = new ListNode(1, n1);

        final PalindromeLinkedList solution = new PalindromeLinkedList();
        final boolean palindrome = solution.isPalindrome(head);

        Assert.assertTrue(palindrome);
    }
}
