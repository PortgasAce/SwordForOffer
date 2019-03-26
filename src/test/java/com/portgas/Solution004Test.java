package com.portgas;

import org.junit.Test;

public class Solution004Test {

    @Test
    public void test() {
        int[][] array1 = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        boolean result1 = new Solution004().find(array1, 8);
        boolean result2 = new Solution004().find(array1, 20);
        System.out.println("result1 = " + result1
                + "\nresult2 = " + result2);

        boolean result3 = new Solution004().find2(array1, 8);
        boolean result4 = new Solution004().find2(array1, 20);
        System.out.println("result3 = " + result3
                + "\nresult4 = " + result4);
    }

}
