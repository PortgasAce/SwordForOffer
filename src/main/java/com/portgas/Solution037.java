package com.portgas;

public class Solution037 {

    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    /**
     * 序列化二叉树：
     * 请实现两个函数，分别用来序列化和反序列化二叉树。
     **/

    public String serialize(TreeNode root) {
        if (root == null)
            return "";
        StringBuilder sb = new StringBuilder();
        serializeImpl(root, sb);
        return sb.toString();
    }

    private void serializeImpl(TreeNode root, StringBuilder sb) {
        if (root == null) {
            sb.append("#,");
            return;
        }
        sb.append(root.val);
        sb.append(',');
        serializeImpl(root.left, sb);
        serializeImpl(root.right, sb);
    }

    int index = -1;

    public TreeNode deserialize(String str) {
        if (str.length() == 0)
            return null;
        String[] strs = str.split(",");
        return deserializeImpl(strs);
    }

    private TreeNode deserializeImpl(String[] strs) {
        index++;
        if (!strs[index].equals("#")) {
            TreeNode root = new TreeNode(0);
            root.val = Integer.parseInt(strs[index]);
            root.left = deserializeImpl(strs);
            root.right = deserializeImpl(strs);
            return root;
        }
        return null;
    }

}
