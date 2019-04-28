package com.portgas;

import org.junit.Test;

import java.util.List;

public class Solution041Test {

    @Test
    public void test() {

        Solution041 solution041 = new Solution041();

        int[] array = new int[]{3, 4, 1, 2, 6, 9, 0, 7};
        for (int num : array) {
            solution041.insert(num);
            System.out.println("insert: " + num + ", median = " + solution041.getMedian());
        }
    }

}
