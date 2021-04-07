package com.raydya;

import com.raydya.data.type.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class KthSmallestElementInABST {
    public int kthSmallest(TreeNode root, int k) {
        final Queue<Integer> q = new LinkedList<>();
        buildQueue(root, q);
        int kth = Integer.MIN_VALUE;
        for (int i = 0; i < k; i++) {
            kth = q.poll();
        }
        return kth;
    }

    private void buildQueue(TreeNode node, Queue<Integer> queue) {
        if (node == null) return;

        buildQueue(node.left, queue);

        queue.add(node.val);

        buildQueue(node.right, queue);
    }
}
