package com.raydya;

import com.raydya.data.type.TreeNode;
import com.raydya.utils.TreeNodeUtil;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CountCompleteTreeNodesTest {

    @Test
    public void test1() {
        final TreeNode root = TreeNodeUtil.build(Arrays.asList(1, 2, 3, 4, 5, 6));

        final CountCompleteTreeNodes solution = new CountCompleteTreeNodes();
        final int output = solution.countNodes(root);

        Assert.assertEquals(6, output);
    }

    @Test
    public void test2() {
        final TreeNode root = TreeNodeUtil.build(new ArrayList<>());

        final CountCompleteTreeNodes solution = new CountCompleteTreeNodes();
        final int output = solution.countNodes(root);

        Assert.assertEquals(0, output);
    }

    @Test
    public void test3() {
        final TreeNode root = TreeNodeUtil.build(Collections.singletonList(1));

        final CountCompleteTreeNodes solution = new CountCompleteTreeNodes();
        final int output = solution.countNodes(root);

        Assert.assertEquals(1, output);
    }
}
