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

}
