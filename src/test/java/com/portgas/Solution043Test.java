package com.portgas;

import org.junit.Test;

public class Solution042Test {

    @Test
    public void test() {
        int[] array1 = new int[]{-2, -8, -1, -5, -9};
        int res1 = new Solution042().findGreatestSumOfSubArray(array1);
        System.out.println("res1 = " + res1);

        int[] array2 = new int[]{6, -3, -2, 7, -15, 1, 2, 2};
        int res2 = new Solution042().findGreatestSumOfSubArray(array2);
        System.out.println("res2 = " + res2);
    }

}
