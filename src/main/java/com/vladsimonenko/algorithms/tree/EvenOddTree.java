package com.vladsimonenko.algorithms.tree;

import java.util.Deque;
import java.util.LinkedList;

public class EvenOddTree {

    public static boolean isEvenOddTree(TreeNode root) {
        Deque<TreeNode> nodes = new LinkedList<>();
        int level = 0;
        nodes.addLast(root);

        do {
            int parity = (level + 1) % 2;
            int size = nodes.size();
            int prevValue = parity == 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            for (int i = 0; i < size; i++) {
                TreeNode currentNode = nodes.pollFirst();
                if (currentNode != null) {

                    if (currentNode.val % 2 != parity) {
                        return false;
                    } else {
                        if (parity == 0) {
                            if (currentNode.val < prevValue) {
                                prevValue = currentNode.val;
                            } else {
                                return false;
                            }
                        } else {
                            if (currentNode.val > prevValue) {
                                prevValue = currentNode.val;
                            } else {
                                return false;
                            }
                        }
                    }
                    nodes.addLast(currentNode.left);
                    nodes.addLast(currentNode.right);
                }
            }

            level++;
        } while (!nodes.isEmpty());

        return true;
    }
}
