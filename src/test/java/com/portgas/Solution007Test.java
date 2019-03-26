package com.portgas;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution007Test {

    @Test
    public void test() {
        int[] preOrder = {1, 2, 3, 4, 5};
        int[] inOrder = {2, 1, 4, 3, 5};

        Solution007.TreeNode root = new Solution007().reConstructBinaryTree(preOrder, inOrder);
        printTree(root);
    }

    private void printTree(Solution007.TreeNode root) {
        if (root != null) {
            printTree(root.left);
            System.out.print(root.val + ",");
            printTree(root.right);
        }
    }

}
