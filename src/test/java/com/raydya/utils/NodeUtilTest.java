package com.raydya.utils;

import com.raydya.data.type.Node;
import org.junit.Assert;
import org.junit.Test;

public class NodeUtilTest {
    @Test
    public void test1() {
        final Node node = NodeUtil.build(new int[]{1, 2, 3, 4, 5, 6, 7});

        Assert.assertEquals(1, node.val);
        Assert.assertEquals(2, node.left.val);
        Assert.assertEquals(3, node.right.val);
        Assert.assertEquals(4, node.left.left.val);
        Assert.assertEquals(5, node.left.right.val);
        Assert.assertEquals(6, node.right.left.val);
        Assert.assertEquals(7, node.right.right.val);
    }
}
