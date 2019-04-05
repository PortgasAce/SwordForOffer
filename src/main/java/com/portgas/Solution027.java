package com.portgas;

import java.util.Stack;

public class Solution027 {

    public static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    /**
     * 二叉树的镜像：
     * 操作给定的二叉树，将其变换为源二叉树的镜像。
     **/

    // 递归法：
    public void mirror(TreeNode root) {
        if (root == null) {
            return;
        }
        swap(root);
        mirror(root.left);
        mirror(root.right);
    }

    private void swap(TreeNode root) {
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
    }

    // 迭代法：
    public void mirror2(TreeNode root) {
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            // swap
            TreeNode temp = node.left;
            node.left = node.right;
            node.right = temp;

            if (node.left != null) {
                stack.push(node.left);
            }
            if (node.right != null) {
                stack.push(node.right);
            }
        }
    }

}
