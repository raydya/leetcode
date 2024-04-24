package com.raydya;

import com.raydya.data.type.TreeNode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class AmountOfTimeForBinaryTreeToBeInfected {

    public int amountOfTime(TreeNode root, int start) {
        if (root == null) {
            return 0;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        Map<TreeNode, TreeNode> parentMap = new HashMap<>();
        Set<TreeNode> infected = new HashSet<>();

        // 找到起始节点并建立父节点映射
        TreeNode startNode = findStartNode(root, start, null, parentMap);
        if (startNode == null) {
            return 0;
        }

        queue.offer(startNode);
        infected.add(startNode);
        int minutes = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();

            boolean f = false;
            for (int i = 0; i < size; i++) {
                TreeNode current = queue.poll();

                // 感染左子节点
                if (current.left != null && !infected.contains(current.left)) {
                    queue.offer(current.left);
                    infected.add(current.left);
                    f = true;
                }
                // 感染右子节点
                if (current.right != null && !infected.contains(current.right)) {
                    queue.offer(current.right);
                    infected.add(current.right);
                    f = true;
                }
                // 感染父节点
                if (parentMap.containsKey(current) && !infected.contains(parentMap.get(current))) {
                    queue.offer(parentMap.get(current));
                    infected.add(parentMap.get(current));
                    f = true;
                }
            }

            if (f) {
                minutes++;
            }
        }

        return minutes;
    }

    // 辅助方法来找到值为 start 的节点
    private TreeNode findStartNode(TreeNode root, int start, TreeNode parent, Map<TreeNode, TreeNode> parentMap) {
        if (root == null) {
            return null;
        }
        if (root.val == start) {
            if (parent != null) {
                parentMap.put(root, parent);
            }
            return root;
        }

        if (parent != null) {
            parentMap.put(root, parent);
        }

        TreeNode left = findStartNode(root.left, start, root, parentMap);
        if (left != null) {
            return left;
        }

        return findStartNode(root.right, start, root, parentMap);
    }

}
