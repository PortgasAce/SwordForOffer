package com.portgas;

import java.util.ArrayList;

public class Solution029 {

    /**
     * 顺时针打印矩阵：
     * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
     * 例如，如果输入如下4 X 4矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
     * 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
     **/

    public ArrayList<Integer> printMatrix(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return new ArrayList<>();
        }

        ArrayList<Integer> result = new ArrayList<>();
        int rowStart = 0, rowEnd = matrix.length - 1;
        int colStart = 0, colEnd = matrix[0].length - 1;
        // 每一圈分为4步
        while (rowStart <= rowEnd && colStart <= colEnd) {

            // 从左往右
            for (int i = colStart; i <= colEnd; i++) {
                result.add(matrix[rowStart][i]);
            }

            // 从上往下
            for (int i = rowStart + 1; i <= rowEnd; i++) {
                result.add(matrix[i][colEnd]);
            }

            // 从右往左（行数不相等的情况）
            if (rowStart != rowEnd) {
                for (int i = colEnd - 1; i >= colStart; i--) {
                    result.add(matrix[rowEnd][i]);
                }
            }
            // 从下往上（列数不相等的情况）
            if (colStart != colEnd) {
                for (int i = rowEnd - 1; i >= rowStart + 1; i--) {
                    result.add(matrix[i][colStart]);
                }
            }

            rowStart++;
            rowEnd--;
            colStart++;
            colEnd--;
        }
        return result;
    }
}
