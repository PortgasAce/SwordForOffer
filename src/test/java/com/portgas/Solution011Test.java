package com.portgas;

import org.junit.Test;

public class Solution011Test {

    @Test
    public void test() {
        int result1 = new Solution011().minNumberInRotateArray(new int[]{2, 3, 4, 5, 1});
        int result2 = new Solution011().minNumberInRotateArray(new int[]{3, 4, 5, 1, 2});

        int result3 = new Solution011().minNumberInRotateArray(new int[]{3, 4, 5, 1, 3});
        int result4 = new Solution011().minNumberInRotateArray(new int[]{3, 3, 3, 1, 3}); // 当middle与low high相等有问题

        int result5 = new Solution011().minNumberInRotateArray2(new int[]{3, 3, 3, 1, 3});

        System.out.println("result1 = " + result1
                + "\nresult2 = " + result2
                + "\nresult3 = " + result3
                + "\nresult4 = " + result4
                + "\nresult5 = " + result5);
    }

}
