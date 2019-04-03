package com.portgas;

import org.junit.Assert;
import org.junit.Test;
import com.portgas.Solution026.TreeNode;

public class Solution026Test {

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

        //    2
        //  4   5
        TreeNode treeNode6 = new TreeNode(2);
        TreeNode treeNode7 = new TreeNode(4);
        TreeNode treeNode8 = new TreeNode(5);

        treeNode6.left = treeNode7;
        treeNode6.right = treeNode8;

        boolean result1 = new Solution026().hasSubtree(treeNode1, treeNode6);
        Assert.assertTrue(result1);
        System.out.println("result1 = " + result1);

        //   2
        // 5  4
        treeNode6.left = treeNode8;
        treeNode6.right = treeNode7;
        boolean result2 = new Solution026().hasSubtree(treeNode1, treeNode6);
        Assert.assertFalse(result2);
        System.out.println("result2 = " + result2);
    }

}
