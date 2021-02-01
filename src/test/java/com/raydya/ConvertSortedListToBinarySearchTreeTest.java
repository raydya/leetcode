package com.raydya;

import com.raydya.data.type.ListNode;
import com.raydya.data.type.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class ConvertSortedListToBinarySearchTreeTest {
    @Test
    public void test1() {
        ListNode n4 = new ListNode(9);
        ListNode n3 = new ListNode(5, n4);
        ListNode n2 = new ListNode(0, n3);
        ListNode n1 = new ListNode(-3, n2);
        ListNode head = new ListNode(-10, n1);

        final ConvertSortedListToBinarySearchTree solution = new ConvertSortedListToBinarySearchTree();
        final TreeNode root = solution.sortedListToBST(head);

        Assert.assertEquals(0, root.val);
        Assert.assertEquals(-3, root.left.val);
        Assert.assertEquals(9, root.right.val);
        Assert.assertEquals(-10, root.left.left.val);
        Assert.assertNull(root.left.right);
        Assert.assertEquals(5, root.right.left.val);
    }

    @Test
    public void test2() {
        final ConvertSortedListToBinarySearchTree solution = new ConvertSortedListToBinarySearchTree();
        final TreeNode root = solution.sortedListToBST(null);

        Assert.assertNull(root);
    }

    @Test
    public void test3() {
        ListNode head = new ListNode(0);

        final ConvertSortedListToBinarySearchTree solution = new ConvertSortedListToBinarySearchTree();
        final TreeNode root = solution.sortedListToBST(head);

        Assert.assertEquals(0, root.val);
    }

    @Test
    public void test4() {
        ListNode tail = new ListNode(3);
        ListNode head = new ListNode(1, tail);

        final ConvertSortedListToBinarySearchTree solution = new ConvertSortedListToBinarySearchTree();
        final TreeNode root = solution.sortedListToBST(head);

        Assert.assertEquals(3, root.val);
        Assert.assertEquals(1, root.left.val);
    }
}
