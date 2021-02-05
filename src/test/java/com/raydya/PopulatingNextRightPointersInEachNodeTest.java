package com.raydya;

import com.raydya.data.type.Node;
import com.raydya.utils.NodeUtil;
import org.junit.Assert;
import org.junit.Test;

public class PopulatingNextRightPointersInEachNodeTest {
    @Test
    public void test1() {
        final Node root = NodeUtil.build(new int[]{1, 2, 3, 4, 5, 6, 7});

        final PopulatingNextRightPointersInEachNode solution = new PopulatingNextRightPointersInEachNode();
        final Node node = solution.connect(root);

        Assert.assertEquals(1, node.val);
        Assert.assertNull(node.next);
        Assert.assertEquals(2, node.left.val);
        Assert.assertEquals(3, node.left.next.val);
        Assert.assertNull(node.left.next.next);
        Assert.assertEquals(4, node.left.left.val);
        Assert.assertEquals(5, node.left.left.next.val);
        Assert.assertEquals(6, node.left.left.next.next.val);
        Assert.assertEquals(7, node.left.left.next.next.next.val);
        Assert.assertNull(node.left.left.next.next.next.next);
    }
}
