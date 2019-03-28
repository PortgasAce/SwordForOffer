package com.portgas;

public class Solution014 {

    /**
     * 把一根绳子剪成多段，并且使得每段的长度乘积最大。
     **/

    public int integerBreak(int n) {
        int[] dp = new int[n + 1];
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                dp[i] = Math.max(dp[i],   // 上一次计算的结果
                        Math.max(j, dp[j]) * Math.max(i - j, dp[i - j]));  // j的最优解 * i-j 的最优解
            }
        }
        return dp[n];
    }

}
