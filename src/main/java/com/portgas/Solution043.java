package com.portgas;


public class Solution042 {

    /**
     * 连续子数组的最大和：
     * {6, -3, -2, 7, -15, 1, 2, 2}，连续子数组的最大和为 8（从第 0 个开始，到第 3 个为止）。
     **/

    // 动态规划：
    // f(i) 为 以array[i]结尾的子数组的和的最大值
    // f(i) = max(f(i-1) + array[i],array[i])
    // F(i) 为 array[i]及之前所有子数组的和最大值
    // F(i) = max(F(i-1),f(i))
    public int findGreatestSumOfSubArray(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }

        int maxSum = array[0]; // 所有子数组最大值
        int sum = array[0];    // 以当前数字结尾的子数组最大值
        for (int i = 1; i < array.length; i++) {
            sum = Math.max(sum + array[i], array[i]);
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }


}
