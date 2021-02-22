package com.raydya;

import com.raydya.data.type.GraphNode;

import java.util.HashMap;
import java.util.Map;

public class CloneGraph {
    private Map<Integer, GraphNode> map = new HashMap<>();

    public GraphNode cloneGraph(GraphNode node) {
        if (node == null) return null;

        if (map.containsKey(node.val)) {
            return map.get(node.val);
        }

        final GraphNode clone = new GraphNode(node.val);
        map.put(clone.val, clone);
        for (final GraphNode neighbor : node.neighbors) {
            clone.neighbors.add(cloneGraph(neighbor));
        }
        return clone;
    }
}
