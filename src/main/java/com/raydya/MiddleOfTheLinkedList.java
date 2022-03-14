package com.raydya;

import com.raydya.data.type.ListNode;
import java.util.ArrayList;
import java.util.List;

public class MiddleOfTheLinkedList {

    public ListNode middleNode(ListNode head) {
        List<ListNode> nodes = new ArrayList<>();

        ListNode node = head;

        while (node != null) {
            nodes.add(node);
            node = node.next;
        }

        final int i = nodes.size() / 2;
        return nodes.get(i);
    }
}
