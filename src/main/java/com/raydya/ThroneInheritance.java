package com.raydya;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ThroneInheritance {

    private Node root;
    private Map<String, Node> map;

    public ThroneInheritance(String kingName) {
        this.root = new Node(kingName);
        this.map = new HashMap<>();
        this.map.put(kingName, root);
    }

    public void birth(String parentName, String childName) {
        final Node parent = map.get(parentName);
        final Node child = new Node(childName);
        parent.addChild(child);
        map.put(childName, child);
    }

    public void death(String name) {
        final Node node = map.get(name);
        node.death();
    }

    public List<String> getInheritanceOrder() {
        final List<String> ret = new ArrayList<>();
        dfs(root, ret);
        return ret;
    }

    private void dfs(Node node, List<String> ret) {
        if (!node.isDead) {
            ret.add(node.name);
        }
        for (Node child : node.children) {
            dfs(child, ret);
        }
    }

    static class Node {

        String name;
        List<Node> children;
        boolean isDead;

        public Node(final String name) {
            this.name = name;
            this.children = new ArrayList<>();
        }

        public void addChild(Node child) {
            this.children.add(child);
        }

        public void death() {
            this.isDead = true;
        }
    }
}
