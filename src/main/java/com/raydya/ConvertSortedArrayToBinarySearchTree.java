package com.raydya;

import com.raydya.data.type.TreeNode;

import java.util.Arrays;

public class ConvertSortedArrayToBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        final int length = nums.length;

        if (length == 0) return null;

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
