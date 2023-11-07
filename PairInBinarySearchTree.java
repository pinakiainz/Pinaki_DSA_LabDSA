package com.binarysearchtree;

import java.util.HashSet;
import java.util.Set;

public class PairInBinarySearchTree {
    public Node root;

    public boolean isPairPresent(Node node, int target) {
        return isPairPresentUtil(node, target, new HashSet<>());
    }

    public boolean isPairPresentUtil(Node node, int target, Set<Integer> set) {
        if (node == null)
            return false;

        if (isPairPresentUtil(node.left, target, set))
            return true;

        if (set.contains(target - node.data))
            return true;

        set.add(node.data);

        return isPairPresentUtil(node.right, target, set);
    }
}