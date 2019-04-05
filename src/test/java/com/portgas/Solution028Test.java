package com.portgas;

import com.portgas.Solution028.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class Solution028Test {

    @Test
    public void test() {
        //      1
        //   2      2
        // 4   5  5   4

        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(2);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(4);
        TreeNode treeNode6 = new TreeNode(5);
        TreeNode treeNode7 = new TreeNode(5);

        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.left = treeNode4;
        treeNode2.right = treeNode6;
        treeNode3.left = treeNode7;
        treeNode3.right = treeNode5;

        boolean result1 = new Solution028().isSymmetrical(treeNode1);
        Assert.assertTrue(result1);
        System.out.println("result1 = " + result1);

        boolean result2 = new Solution028().isSymmetrical2(treeNode1);
        Assert.assertTrue(result2);
        System.out.println("result2 = " + result2);

        boolean result3 = new Solution028().isSymmetrical2(treeNode1);
        Assert.assertTrue(result3);
        System.out.println("result3 = " + result3);

        // 交换5、4，变为不对称
        treeNode3.left = treeNode5;
        treeNode3.right = treeNode7;

        boolean result4 = new Solution028().isSymmetrical(treeNode1);
        System.out.println("result4 = " + result4);
        boolean result5 = new Solution028().isSymmetrical2(treeNode1);
        System.out.println("result5 = " + result5);
        boolean result6 = new Solution028().isSymmetrical3(treeNode1);
        System.out.println("result6 = " + result6);
    }


}
