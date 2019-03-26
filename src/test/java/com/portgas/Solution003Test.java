package com.portgas;

import org.junit.Test;

public class Solution003Test {

    @Test
    public void test() {
        int[] array1 = {2, 3, 1, 0, 2, 5, 3};
        boolean result1 = new Solution003().duplicate(array1);
        int[] array2 = {0, 1, 2, 3, 4, 5};
        boolean result2 = new Solution003().duplicate(array2);
        int[] array3 = {};
        boolean result3 = new Solution003().duplicate(array3);

        System.out.println("result1 = " + result1
                + "\nresult2 = " + result2
                + "\nresult3 = " + result3);
    }

}
