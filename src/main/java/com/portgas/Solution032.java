package com.portgas;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

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

    /**
     * 把二叉树打印成多行：
     * 从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行。
     **/
    ArrayList<ArrayList<Integer>> print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> ret = new ArrayList<>();
        if (pRoot == null) {
            return ret;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(pRoot);
        while (!queue.isEmpty()) {
            int layerSize = queue.size();
            ArrayList<Integer> layer = new ArrayList<>();
            while (layerSize-- > 0) {
                TreeNode node = queue.poll();
                layer.add(node.val);
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            ret.add(layer);
        }

        return ret;
    }

    /**
     * 按之字形顺序打印二叉树：
     * 请实现一个函数按照之字形打印二叉树，即第一行按照从左到右的顺序打印，
     * 第二层按照从右至左的顺序打印，第三行按照从左到右的顺序打印，其他行以此类推。
     **/
    public ArrayList<ArrayList<Integer>> print2(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> ret = new ArrayList<>();
        if (pRoot == null) {
            return ret;
        }

        Stack<TreeNode> s1 = new Stack<>(); // odd
        s1.add(pRoot);
        Stack<TreeNode> s2 = new Stack<>(); // even

        while (!s1.isEmpty() || !s2.isEmpty()) {
            if (!s1.isEmpty()) {
                // odd
                ArrayList<Integer> layer = new ArrayList<>();
                while (!s1.isEmpty()) {
                    TreeNode p = s1.pop();
                    layer.add(p.val);
                    if (p.left != null) {
                        s2.add(p.left);
                    }
                    if (p.right != null) {
                        s2.add(p.right);
                    }
                }
                ret.add(layer);
            } else {
                // even
                ArrayList<Integer> layer = new ArrayList<>();
                while (!s2.isEmpty()) {
                    TreeNode p = s2.pop();
                    if (p.right != null) {
                        s1.add(p.right);
                    }
                    if (p.left != null) {
                        s1.add(p.left);
                    }
                    layer.add(p.val);
                }
                ret.add(layer);
            }
        }
        return ret;
    }

}
