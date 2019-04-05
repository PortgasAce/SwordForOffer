package com.portgas;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Solution029Test {

    @Test
    public void test() {
        int[][] array1 = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };

        List<Integer> result = new Solution029().printMatrix(array1);
        for (Integer integer : result) {
            System.out.print(integer + ",");
        }
    }


}
