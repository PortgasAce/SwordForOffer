package com.portgas;

import org.junit.Test;
import com.portgas.Solution032.TreeNode;

import java.util.List;

public class Solution032Test {

    @Test
    public void test() {
        //      1
        //   2      3
        // 4   5  6   7
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);

        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.left = node6;
        node3.right = node7;

        List<Integer> result1 = new Solution032().printFromTopToBottom(node1);
        for (Integer i : result1) {
            System.out.print(i + ",");
        }
    }


}
