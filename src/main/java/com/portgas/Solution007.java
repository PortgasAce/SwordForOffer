package com.portgas;

import java.util.HashMap;
import java.util.Map;

public class Solution007 {

    public static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    /**
     * 根据二叉树的前序遍历和中序遍历的结果，重建出该二叉树。
     * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
     **/

    Map<Integer, Integer> map = new HashMap<>(); // 中序遍历，值-index的映射关系

    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {

        if (pre == null || pre.length <= 0 || in == null || in.length <= 0) {
            return null;
        }

        for (int i = 0; i < in.length; i++) {
            map.put(in[i], i);
        }

        return reConstructBinaryTree(pre, 0, pre.length - 1, in, 0, in.length - 1);
    }

    public TreeNode reConstructBinaryTree(int[] pre, int preStart, int preEnd, int[] in, int inStart, int inEnd) {
        if (preStart > preEnd) {
            return null;
        }

        TreeNode root = new TreeNode(pre[preStart]);

        int inIndex = map.get(pre[preStart]);
        int leftSize = inIndex - inStart;   // 左子树大小

        root.left = reConstructBinaryTree(pre, preStart + 1, preStart + leftSize, in, inStart, inIndex - 1);
        root.right = reConstructBinaryTree(in, preStart + leftSize + 1, preEnd, in, inIndex + 1, inEnd);
        return root;
    }

}
