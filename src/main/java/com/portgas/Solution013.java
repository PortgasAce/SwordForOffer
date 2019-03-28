package com.portgas;

public class Solution013 {

    /**
     * 机器人的运动范围:
     * 地上有一个 m 行和 n 列的方格。一个机器人从坐标 (0, 0) 的格子开始移动，
     * 每一次只能向左右上下四个方向移动一格，但是不能进入行坐标和列坐标的数位
     * 之和大于 k 的格子。
     * <p>
     * 例如，当 k 为 18 时，机器人能够进入方格 (35,37)，因为 3+5+3+7=18。
     * 但是，它不能进入方格 (35,38)，因为 3+5+3+8=19。请问该机器人能够达到
     * 多少个格子？
     **/

    public int movingCount(int threshold, int rows, int cols) {
        int[] visited = new int[rows * cols];
        return movingCountCore(threshold, rows, cols, 0, 0, visited);
    }

    private int movingCountCore(int threshold, int rows, int cols, int row, int col, int[] visited) {
        if (row < 0 || row >= rows || col < 0 || col >= cols) {
            return 0;
        }

        int index = row * cols + col;
        if (visited[index] == 1 || checkSumExceed(threshold, row, col)) {
            return 0;
        }
        visited[index] = 1;

        return 1 + movingCountCore(threshold, rows, cols, row + 1, col, visited)
                + movingCountCore(threshold, rows, cols, row - 1, col, visited)
                + movingCountCore(threshold, rows, cols, row, col + 1, visited)
                + movingCountCore(threshold, rows, cols, row, col - 1, visited);
    }

    private boolean checkSumExceed(int threshold, int row, int col) {
        int sum = 0;
        while (row != 0) {
            sum += row % 10;
            row /= 10;
        }

        while (col != 0) {
            sum += col % 10;
            col /= 10;
        }

        return sum > threshold;
    }

}
