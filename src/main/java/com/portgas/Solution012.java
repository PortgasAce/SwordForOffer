package com.portgas;

public class Solution012 {

    /**
     * 请设计一个函数，用来判断在一个矩阵中是否存在一条包含某字符串所有字符的路径。
     * 路径可以从矩阵中的任意一个格子开始，每一步可以在矩阵中向左，向右，向上，向下
     * 移动一个格子。如果一条路径经过了矩阵中的某一个格子，则该路径不能再进入该格子。
     **/

    public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }
        int[] flag = new int[matrix.length];
        // 遍历矩阵，以矩阵的任意一点为起始点
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (hasPathCore(matrix, rows, cols, i, j, str, 0, flag)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean hasPathCore(char[] matrix, int rows, int cols, int i, int j, char[] str, int k, int[] flag) {

        if (i < 0 || i >= rows || j < 0 || j >= cols) {
            return false;
        }
        int index = i * cols + j;   // 行 * 列数 + 列
        if (flag[index] == 1 || matrix[index] != str[k]) {
            return false;
        }
        // 结束条件
        if (k == str.length - 1) {
            return true;
        }

        flag[index] = 1;
        if (hasPathCore(matrix, rows, cols, i - 1, j, str, k + 1, flag) // 向上
                || hasPathCore(matrix, rows, cols, i, j + 1, str, k + 1, flag) // 向左
                || hasPathCore(matrix, rows, cols, i + 1, j, str, k + 1, flag)      // 向下
                || hasPathCore(matrix, rows, cols, i, j - 1, str, k + 1, flag)     // 向右
                ) {
            return true;
        }
        flag[index] = 0;
        return false;
    }

}
