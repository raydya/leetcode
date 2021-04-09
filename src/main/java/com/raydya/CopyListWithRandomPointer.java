package com.raydya;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CopyListWithRandomPointer {
    public static class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    public Node copyRandomList(Node head) {
        if (head == null) return null;
        Node current = head;
        Map<Node, Integer> nodeMap = new HashMap<>();
        List<Node> originals = new ArrayList<>();
        List<Node> nodes = new ArrayList<>();
        int count = 0;
        while (current != null) {
            nodeMap.put(current, count++);
            originals.add(current);
            nodes.add(new Node(current.val));
            current = current.next;
        }

        final int size = nodes.size();
        for (int i = 0; i < size; i++) {
            final Node node = nodes.get(i);
            node.next = i + 1 >= size ? null : nodes.get(i + 1);
            final Node original = originals.get(i);
            final Node originalRandom = original.random;
            node.random = originalRandom == null ? null : nodes.get(nodeMap.get(originalRandom));
        }

        return nodes.get(0);
    }
}
