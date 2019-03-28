package com.portgas;

public class Solution015 {

    /**
     * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
     **/

//    n       : 10110100
//    n-1     : 10110011
//    n&(n-1) : 10110000
//    消除最低一位的 1
    public int numberOf1(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n &= n - 1;
        }
        return count;
    }

    public int numberOf12(int n) {
        return Integer.bitCount(n);
    }

}
