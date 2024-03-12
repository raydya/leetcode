package com.raydya;

import com.raydya.data.type.TreeNode;

import java.util.HashSet;
import java.util.Set;

public class FindElementsInAContaminatedBinaryTree {


    public static class FindElements {

        private final Set<Integer> VALS = new HashSet<>();

        public FindElements(TreeNode root) {
            dfs(root, 0);
        }

        public boolean find(int target) {
            return VALS.contains(target);
        }

        public void dfs(TreeNode node, int val) {
            if (node == null) {
                return;
            }
            node.val = val;
            VALS.add(val);
            dfs(node.left, 2 * val + 1);
            dfs(node.right, 2 * val + 2);
        }
    }

}
