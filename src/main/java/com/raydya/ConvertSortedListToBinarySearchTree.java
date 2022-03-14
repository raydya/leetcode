package com.raydya;

import com.raydya.data.type.ListNode;
import com.raydya.data.type.TreeNode;
import java.util.Arrays;

public class ConvertSortedListToBinarySearchTree {

    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode tmp = head;
        int index = 0;
        final int[] holder = new int[20000];
        while (tmp != null) {
            holder[index] = tmp.val;
            index++;
            tmp = tmp.next;
        }

        final int[] sortedArray = Arrays.copyOfRange(holder, 0, index);

        return sortedArrayToBST(sortedArray);
    }

    private TreeNode sortedArrayToBST(int[] nums) {
        final int length = nums.length;

        if (length == 0) {
            return null;
        }

        if (length == 1) {
            return new TreeNode(nums[0]);
        }

        final int i = length / 2;

        final int[] left = Arrays.copyOfRange(nums, 0, i);
        final int[] right = Arrays.copyOfRange(nums, i + 1, length);

        final TreeNode root = new TreeNode(nums[i]);
        root.left = sortedArrayToBST(left);
        root.right = sortedArrayToBST(right);

        return root;
    }
}
