package com.raydya.utils;

import com.raydya.data.type.Node;

public class NodeUtil {

    public static Node build(Integer[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        final int val = nums[0];
        final Node root = new Node(val);
        root.left = buildSub(nums, 1, 1, 1);
        root.right = buildSub(nums, 2, 1, 1);
        return root;
    }

    private static Node buildSub(Integer[] nums, int index, int level, int levelStart) {
        if (index >= nums.length) {
            return null;
        }
        final Integer val = nums[index];
        if (val == null) {
            return null;
        }
        final Node node = new Node(val);
        final int capacity = (int) Math.pow(2, level);
        final int offset = index - levelStart;
        final int nextLevelStart = levelStart + capacity;
        final int leftIndex = offset * 2 + nextLevelStart;
        final int rightIndex = offset * 2 + 1 + nextLevelStart;
        node.left = buildSub(nums, leftIndex, level + 1, nextLevelStart);
        node.right = buildSub(nums, rightIndex, level + 1, nextLevelStart);
        return node;
    }
}
