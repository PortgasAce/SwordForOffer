package com.portgas;

import com.portgas.Solution027.TreeNode;
import org.junit.Test;

public class Solution027Test {

    @Test
    public void test() {
        //     1
        //   2    3
        // 4   5

        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(5);

        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;

        printTree(treeNode1);
        System.out.println();

        new Solution027().mirror(treeNode1);
        printTree(treeNode1);
        System.out.println();

        new Solution027().mirror2(treeNode1);
        printTree(treeNode1);
        System.out.println();
    }

    private void printTree(TreeNode root) {
        if (root != null) {
            printTree(root.left);
            System.out.print(root.val + ",");
            printTree(root.right);
        }
    }

}
