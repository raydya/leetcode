package com.raydya;

import java.util.ArrayList;
import java.util.List;

public class NAryTreePreorderTraversal {
    private final List<Integer> ret = new ArrayList<>();

    public List<Integer> preorder(Node root) {
        recursion(root);
        return ret;
    }

    private void recursion(Node node) {
        if (node == null) return;

        ret.add(node.val);

        final List<Node> children = node.children;

        if (children == null) return;

        for (final Node child : children) {
            recursion(child);
        }
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
