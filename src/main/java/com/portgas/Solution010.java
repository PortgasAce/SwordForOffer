package com.portgas;

public class Solution010 {

    /**
     * 求斐波那契数列的第 n 项，n <= 39。
     **/

    public int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int a = 1;
        int b = 1;
        int result = 0;
        for (int i = 2; i <= n; i++) {
            result = a + b;
            a = b;
            b = result;
        }

        return result;
    }

    /**
     * 矩形覆盖:
     * 我们可以用 2*1 的小矩形横着或者竖着去覆盖更大的矩形。
     * 请问用 n 个 2*1 的小矩形无重叠地覆盖一个 2*n 的大矩形，
     * 总共有多少种方法？
     **/

    // target = 1   1
    // target = 2   2
    // target = 3   3
    // target = 4   5
    // target = 5   8
    // 归纳总结：类似斐波那契数列，当target大于2时，f(n) = f(n-1)+f(n-2)
    public int rectCover(int target) {
        if (target == 1 || target == 2) {
            return target;
        }
        int a = 1;
        int b = 2;
        int result = 0;
        for (int i = 3; i <= target; i++) {
            result = a + b;
            a = b;
            b = result;
        }
        return result;
    }


}
