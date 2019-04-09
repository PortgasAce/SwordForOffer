package com.portgas;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Solution032 {


    public static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    /**
     * 从上往下打印二叉树：
     * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
     **/

    public ArrayList<Integer> printFromTopToBottom(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        ArrayList<Integer> ret = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode treeNode = queue.poll();
            ret.add(treeNode.val);
            if (treeNode.left != null) {
                queue.add(treeNode.left);
            }
            if (treeNode.right != null) {
                queue.add(treeNode.right);
            }
        }
        return ret;
    }

}
