package com.portgas;

import java.util.ArrayList;

public class Solution034 {


    public static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    /**
     * 二叉树中和为某一值的路径：
     * 输入一颗二叉树和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
     * 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
     **/
    public ArrayList<ArrayList<Integer>> findPath(TreeNode root, int target) {
        ArrayList<ArrayList<Integer>> ret = new ArrayList<>();
        backtracking(root, target, new ArrayList<>(), ret);
        return ret;
    }

    private void backtracking(TreeNode node, int target, ArrayList<Integer> path, ArrayList<ArrayList<Integer>> ret) {
        if (node == null) {
            return;
        }

        path.add(node.val);
        target -= node.val;
        if (target == 0 && node.left == null && node.right == null) {
            ret.add(new ArrayList<>(path));
        } else {
            backtracking(node.left, target, path, ret);
            backtracking(node.right, target, path, ret);
        }
        path.remove(path.size() - 1);
    }

}
