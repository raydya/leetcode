package com.raydya;

import java.util.ArrayList;
import java.util.List;

public class NAryTreePostorderTraversal {

    private final List<Integer> ret = new ArrayList<>();

    public List<Integer> postorder(Node root) {
        recursion(root);
        return ret;
    }

    private void recursion(Node root) {
        if (root == null) {
            return;
        }

        if (root.children != null) {
            for (final Node child : root.children) {
                recursion(child);
            }
        }

        ret.add(root.val);
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
