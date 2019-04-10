package com.portgas;

import org.junit.Test;

public class Solution033Test {

    @Test
    public void test() {
        //      10
        //   6      12
        // 5   7  11   13
        int[] arr1 = new int[]{5, 7, 6, 11, 13, 12, 10};
        boolean result1 = new Solution033().verifySquenceOfBST(arr1);
        System.out.println("result1 = " + result1);

    }

}
