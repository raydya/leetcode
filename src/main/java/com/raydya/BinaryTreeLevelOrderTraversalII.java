package com.raydya;

import com.raydya.data.type.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class BinaryTreeLevelOrderTraversalII {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root == null) return Collections.emptyList();

        List<TreeNode> nodes = Collections.singletonList(root);
        List<List<Integer>> ret = new ArrayList<>();

        while (!nodes.isEmpty()) {
            ret.add(0, getLevelOrder(nodes));
            nodes = nodes.stream()
                .map(node -> Arrays.asList(node.left, node.right))
                .flatMap(List::stream)
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
        }

        return ret;
    }

    private List<Integer> getLevelOrder(List<TreeNode> nodes) {
        return nodes.stream()
            .filter(Objects::nonNull)
            .map(node -> node.val).collect(Collectors.toList());
    }

}
