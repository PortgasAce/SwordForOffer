package com.portgas;

import com.portgas.Solution036.TreeNode;
import org.junit.Test;

public class Solution036Test {

    @Test
    public void test() {
        //      4
        //   2      6
        // 1   3  5   7
        TreeNode node1 = new TreeNode(4);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(6);
        TreeNode node4 = new TreeNode(1);
        TreeNode node5 = new TreeNode(3);
        TreeNode node6 = new TreeNode(5);
        TreeNode node7 = new TreeNode(7);

        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.left = node6;
        node3.right = node7;

        TreeNode result1 = new Solution036().convert(node1);
        while (result1 != null) {
            System.out.print(result1.val + ",");
            result1 = result1.right;
        }

    }

}
