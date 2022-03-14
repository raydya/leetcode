package com.raydya;

import com.raydya.data.type.ListNode;
import java.util.ArrayList;
import java.util.List;

public class LianBiaoZhongDaoShuDiKgeJieDian {

    public ListNode getKthFromEnd(ListNode head, int k) {
        List<ListNode> nodes = new ArrayList<>();
        ListNode current = head;

        while (current != null) {
            nodes.add(current);
            current = current.next;
        }

        return nodes.get(nodes.size() - k);
    }
}
