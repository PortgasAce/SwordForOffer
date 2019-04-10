package com.portgas;

public class Solution033 {


    public static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    /**
     * 二叉搜索树的后序遍历序列：
     * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
     * 如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
     * <p>
     * 二叉查找树（Binary Search Tree），（又：二叉搜索树，二叉排序树）
     * 它或者是一棵空树，或者是具有下列性质的二叉树： 若它的左子树不空，则
     * 左子树上所有结点的值均小于它的根结点的值； 若它的右子树不空，则右子
     * 树上所有结点的值均大于它的根结点的值； 它的左、右子树也分别为二叉排序树。
     **/
    public boolean verifySquenceOfBST(int[] sequence) {
        if (sequence == null || sequence.length == 0) {
            return true;
        }
        return verifySquenceOfBST(sequence, 0, sequence.length - 1);
    }

    public boolean verifySquenceOfBST(int[] sequence, int start, int end) {
        if (end <= start) {
            return true;
        }

        int i = 0;
        for (; i < end; i++) {
            if (sequence[i] > end) {
                break;
            }
        }

        for (int j = i; j < end; j++) {
            if (sequence[j] < end) {
                return false;
            }
        }

        return verifySquenceOfBST(sequence, start, i - 1) && verifySquenceOfBST(sequence, i, end - 1);
    }

}
