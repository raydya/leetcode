package com.raydya;

import java.util.List;

public class MaximumDepthOfNAryTree {

    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }
        final List<Node> children = root.children;
        if (children == null) {
            return 1;
        }

        int max = 0;
        for (final Node node : children) {
            final int depth = maxDepth(node);
            max = Math.max(max, depth);
        }

        return max + 1;
    }

    public static class Node {

        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
}
