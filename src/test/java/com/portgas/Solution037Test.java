package com.portgas;

import com.portgas.Solution037.TreeNode;
import org.junit.Test;

public class Solution037Test {

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

        String result1 = new Solution037().serialize(node1);
        System.out.println(result1);

        TreeNode result2 = new Solution037().deserialize(result1);
        printTree(result2);
    }

    private void printTree(TreeNode root) {
        if (root != null) {
            printTree(root.left);
            System.out.print(root.val + ",");
            printTree(root.right);
        }
    }
}
