package com.portgas;


public class Solution043 {

    /**
     * 整数中1出现的次数（从1到n整数中1出现的次数）：
     **/

    // https://leetcode.com/problems/number-of-digit-one/discuss/64381/4+-lines-O(log-n)-C++JavaPython
    // https://www.cnblogs.com/grandyang/p/4629032.html
    public int numberOf1Between1AndN_Solution(int n) {
        int cnt = 0;
        for (int m = 1; m <= n; m *= 10) {
            int a = n / m;
            int b = n % m;
            cnt += (a + 8) / 10 * m + (a % 10 == 1 ? b + 1 : 0); //(a + 8) / 10 判断a是否大于2
        }
        return cnt;
    }

}
