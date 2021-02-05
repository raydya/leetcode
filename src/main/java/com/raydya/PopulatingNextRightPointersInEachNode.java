package com.raydya;

import com.raydya.data.type.Node;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PopulatingNextRightPointersInEachNode {
    public Node connect(Node root) {
        final Map<Integer, List<Node>> nodeMap = new HashMap<>();
        generate(root, 0, nodeMap);
        nodeMap.forEach((k, v) -> {
            final int size = v.size();
            for (int i = 0; i < size; i++) {
                final Node node = v.get(i);
                if (i + 1 < size) {
                    node.next = v.get(i + 1);
                }
            }
        });
        return root;
    }

    private void generate(Node node, int level, Map<Integer, List<Node>> nodeMap) {
        if (node == null) return;
        final List<Node> nodes = nodeMap.getOrDefault(level, new ArrayList<>());
        nodes.add(node);
        nodeMap.put(level, nodes);
        generate(node.left, level + 1, nodeMap);
        generate(node.right, level + 1, nodeMap);
    }
}
