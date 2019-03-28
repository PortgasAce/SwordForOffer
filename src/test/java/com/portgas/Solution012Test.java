package com.portgas;

import org.junit.Test;

public class Solution012Test {

    @Test
    public void test() {
        //ABCE
        //SFCS
        //ADEE
        boolean result1 = new Solution012().hasPath("ABCESFCSADEE".toCharArray(), 3, 4, "ESE".toCharArray());

        System.out.println("result1 = " + result1);
    }

}
