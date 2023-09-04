package com.raydya;

import com.raydya.data.type.TreeNode;
import com.raydya.utils.TreeNodeUtil;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class SerializeAndDeserializeBstTest {

    @Test
    public void test1() {
        final SerializeAndDeserializeBst serializer = new SerializeAndDeserializeBst();
        final SerializeAndDeserializeBst deserializer = new SerializeAndDeserializeBst();

        final TreeNode root = TreeNodeUtil.build(Arrays.asList(2, 1, 3));
        final String tree = serializer.serialize(root);
        final TreeNode ans = deserializer.deserialize(tree);

        Assert.assertEquals(2, ans.val);
        Assert.assertEquals(1, ans.left.val);
        Assert.assertEquals(3, ans.right.val);
    }

    @Test
    public void test2() {
        final SerializeAndDeserializeBst serializer = new SerializeAndDeserializeBst();
        final SerializeAndDeserializeBst deserializer = new SerializeAndDeserializeBst();

        final String tree = serializer.serialize(null);
        final TreeNode ans = deserializer.deserialize(tree);

        Assert.assertNull(ans);
    }

    @Test
    public void test3() {
        final SerializeAndDeserializeBst serializer = new SerializeAndDeserializeBst();
        final SerializeAndDeserializeBst deserializer = new SerializeAndDeserializeBst();

        final TreeNode root = TreeNodeUtil.build(Arrays.asList(3, 1, 4, null, 2));
        final String tree = serializer.serialize(root);
        final TreeNode ans = deserializer.deserialize(tree);

        Assert.assertEquals(3, ans.val);
        Assert.assertEquals(1, ans.left.val);
        Assert.assertEquals(4, ans.right.val);
        Assert.assertNull(ans.left.left);
        Assert.assertEquals(2, ans.left.right.val);
    }
}
