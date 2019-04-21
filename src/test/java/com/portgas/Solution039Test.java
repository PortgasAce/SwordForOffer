package com.portgas;

import org.junit.Test;

import java.util.ArrayList;

public class Solution039Test {

    @Test
    public void test() {

        int[] array1 = new int[]{1, 2, 2, 2, 3, 3};
        int result1 = new Solution039().moreThanHalfNumSolution(array1);
        System.out.println("result1 = " + result1);

        int[] array2 = new int[]{1, 2, 2, 2, 2, 3, 3};
        int result2 = new Solution039().moreThanHalfNumSolution(array2);
        System.out.println("result2 = " + result2);

    }

}
