package com.portgas;

import org.junit.Test;

public class Solution010Test {

    @Test
    public void test() {
        // 1 1 2 3 5 8 13 21
        int n3 = new Solution010().fibonacci(3);
        int n5 = new Solution010().fibonacci(5);
        int n7 = new Solution010().fibonacci(7);

        System.out.println("n3 = " + n3
                + "\nn5 = " + n5
                + "\nn7 = " + n7);
    }

}
