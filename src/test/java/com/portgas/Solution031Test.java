package com.portgas;

import org.junit.Assert;
import org.junit.Test;

public class Solution031Test {

    @Test
    public void test() {
        int[] pushA = new int[]{1, 2, 3, 4, 5};
        int[] popA1 = new int[]{4, 5, 3, 2, 1};
        int[] popA2 = new int[]{4, 3, 5, 1, 2};

        boolean result1 = new Solution031().isPopOrder(pushA, popA1);
        Assert.assertTrue(result1);
        System.out.println("result1 = " + result1);

        boolean result2 = new Solution031().isPopOrder(pushA, popA2);
        Assert.assertFalse(result2);
        System.out.println("result2 = " + result2);

        boolean result3 = new Solution031().isPopOrder2(pushA, popA1);
        Assert.assertTrue(result3);
        System.out.println("result3 = " + result3);

        boolean result4 = new Solution031().isPopOrder2(pushA, popA2);
        Assert.assertFalse(result4);
        System.out.println("result4 = " + result4);
    }


}
