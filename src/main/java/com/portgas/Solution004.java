package com.portgas;

public class Solution004 {

    /**
     * 给定一个二维数组，其每一行从左到右递增排序，从上到下也是递增排序。
     * 给定一个数，判断这个数是否在该二维数组中。
     **/

    public boolean find(int[][] array, int target) {
        if (array == null || array.length <= 0 || array[0].length <= 0) {
            return false;
        }

        for (int i = 0, j = array[0].length - 1; i < array.length && j >= 0; ) {
            if (array[i][j] < target) {
                i++;
            } else if (array[i][j] > target) {
                j--;
            } else if (array[i][j] == target) {
                return true;
            }
        }
        return false;
    }

    public boolean find2(int[][] matrix, int target) {
        if (matrix == null || matrix.length <= 0 || matrix[0].length <= 0) {
            return false;
        }

        int rows = matrix.length;   // 行数
        int cols = matrix[0].length;// 列数

        int row = 0;
        int col = cols - 1; // 从右上角(0, cols-1)开始

        while (row < rows && col >= 0) {
            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] < target) {
                row++;
            } else {
                col--;
            }
        }
        return false;
    }

}
