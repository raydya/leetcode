package com.raydya;

import com.raydya.data.type.TreeNode;
import com.raydya.utils.TreeNodeUtil;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

public class FindACorrespondingNodeOfABinaryTreeInACloneOfThatTreeTest {

    @Test
    public void test1() {
        final TreeNode original = TreeNodeUtil.build(Arrays.asList(7, 4, 3, null, null, 6, 19));
        final TreeNode cloned = TreeNodeUtil.build(Arrays.asList(7, 4, 3, null, null, 6, 19));
        final TreeNode target = original.right;

        final FindACorrespondingNodeOfABinaryTreeInACloneOfThatTree solution = new FindACorrespondingNodeOfABinaryTreeInACloneOfThatTree();
        final TreeNode output = solution.getTargetCopy(original, cloned, target);

        Assert.assertEquals(cloned.right, output);
    }

    @Test
    public void test2() {
        final TreeNode original = TreeNodeUtil.build(Collections.singletonList(7));
        final TreeNode cloned = TreeNodeUtil.build(Collections.singletonList(7));
        final TreeNode target = original;

        final FindACorrespondingNodeOfABinaryTreeInACloneOfThatTree solution = new FindACorrespondingNodeOfABinaryTreeInACloneOfThatTree();
        final TreeNode output = solution.getTargetCopy(original, cloned, target);

        Assert.assertEquals(cloned, output);
    }

    @Test
    public void test3() {
        final TreeNode original = new TreeNode(8);
        final TreeNode n1 = new TreeNode(6);
        final TreeNode n2 = new TreeNode(5);
        final TreeNode n3 = new TreeNode(4);
        final TreeNode n4 = new TreeNode(3);
        final TreeNode n5 = new TreeNode(2);
        final TreeNode n6 = new TreeNode(1);

        original.right = n1;
        n1.right = n2;
        n2.right = n3;
        n3.right = n4;
        n4.right = n5;
        n5.right = n6;

        final TreeNode cloned = new TreeNode(8);
        final TreeNode m1 = new TreeNode(6);
        final TreeNode m2 = new TreeNode(5);
        final TreeNode m3 = new TreeNode(4);
        final TreeNode m4 = new TreeNode(3);
        final TreeNode m5 = new TreeNode(2);
        final TreeNode m6 = new TreeNode(1);

        cloned.right = m1;
        m1.right = m2;
        m2.right = m3;
        m3.right = m4;
        m4.right = m5;
        m5.right = m6;
        final TreeNode target = original.right.right.right;

        final FindACorrespondingNodeOfABinaryTreeInACloneOfThatTree solution = new FindACorrespondingNodeOfABinaryTreeInACloneOfThatTree();
        final TreeNode output = solution.getTargetCopy(original, cloned, target);

        Assert.assertEquals(cloned.right.right.right, output);
    }
}
