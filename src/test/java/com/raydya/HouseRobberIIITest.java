package com.raydya;

import com.raydya.data.type.TreeNode;
import com.raydya.utils.TreeNodeUtil;
import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;

public class HouseRobberIIITest {

    @Test
    public void test1() {
        final TreeNode root = TreeNodeUtil.build(Arrays.asList(3, 2, 3, null, 3, null, 1));

        final HouseRobberIII solution = new HouseRobberIII();
        final int amount = solution.rob(root);

        Assert.assertEquals(7, amount);
    }

    @Test
    public void test2() {
        final TreeNode root = TreeNodeUtil.build(Arrays.asList(3, 4, 5, 1, 3, null, 1));

        final HouseRobberIII solution = new HouseRobberIII();
        final int amount = solution.rob(root);

        Assert.assertEquals(9, amount);
    }
}
