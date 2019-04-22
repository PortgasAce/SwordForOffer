package com.portgas;

import org.junit.Test;

import java.util.List;

public class Solution040Test {

    @Test
    public void test() {

        int[] array1 = new int[]{1, 2, 2, 2, 3, 3};
        List<Integer> result1 = new Solution040().getLeastNumbersSolution(array1, 3);
        for (Integer i : result1) {
            System.out.print(i + ",");
        }
    }

}
